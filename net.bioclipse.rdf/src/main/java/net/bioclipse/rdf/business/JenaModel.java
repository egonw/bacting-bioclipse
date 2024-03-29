/* Copyright (c) 2009-2021  Egon Willighagen <egonw@users.sf.net>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contact: http://www.bioclipse.net/
 */
package net.bioclipse.rdf.business;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

public class JenaModel implements IJenaStore {

    private Model model;
    
    public JenaModel() {
    	this(true);
    }

    public JenaModel(boolean ontologyModel) {
    	if (ontologyModel)
    		model = ModelFactory.createOntologyModel();
    	else
    		model = ModelFactory.createDefaultModel();
    }

    public JenaModel( Model jenaTypeModel ) {
    	this(jenaTypeModel, true);
    }

    public JenaModel( Model jenaTypeModel, boolean ontologyModel ) {
    	if (ontologyModel) {
    		model = ModelFactory.createOntologyModel();
    		model.add( jenaTypeModel );
    	} else {
    		model = jenaTypeModel;
    	}
    }
    
    public Model getModel() {
        return this.model;
    }
    
    public String toString() {
        return "RDFStore: " + model.size() + " triples";
    }
    
}
