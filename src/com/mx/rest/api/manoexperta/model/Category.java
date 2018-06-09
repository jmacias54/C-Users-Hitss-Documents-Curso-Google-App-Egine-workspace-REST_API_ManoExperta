package com.mx.rest.api.manoexperta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the _categories database table.
 * 
 */
@Entity
@Table(name="_categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer catid;

	private String catspa;

	public Category() {
	}

	public Integer getCatid() {
		return this.catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public String getCatspa() {
		return this.catspa;
	}

	public void setCatspa(String catspa) {
		this.catspa = catspa;
	}

}