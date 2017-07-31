package fr.pizzeria.console;


public class Pizza {
	private String code;
	private String libelle;
	private Double prix;

	public Pizza(String code, String libelle, Double prix) {

		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
}
