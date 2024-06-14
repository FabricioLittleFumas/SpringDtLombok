package com.SprinDataLombok.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "noticia")
@SequenceGenerator(sequenceName = "seq_ntc", name = "seq_ntc", initialValue = 50)
public class Noticia implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ntc")
	@EqualsAndHashCode.Include
	private long id;

	private String titulo;
	
	private String subtitulo;
	
	private String texto;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_noticia")
	private Date dataNoticia;
}
