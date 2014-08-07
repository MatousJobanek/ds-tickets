package org.jboss.examples.deltaspike.tickets.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Line.class)
public class Line_ {
    public static volatile SingularAttribute<Line, String> departure;
    public static volatile SingularAttribute<Line, String> arrival;
}
