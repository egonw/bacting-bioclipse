/* Copyright (c) 2015,2023  Egon Willighagen <egon.willighagen@gmail.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 */
package net.bioclipse.report.data;

import java.util.List;

import net.bioclipse.core.domain.IStringMatrix;

/**
 * Interface to create an abstract report model that can be serialized
 * into other formats later.
 */
public interface IReport {

	/**
	 * Adds a report headers to the current report.
	 * 
	 * @param authors String representing the authors of the report
	 * @param title   String representing the title of the report
	 * @return        the current working model
	 */
	public IReport createHeader(String authors, String title);

	/**
	 * Adds a report title to the current report.
	 * 
	 * @param title   String representing the title of the report
	 * @return        the current working model
	 */
	public IReport createTitle(String title);

	/**
	 * Adds the report authors to the current report.
	 * 
	 * @param authors String representing the authors of the report
	 * @return        the current working model
	 */
	public IReport createAuthors(String authors);

	/**
	 * Adds a report section header to the current report.
	 * 
	 * @param sectionTitle   String representing the title of the report
	 * @return               the current working model
	 */
	public IReport startSection(String sectionTitle);

	/**
	 * Adds a report subsection header to the current report.
	 * 
	 * @param sectionTitle   String representing the title of the report
	 * @return               the current working model
	 */
	public IReport startSubSection(String sectionTitle);

	/**
	 * Adds a report subsubsection header to the current report.
	 * 
	 * @param sectionTitle   String representing the title of the report
	 * @return               the current working model
	 */
	public IReport startSubSubSection(String sectionTitle);

	/**
	 * Adds a text to the current report with certain styles.
	 * 
	 * @param text   String representing the text to add
	 * @param styles String representations of the text styles
	 * @return       the current working model
	 */
	public IReport addText(String text, String... styles);

	/**
	 * Adds a hyperlink to the current report with certain styles.
	 * 
	 * @param link String representing the URL of the hyperlink
	 * @param text String representings the visible hyperlink text
	 * @return     the current working model
	 */
	public IReport addLink(String link, String text);

	/**
	 * Adds a table to the current report with certain styles.
	 * 
	 * @param matrix  {@link IStringMatrix} representing the table to add
	 * @param caption String representing the table caption
	 * @return        the current working model
	 */
	public IReport addTable(IStringMatrix matrix, String caption);
	public IReport addBox(int height, int width);

	/**
	 * Starts a new report paragraph.
	 *
	 * @return        the current working model
	 */
	public IReport startParagraph();

	/**
	 * Ends the current report paragraph.
	 *
	 * @return        the current working model
	 */
	public IReport endParagraph();

	/**
	 * Starts a new report indentation.
	 *
	 * @return        the current working model
	 */
	public IReport startIndent();

	/**
	 * Ends the current report indentation.
	 *
	 * @return        the current working model
	 */
	public IReport endIndent();
	
	public IReport forceNewLine();
	
	public List<IReportContent> getContent();

}
