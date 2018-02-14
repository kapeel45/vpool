package com.vpool.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VP_MAST_AREA")
public class Area extends Traceability{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition="VARCHAR(100)")
	private String areaName;
	
	@Column(columnDefinition="VARCHAR(150)")
	private String nearByLocation;
	
	@OneToMany(mappedBy = "departureArea", cascade = CascadeType.ALL)
	private List<DailyCarpool> dailyDepCarpool = new ArrayList<DailyCarpool>();

	@OneToMany(mappedBy = "arrivalArea", cascade = CascadeType.ALL)
	private List<DailyCarpool> dailyArrCarpool = new ArrayList<DailyCarpool>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getNearByLocation() {
		return nearByLocation;
	}

	public void setNearByLocation(String nearByLocation) {
		this.nearByLocation = nearByLocation;
	}

}
