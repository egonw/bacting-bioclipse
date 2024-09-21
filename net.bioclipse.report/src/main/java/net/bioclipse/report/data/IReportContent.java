/* Copyright (c) 2015,2024  Egon Willighagen <egon.willighagen@gmail.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 */
package net.bioclipse.report.data;

/**
 * A Bioclipse domain model interface for a content in a report.
 */
public interface IReportContent {

	/**
	 * Set the values of this report content.
	 *
	 * @param content one or more values
	 * @return the updated domain object
	 */
	public IReportContent setValue(Object... content);

	/**
	 * Returns the values of this report content.
	 *
	 * @return the values as an array of objects
	 */
	public Object[] getContent();

}
