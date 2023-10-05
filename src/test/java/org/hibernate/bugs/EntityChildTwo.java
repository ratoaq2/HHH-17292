package org.hibernate.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class EntityChildTwo extends EntityChildOne {

	@Column(name = "CHILD_TWO_FIELD")
	private String childTwoField;
}