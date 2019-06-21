/*******************************************************************************
 * $URL$
 *
 * Copyright (c) 2007 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.model.type;

import java.io.Serializable;

/**
 * @author created by Author: phe, last update by $Author$
 * @version $Revision$, $Date$
 */
public class MailAddressType implements Serializable {
	private static final long serialVersionUID = 932556602831244097L;
	private String name;
	private String mailAddress;
	private String language;

	public MailAddressType() {
	}

	public MailAddressType(String values) {
		if (values == null || values.isEmpty()) {
			return;
		}
		int startPos = 0;
		int endPos = values.indexOf('|');
		if (endPos == -1) {
			mailAddress = values;
		} else {
			mailAddress = values.substring(startPos, endPos);
			startPos = endPos + 1;
			endPos = values.indexOf('|', startPos);
			if (endPos == startPos) {
				name = null;
			} else {
				name = values.substring(startPos, endPos);
			}
			startPos = endPos + 1;
			language = values.substring(startPos);
		}

		if (name != null && name.trim().isEmpty()) {
			name = null;
		}

		if (language != null && language.trim().isEmpty()) {
			language = null;
		}
	}

	public MailAddressType(String email, String name) {
		mailAddress = email;
		this.name = name;
	}

	public MailAddressType(String email, String name, String language) {
		mailAddress = email;
		this.name = name;
		this.language = language;
	}

	public MailAddressType(MailAddressType mailAddressType) {
		mailAddress = mailAddressType.getMailAddress();
		name = mailAddressType.getName();
		if (name.equals(mailAddress)) {
			name = null;
		}
		language = mailAddressType.getLanguage();
	}

	/**
	 * @return the name that is displayed for the receiver of the mail
	 */
	public String getName() {
		if (name == null || name.trim().isEmpty()) {
			return mailAddress;
		}
		return name;
	}

	/**
	 * @param name the name to set for the receiver of the mail
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * returns true if there is no mail address specified
	 *
	 * @return
	 */
	private boolean isEmpty() {
		return (mailAddress == null || mailAddress.trim().isEmpty());
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return new String();
		}

		StringBuffer sb = new StringBuffer();
		sb.append(mailAddress);
		sb.append('|');
		if (name != null && !name.trim().isEmpty()) {
			sb.append(name);
		}
		sb.append('|');
		if (language != null && !language.trim().isEmpty()) {
			sb.append(language);
		}
		return sb.toString();
	}

}
