package aulajpamaven.dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//Correspondencia que é uma entidade de dominio que vai corresponder a uma tabela
@Entity
public class Pessoa implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;

private String nome;
private String email;


public Pessoa() {
}

public Pessoa(Integer id, String nome, String email) {
	this.id = id;
	this.nome = nome;
	this.email = email;
}

@Override
public String toString() {
	return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	return Objects.equals(id, other.id);
}



}