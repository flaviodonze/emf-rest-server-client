/*******************************************************************************
 * $URL$
 *
 * Copyright (c) 2007 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.model.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author created by Author: phe, last update by $Author$
 * @version $Revision$, $Date$
 */
public class LabelsType implements Serializable {

	private static final long serialVersionUID = 600203596896043245L;

	private String[] labelLines;
	private String defaultLocale = null;

	public LabelsType() {
	}

	public LabelsType(LabelsType copyObject) {
		defaultLocale = copyObject.defaultLocale;
		if (copyObject.labelLines != null) {
			labelLines = Arrays.copyOf(copyObject.labelLines, copyObject.labelLines.length);
		}
	}

	public LabelsType(String values) {
		if (values == null || values.isEmpty()) {
			return;
		}

		// determine defaultLocale
		int pos = values.indexOf('|');
		if (pos > 0) {
			defaultLocale = values.substring(0, pos);
			if (values.length() >= pos) {
				String content = values.substring(pos + 1);
				String[] strings = content.split("\n"); //$NON-NLS-1$
				for (String string : strings) {
					int postest = string.indexOf('|');
					if (postest < 0 || string.length() < postest + 2) {
						throw new IllegalArgumentException("invalid value for LabelsType: >" + values + "<"); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
				labelLines = strings;
				return; // everything is fine
			}
		}
		throw new IllegalArgumentException("invalid value for LabelsType"); //$NON-NLS-1$
	}

	/**
	 * @return
	 */
	public String getDefaultLocale() {
		return defaultLocale;
	}

	/**
	 * returns a list of all locales contained in this type, for the passed state
	 *
	 * @param state
	 * @return
	 */
	public List<String> getLocales(int state) {
		List<String> list = new ArrayList<String>();
		for (String labelLine : labelLines) {
			String key = getKeyFromLabelLine(labelLine);
			String statePart = "" + state + " "; //$NON-NLS-1$ //$NON-NLS-2$
			if (key.startsWith(statePart)) {
				list.add(key.substring(statePart.length()));
			}
		}
		return list;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return new String();
		}

		StringBuffer sb = new StringBuffer();
		sb.append(defaultLocale).append('|');
		for (int i = 0; i < labelLines.length; i++) {
			if (i > 0) {
				sb.append('\n');
			}
			sb.append(labelLines[i]);
		}
		return sb.toString();
	}

	/**
	 * Sets the label of the supplied locale and state
	 *
	 * @param state 0=WORKING 1=PRODUCTIVE
	 * @param locale
	 * @param label
	 */
	public void setLabel(int state, String locale, String newLabel) {
		setLabel(state, locale, newLabel, false);
	}

	/**
	 * Sets the label of the supplied locale and state
	 *
	 * @param state 0=WORKING 1=PRODUCTIVE
	 * @param locale
	 * @param label
	 * @param isDefaultLocale if true, this locale is treated as the defaultLocale (same as setDefaultLocale(locale) )
	 */
	public void setLabel(int state, String locale, String newLabel, boolean isDefaultLocale) {
		if (!isDefaultLocale && defaultLocale == null) {
			throw new IllegalArgumentException("No label in the default Locale is present."); //$NON-NLS-1$
		}
		if (newLabel == null || newLabel.length() == 0) {
			throw new IllegalArgumentException("No value for the label"); //$NON-NLS-1$
		}
		if (newLabel.contains("\n")) { //$NON-NLS-1$
			throw new IllegalArgumentException("A label may not have line breaks"); //$NON-NLS-1$
		}

		if (isDefaultLocale) {
			if (defaultLocale != null && !defaultLocale.equals(locale)) {
				throw new IllegalArgumentException("The default locale can not be changed."); //$NON-NLS-1$
			}
			defaultLocale = locale;
		}

		int pos = lineThatHasKey("" + state + " " + locale); //$NON-NLS-1$ //$NON-NLS-2$
		String newLabelLine = createLabelLine(state, locale, newLabel);
		if (pos < 0) {
			// no such label -> add it
			if (labelLines == null) {
				labelLines = new String[1];
				pos = 0;
			} else {
				int size = labelLines.length;
				labelLines = Arrays.copyOf(labelLines, size + 1);
				pos = size;
			}
		}

		// set the label
		labelLines[pos] = newLabelLine;

		if (state == 1) {
			// when setting productive:
			pos = lineThatHasKey("0 " + locale); //$NON-NLS-1$
			if (pos >= 0) {
				// remove working state of that locale
				removeLabelLine(pos);
			}
		}
	}

	protected void removeLabelLine(int pos) {
		String[] newValues = new String[labelLines.length - 1];
		for (int i = 0, j = 0; i < labelLines.length; i++) {
			if (i == pos) {
				continue;
			}
			newValues[j] = labelLines[i];
			j++;
		}
		labelLines = newValues;
	}

	/**
	 * returns the label in the specific language and state, null if not found
	 *
	 * @param language
	 * @param state
	 * @return null if not available
	 */
	public String getLabel(String language, int state) {
		return getLabel(language, state, false);
	}

	/**
	 * returns the label in the specific language and state
	 *
	 * @param language
	 * @param state
	 * @param fallbackToDefaultLanguage if true the label is also looked up in the default language
	 * @return null if not available
	 */
	public String getLabel(String language, int state, boolean fallbackToDefaultLanguage) {
		String label = null;
		if (state == 1) {
			label = getProductiveLabel(language, fallbackToDefaultLanguage);
		}
		if (label == null) {
			label = getLabel(language, fallbackToDefaultLanguage);
		}
		return label;
	}

	/**
	 * returns the label in the specified language
	 *
	 * @param language
	 * @param fallbackToDefaultLanguage if true the label is also looked up in the default language
	 * @return
	 */
	public String getLabel(String language, boolean fallbackToDefaultLanguage) {
		if (language == null) {
			throw new IllegalArgumentException("language is null"); //$NON-NLS-1$
		}
		if (labelLines == null) {
			return null;
		}

		int pos = lineThatHasKey("0 " + language); //$NON-NLS-1$
		if (pos >= 0) {
			return getLabelFromLabelLine(labelLines[pos]);
		}

		if (language.length() > 2) {
			// try less specific language variant
			pos = lineThatHasKey("0 " + language.substring(0, 2)); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}
		}

		// in case no working label is found, try productive with no fallback (fallback done on working)
		String productiveLabel = getProductiveLabel(language, false);
		if (productiveLabel != null) {
			return productiveLabel;
		}

		if (fallbackToDefaultLanguage) {
			if (defaultLocale == null) {
				throw new RuntimeException("No defaultLocale set in LabelsType"); //$NON-NLS-1$
			}
			pos = lineThatHasKey("0 " + defaultLocale); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}

			pos = lineThatHasKey("0 de"); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}
		}

		return getProductiveLabel(language, fallbackToDefaultLanguage);
	}

	public String getProductiveLabel(String language, boolean fallbackToDefaultLanguage) {
		if (labelLines == null) {
			return null;
		}

		int pos = lineThatHasKey("1 " + language); //$NON-NLS-1$
		if (pos >= 0) {
			return getLabelFromLabelLine(labelLines[pos]);
		}

		if (language.length() > 2) {
			// try less specific language variant
			pos = lineThatHasKey("1 " + language.substring(0, 2)); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}
		}

		if (fallbackToDefaultLanguage) {
			if (defaultLocale == null) {
				throw new RuntimeException("No defaultLocale set in LabelsType"); //$NON-NLS-1$
			}
			pos = lineThatHasKey("1 " + defaultLocale); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}

			pos = lineThatHasKey("1 de"); //$NON-NLS-1$
			if (pos >= 0) {
				return getLabelFromLabelLine(labelLines[pos]);
			}
		}
		return null;
	}

	private int lineThatHasKey(String key) {
		if (labelLines == null) {
			return -1;
		}
		for (int i = 0; i < labelLines.length; i++) {
			if (getKeyFromLabelLine(labelLines[i]).equals(key)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * returns the label of the defaultLocale
	 *
	 * @return
	 */
	public String getDefaultLabel() {
		if (defaultLocale == null) {
			return null;
		}
		return getLabel(defaultLocale, false);
	}

	private String createLabelLine(int state, String locale, String label) {
		return "" + state + " " + locale + "|" + label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	private String getLabelFromLabelLine(String labelLine) {
		int pos = labelLine.indexOf('|');
		if (pos < 0) {
			return null;
		}
		return labelLine.substring(labelLine.indexOf('|') + 1);
	}

	private String getKeyFromLabelLine(String labelLine) {
		int pos = labelLine.indexOf('|');
		if (pos < 0) {
			return null;
		}
		return labelLine.substring(0, pos);
	}

	public void removeLabel(int state, String locale) {
		if (labelLines == null) {
			return; // no labels to remove
		}

		if (locale.equals(defaultLocale)) {
			// default label shall be removed:

			if (state == 1) {
				throw new IllegalArgumentException("Cannot remove default language entry"); //$NON-NLS-1$
			}
			if (state == 0) {
				// the working state of the default label shall be removed
				int pos = lineThatHasKey("0 " + locale); //$NON-NLS-1$
				if (pos > -1) {
					// working state of the default label is present

					// check if a productive label of this locale is present
					int prodpos = lineThatHasKey("1 " + locale); //$NON-NLS-1$
					if (prodpos > -1) {
						// there is a productive label of this locale
						// so we can safely remove the working label of this locale
						removeLabelLine(pos);
					} else {
						// we can not remove this label because it is the last label in the default locale
						throw new IllegalArgumentException("Cannot remove default language entry"); //$NON-NLS-1$
					}
				}
			}
		} else {
			// label from non default locales can be removed:
			if (state == 0) {
				// the working label of this locale shall be removed
				int pos = lineThatHasKey("0 " + locale); //$NON-NLS-1$
				if (pos > -1) {
					removeLabelLine(pos);
				}
			} else {
				// the productive label of this locale shall be removed
				int pos = lineThatHasKey("1 " + locale); //$NON-NLS-1$
				if (pos > -1) {
					removeLabelLine(pos);
				}
			}
		}
	}

	/**
	 * returns true if no data is present
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return (labelLines == null || labelLines.length == 0);
	}

	/**
	 * clears the contents of this LabelType
	 */
	public void clear() {
		defaultLocale = null;
		labelLines = null;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!this.getClass().isInstance(other)) {
			return false;
		}

		LabelsType otherLabelsType = (LabelsType) other;

		if (defaultLocale == null) {
			if (otherLabelsType.defaultLocale == null && isEmpty() && Arrays.equals(labelLines, otherLabelsType.labelLines)) {
				return true;
			}
			return false;
		}

		if (defaultLocale.equals(otherLabelsType.defaultLocale) && Arrays.equals(labelLines, otherLabelsType.labelLines)) {
			return true;
		}

		return false;
	}

	/**
	 * fixes the default label for the rare case that the default language is not the system language to prevent inconsistent states
	 */
	public void fixDefaultLanguage() {
		if (defaultLocale == null) {
			int pos = lineThatHasKey("1 de"); //$NON-NLS-1$
			if (pos >= 0) {
				defaultLocale = "de"; //$NON-NLS-1$
				return;
			}

			pos = lineThatHasKey("0 de"); //$NON-NLS-1$
			if (pos >= 0) {
				defaultLocale = "de"; //$NON-NLS-1$
				return;
			}
		}
	}

}
