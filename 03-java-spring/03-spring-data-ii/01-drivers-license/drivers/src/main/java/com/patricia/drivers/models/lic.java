package com.patricia.drivers.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")

public class lic {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @DateTimeFormat(pattern ="yyyy-mm-dd")
	    private Date expiration_date;
	    private String state;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @OneToOne(fetch=FetchType.LAZY)	
	    @JoinColumn(name="person_id")
	    private Person person;
		public lic() {
			
		}
		public lic(Long id,Date expiration_date, String state, Date createdAt, Date updatedAt,
				Person person) {
			
			this.id = id;
		
			this.expiration_date = expiration_date;
			this.state = state;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.person = person;
		}
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public Date getExpiration_date() {
			return expiration_date;
		}
		public void setExpiration_date(Date expiration_date) {
			this.expiration_date = expiration_date;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		public String getNumber() {
			return String.format("%05d", id);
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
	    
	    
}