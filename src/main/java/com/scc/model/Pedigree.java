package com.scc.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ods_livres")
public class Pedigree {

	@Id
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "id_chien", nullable = false)
	private int idDog;

	@Column(name = "pays")
	private String country;

	@Column(name = "livre")
	private String type;

	@Column(name = "numero")
	private String number;

	@Column(name = "date_obtention")
	private String obtentionDate;

	@Column(name = "date_maj")
	private Timestamp timestamp;
	
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }

	public int getIdDog() { return idDog; }
	public void setIdDog(int idDog) { this.idDog = idDog; }

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }

	public String getNumber() { return number; }
	public void setNumber(String number) { this.number= number; }

	public String getCountry() { return country; }
	public void setCountry(String country) { this.country = country; }

	public String getObtentionDate() { return obtentionDate; }
	public void setObtentionDate(String obtentionDate) { this.obtentionDate = obtentionDate; }

	public Timestamp getTimestamp() { return timestamp; }
	public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

	public Pedigree withId(long id){ this.setId( id ); return this; }
	public Pedigree withType(String type){ this.setType(type); return this; }
	public Pedigree withNumber(String number){ this.setNumber(number); return this; }
	public Pedigree withCountry(String country){ this.setCountry(country); return this; }
	public Pedigree withObtentionDate(String obtentionDate){ this.setObtentionDate(obtentionDate); return this; }
	public Pedigree withIdDog(int idDog){ this.setIdDog(idDog); return this; }
	public Pedigree withTimestamp(Timestamp timestamp){ this.setTimestamp(timestamp); return this; }
	
	@Override
	public String toString() {
		return "Pedigree [id=" + id + ", idDog=" + idDog + ", country=" + country + ", type=" + type + ", number="
				+ number + ", obtentionDate=" + obtentionDate + ", timestamp=" + timestamp + "]";
	}

}