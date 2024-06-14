package com.SprinDataLombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SprinDataLombok.dto.NoticiaDTO;
import com.SprinDataLombok.model.Noticia;
import com.SprinDataLombok.service.NoticiaService;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {
	
	@Autowired
	private NoticiaService noticiaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<NoticiaDTO> findIDNoticia(@PathVariable Long id){
		NoticiaDTO ntc = new NoticiaDTO(noticiaService.findID(id));
		return new ResponseEntity<NoticiaDTO>(ntc, HttpStatus.OK);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<List<NoticiaDTO>> findAll(){
		List<NoticiaDTO> ntc = noticiaService.findAll();
		return new ResponseEntity<List<NoticiaDTO>>(ntc, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<NoticiaDTO> insertNoticia(@RequestBody Noticia noticia){
		NoticiaDTO ntc = noticiaService.insertNoticia(noticia);
		return new ResponseEntity<NoticiaDTO>(ntc, HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<NoticiaDTO> updateNoticia(@RequestBody Noticia noticia){
		NoticiaDTO ntc = noticiaService.updateNoticia(noticia);
		return new ResponseEntity<NoticiaDTO>(ntc, HttpStatus.OK);
	}
}
