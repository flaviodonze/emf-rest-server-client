/*******************************************************************************
 * $URL$
 *
 * Copyright (c) 2007 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.common;

import java.util.List;

/**
 * This Exception is thrown when the input of an object is invalid or incomplete<br />
 *
 * @author created by Author: fdo, last update by $Author$
 * @version $Revision$, $Date$
 */
public class ValidationException extends ServerException {
	private static final long serialVersionUID = -1657094796040473245L;

	/**
	 * constructor
	 *
	 * @param message
	 */
	public ValidationException(String message) {
		super(message);
	}

	/**
	 * constructor
	 *
	 * @param messages
	 */
	public ValidationException(List<String> messages) {
		super(messages);
	}

}
