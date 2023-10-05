package org.hibernate.bugs;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class EntityChildOne extends AbstractEntityWithMappedSupperClass {

}