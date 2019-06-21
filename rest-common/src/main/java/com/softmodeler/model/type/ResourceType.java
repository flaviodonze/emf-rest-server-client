/*******************************************************************************
 * $URL$
 *
 * Copyright (c) 2007 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.model.type;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Represents a file or stream resource
 *
 * @author created by Author: fdo, last update by $Author$
 * @version $Revision$, $Date$
 */
public class ResourceType implements Serializable {
	/** serial version UID */
	private static final long serialVersionUID = 1500048066049949516L;
	/** relative path of the resource */
	private String path;
	/** holds the file */
	private File file;
	/** holds the input stream */
	private InputStream inputStream;

	/**
	 * default constructor
	 */
	public ResourceType() {
	}

	/**
	 * constructor
	 *
	 * @param path
	 */
	public ResourceType(String path) {
		this.path = path;
	}

	/**
	 * constructor
	 *
	 * @param file
	 */
	public ResourceType(File file) {
		setFile(file);
	}

	/**
	 * Sets the file (also sets the 'path' attribute)
	 *
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
		if (file != null) {
			path = file.toString();
		}
	}

	/**
	 * Returns the file
	 *
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Sets the path
	 *
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Returns the path
	 *
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	@Override
	public String toString() {
		return getPath();
	}

	/**
	 * Sets the InputStream
	 *
	 * @param inputStream the inputStream to set
	 */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * Returns the InputStream
	 *
	 * @return the inputStream
	 */
	public InputStream getInputStream() {
		if (inputStream != null && !(inputStream instanceof ByteArrayInputStream)) {
			try {
				// convert stream to ByteArrayInputStream
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int bytesRead = inputStream.read(buffer);
				while (bytesRead != -1) {
					out.write(buffer, 0, bytesRead);
					bytesRead = inputStream.read(buffer);
				}
				inputStream = new ByteArrayInputStream(out.toByteArray());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return inputStream;
	}
}
