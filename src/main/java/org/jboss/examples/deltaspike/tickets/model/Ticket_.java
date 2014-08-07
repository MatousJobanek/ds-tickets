package org.jboss.examples.deltaspike.tickets.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ticket.class)
public class Ticket_ {
    public static volatile SingularAttribute<Ticket, Bus> bus;
}
