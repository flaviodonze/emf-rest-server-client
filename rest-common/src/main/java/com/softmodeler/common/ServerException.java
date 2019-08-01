/*******************************************************************************
 * $URL$
 *
 * Copyright (c) 2007 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.common;

import java.util.ArrayList;
import java.util.List;

/**
 * This exception is thrown on the server or during server/client communication<br />
 *
 * @author created by Author: fdo, last update by $Author$
 * @version $Revision$, $Date$
 */
public class ServerException extends Exception {
	private static final long serialVersionUID = 2585053930445892646L;

	/** messages */
	private List<String> messages;

	/**
	 * constructor
	 *
	 * @param message
	 */
	public ServerException(String message) {
		this(new ArrayList<String>());
		messages.add(message);
	}

	/**
	 * constructor
	 *
	 * @param messages
	 */
	public ServerException(List<String> messages) {
		this.messages = messages;
	}

	public ServerException(String message, Throwable cause) {
		super(cause);
		messages = new ArrayList<String>();
		messages.add(message);
	}

	/**
	 * Returns the validation messages
	 *
	 * @return
	 */
	public List<String> getMessages() {
		return messages;
	}

	@Override
	public String getMessage() {
		StringBuffer buffer = new StringBuffer();
		int i = 0;
		for (String message : messages) {
			if (i > 0) {
				buffer.append("\n"); //$NON-NLS-1$
			}
			buffer.append(message);
			i++;
		}
		return buffer.toString();
	}
}
