package com.scc.sub.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ods_geniteurs")
public class Parent {

	@Id
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "nom")
	private String name;

	@Column(name = "affixe")
	private String affixe;

	@Column(name = "on_suffixe")
	private String onSuffixe;

	@Column(name = "date_maj")
	private Timestamp timestamp;

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getAffixe() { return affixe; }
	public void setAffixe(String affixe) { this.affixe = affixe; }
	
	public String getOnSuffixe() { return onSuffixe; }
	public void setOnSuffixe(String onSuffixe) { this.onSuffixe = onSuffixe; }
	
	public Timestamp getTimestamp() { return timestamp; }
	public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

	public Parent withId(int id){ this.setId( id ); return this; }
	public Parent withName(String name){ this.setName(name); return this; }
	public Parent withAffixe(String affixe){ this.setAffixe(affixe); return this; }
	public Parent withOnSuffixe(String onSuffixe){ this.setOnSuffixe(onSuffixe); return this; }
	public Parent withTimestamp(Timestamp timestamp){ this.setTimestamp(timestamp); return this; }

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", affixe=" + affixe + ", onSuffixe=" + onSuffixe
				+ ", timestamp=" + timestamp + "]";
	}
	
}