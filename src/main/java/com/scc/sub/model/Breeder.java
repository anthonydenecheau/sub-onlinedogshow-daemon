package com.scc.sub.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ods_eleveur")
public class Breeder {

	@Column(name = "id")
	private int id;

	@Column(name = "nom")
	private String lastName;

	@Column(name = "prenom")
	private String firstName;

	@Column(name = "typ_profil")
	private String typeProfil;

	@Column(name = "professionnel_actif")
	private String professionnelActif;

	@Column(name = "raison_sociale")
	private String raisonSociale;

	@Column(name = "on_suffixe")
	private String onSuffixe;
	
	@Id
	@Column(name = "id_chien", nullable = false)
	private int idDog;
	
	@Column(name = "date_maj")
	private Timestamp timestamp;

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public int getIdDog() { return idDog; }
	public void setIdDog(int idDog) { this.idDog = idDog; }
	
	public String getTypeProfil() { return typeProfil; }
	public void setTypeProfil(String typeProfil) { this.typeProfil = typeProfil;}
	
	public String getProfessionnelActif() { return professionnelActif; }
	public void setProfessionnelActif(String professionnelActif) { this.professionnelActif = professionnelActif; }
	
	public String getRaisonSociale() { return raisonSociale; }
	public void setRaisonSociale(String raisonSociale) { this.raisonSociale = raisonSociale; }

	public String getOnSuffixe() { return onSuffixe; }
	public void setOnSuffixe(String onSuffixe) { this.onSuffixe = onSuffixe; }

	public Timestamp getTimestamp() { return timestamp; }
	public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }
	
	public Breeder withId(int id){ this.setId( id ); return this; }
	public Breeder withFirstName(String firstName){ this.setFirstName(firstName); return this; }
	public Breeder withLastName(String lastName){ this.setLastName(lastName); return this; }
	public Breeder withIdDog(int idDog){ this.setIdDog(idDog); return this; }
	public Breeder withTypeProfil(String typeProfil){ this.setTypeProfil(typeProfil); return this; }
	public Breeder withProfessionnelActif(String professionnelActif){ this.setProfessionnelActif(professionnelActif); return this; }
	public Breeder withRaisonSociale(String raisonSociale){ this.setRaisonSociale(raisonSociale); return this; }
	public Breeder withOnSuffixe(String onSuffixe){ this.setOnSuffixe(onSuffixe); return this; }
	public Breeder withTimestamp(Timestamp timestamp){ this.setTimestamp(timestamp); return this; }
	
	@Override
	public String toString() {
		return "Breeder [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", typeProfil="
				+ typeProfil + ", professionnelActif=" + professionnelActif + ", raisonSociale=" + raisonSociale
				+ ", onSuffixe=" + onSuffixe + ", idDog=" + idDog + ", timestamp=" + timestamp + "]";
	}

}