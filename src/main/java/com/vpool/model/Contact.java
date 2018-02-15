package com.vpool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="VP_CONTACT")
public class Contact extends Traceability{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(columnDefinition="VARCHAR(50)")
	private String firstname;
	
	@Column(columnDefinition="VARCHAR(50)")
	private String lastname;
	
	@Email
	@NotNull
	@NotBlank
	private String email;
	
	@Max(10)
	@Min(10)
	@NotNull
	private Long mobileNumber;
	
	@Column(columnDefinition="VARCHAR(1) default 'N'")
	private String isMobileVerified;
	
	@Column(columnDefinition="VARCHAR(1) default 'N'")
	private String isEmailVerified;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="daily_carpool_id")
	private DailyCarpool dailyCarpool;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public DailyCarpool getDailyCarpool() {
		return dailyCarpool;
	}

	public void setDailyCarpool(DailyCarpool dailyCarpool) {
		this.dailyCarpool = dailyCarpool;
	}

}
