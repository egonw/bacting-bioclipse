/* Copyright (c) 2009-2024  Egon Willighagen <egonw@users.sf.net>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contact: http://www.bioclipse.net/
 */
package net.bioclipse.rdf.business;

import org.apache.jena.query.Dataset;

public interface IJenaDatasetStore extends IJenaStore {

    public Dataset getDataset();

}
