package com.vpool.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="VP_DAILY_CARPOOL")
public class DailyCarpool extends Traceability{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="departure_area_id",nullable = false)
	private Area departureArea;
	
	@ManyToOne
	@JoinColumn(name="arrival_area_id",nullable = false)
	private Area arrivalArea;
	
	@ColumnDefault("N")
	@Column(columnDefinition="VARCHAR(1)",nullable= false)
	private String isReturnTrip;
	
	@Temporal(TemporalType.TIME)
	private Date departureTime;
	
	@Temporal(TemporalType.TIME)
	private Date arrivalTime;

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
}
