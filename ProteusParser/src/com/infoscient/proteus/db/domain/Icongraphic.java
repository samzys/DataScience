package com.infoscient.proteus.db.domain;

import java.awt.Graphics;
import java.io.Serializable;
import javax.persistence.*;

import java.math.BigInteger;

/**
 * The persistent class for the icongraphics database table.
 * 
 */
@Entity
@Table(name = "icongraphics")
public class Icongraphic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Long id;

	@Lob()
	@Column(name = "VALUE")
	private byte[] value;

	private String extent;
	private String preserveAspectRatio;
	private String grid;

	public Icongraphic() {
	}

	@ManyToOne
	private Component component;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getValue() {
		return value;
	}

	public void setValue(byte[] value) {
		this.value = value;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public String getExtent() {
		return extent;
	}

	public void setExtent(String extent) {
		this.extent = extent;
	}

	public String getPreserveAspectRatio() {
		return preserveAspectRatio;
	}

	public void setPreserveAspectRatio(String preserveAspectRatio) {
		this.preserveAspectRatio = preserveAspectRatio;
	}

	public String getGrid() {
		return grid;
	}

	public void setGrid(String grid) {
		this.grid = grid;
	}
	
}