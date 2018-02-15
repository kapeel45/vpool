package com.vpool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VP_MAST_NODAL_PLACE")
public class NodalPlace extends Traceability{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition="VARCHAR(150)")
	private String nodalPoints; //pickup place
	
	//TODO
	//@ManyToOne
	//@NotNull
	//@JoinColumn(name = "area_id")
	//private Area area;
}
