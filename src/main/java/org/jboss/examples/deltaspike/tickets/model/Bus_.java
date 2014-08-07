package org.jboss.examples.deltaspike.tickets.model;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Bus.class)
public class Bus_ {
    public static volatile SingularAttribute<Bus, Long> id;
    public static volatile SingularAttribute<Bus, Line> line;
    public static volatile SingularAttribute<Bus, Date> date;
}
