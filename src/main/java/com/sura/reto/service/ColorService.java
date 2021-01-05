package com.sura.reto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sura.reto.model.Color;
import com.sura.reto.repository.ColorRepository;

/**
 * @author renx
 *
 */
@Service
public class ColorService {
	
	@Autowired
	private ColorRepository colorRepository;
	
	public Page<Color> getAllColors(Pageable pageable){
		
		return colorRepository.findAll(pageable);
		
	}
	
	public Optional<Color> findOne(Long id) {
		
		return colorRepository.findById(id);
	}
	
	public Color saveColor(Color color) {
		
		return colorRepository.save(color);
	}

}
