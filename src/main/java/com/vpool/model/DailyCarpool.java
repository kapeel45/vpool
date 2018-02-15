package com.vpool.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(
name="VP_DAILY_CARPOOL",
uniqueConstraints = {@UniqueConstraint(
		columnNames = {"departure_area_id", "arrival_area_id"},
		name="daily_carpool_serial_dep_arr")}
)
public class DailyCarpool extends Traceability{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="departure_area_id")
	private Area departureArea;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="arrival_area_id")
	private Area arrivalArea;
	
	@Column(columnDefinition="VARCHAR(1) default 'N'")
	private String isReturnTrip;
	
	@OneToMany(mappedBy = "dailyCarpool", cascade = CascadeType.ALL)
	private List<Contact> contact = new ArrayList<Contact>();

	@Temporal(TemporalType.TIME)
	private Date departureTime;
	
	@Temporal(TemporalType.TIME)
	private Date arrivalTime;

	@Column(columnDefinition="VARCHAR(1)")
	private String isActive;
	
	private String description;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Area getDepartureArea() {
		return departureArea;
	}

	public void setDepartureArea(Area departureArea) {
		this.departureArea = departureArea;
	}

	public Area getArrivalArea() {
		return arrivalArea;
	}

	public void setArrivalArea(Area arrivalArea) {
		this.arrivalArea = arrivalArea;
	}

	public String getIsReturnTrip() {
		return isReturnTrip;
	}

	public void setIsReturnTrip(String isReturnTrip) {
		this.isReturnTrip = isReturnTrip;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
