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

import java.nio.file.Paths;

import org.apache.jena.dboe.base.file.Location;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb2.TDB2Factory;

public class TDBModel implements IJenaDatasetStore {

    private Dataset dataset;

    public TDBModel(String tripleStoreDirectoryPath) {
    	Location location = Location.create(Paths.get(tripleStoreDirectoryPath).toAbsolutePath().normalize() + "/tdb2/");
    	dataset = TDB2Factory.connectDataset(location);
    }
    
    public Dataset getDataset() {
        return this.dataset;
    }
    
    public Model getModel() {
        return this.dataset.getUnionModel();
    }
    
    public String toString() {
    	if (this.dataset.isInTransaction()) return "RDFStore (Jena TDB2): in transaction";

    	long size;
    	if (dataset.isInTransaction()) dataset.end();
    	dataset.begin(ReadWrite.READ);
    	size = dataset.getUnionModel().size();
    	dataset.end();
    	return "RDFStore (Jena TDB2): " + size + " triples";
    }
    
}
