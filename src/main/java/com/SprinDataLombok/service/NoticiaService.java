package com.SprinDataLombok.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SprinDataLombok.dto.NoticiaDTO;
import com.SprinDataLombok.model.Noticia;
import com.SprinDataLombok.repository.NoticiaRepository;

@Service
public class NoticiaService {
	
	@Autowired
	private NoticiaRepository noticiaRepository;
	
	public Noticia findID(Long id) {
		return noticiaRepository.findById(id).orElseThrow(() -> new RuntimeException("erro ao buscar dado"));
	}

	public List<NoticiaDTO> findAll() {
		// TODO Auto-generated method stub
		List<NoticiaDTO> dtos = new ArrayList<>();
		noticiaRepository.findAll().forEach(ntc -> dtos.add(new NoticiaDTO(ntc)));
		return dtos;
	}

	public NoticiaDTO insertNoticia(Noticia noticia) {
		return new NoticiaDTO(noticiaRepository.save(noticia));
	}

	public NoticiaDTO updateNoticia(Noticia noticia) {
		// TODO Auto-generated method stub
		
		Noticia ntc =  noticiaRepository.save(noticia);
		BeanUtils.copyProperties(noticia, ntc, "id");
		return new NoticiaDTO(noticiaRepository.save(ntc));
	}

}
