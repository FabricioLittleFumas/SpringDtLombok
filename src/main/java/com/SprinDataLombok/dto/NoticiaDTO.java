package com.SprinDataLombok.dto;

import java.io.Serializable;
import java.util.Date;

import com.SprinDataLombok.model.Noticia;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NoticiaDTO implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	
	private long id;

	private String titulo;
	
	private String subtitulo;
	
	private String texto;
	
	private Date dataNoticia;
	
	public NoticiaDTO(Noticia noticia){
		this.id = noticia.getId();
		this.titulo = noticia.getTitulo();
		this.subtitulo = noticia.getSubtitulo();
		this.texto = noticia.getTexto();
		this.dataNoticia = noticia.getDataNoticia();
	}
}