package com.sura.reto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sura.reto.common.Constants;
import com.sura.reto.model.Color;
import com.sura.reto.service.ColorService;

/**
 * @author renx
 *
 */
@RestController
@RequestMapping(Constants.COLOR_URL)
public class ColorController {

	@Autowired
	private ColorService colorService;

	@GetMapping(produces = { "application/json", "application/xml" })
	public Page<Color> getColors(Pageable pageable) {
		return colorService.getAllColors(pageable);
	}

	@GetMapping(value = "/{id}", produces = { "application/json",
			"application/xml" })
	public Color getColors(@PathVariable("id") Long id) {
		Color color = colorService.findOne(id).get();
		
		return color!=null?color:null;
	}

	@PostMapping(produces = { "application/json",
			"application/xml" })
	public Color saveColor(@RequestBody Color color) {
		return colorService.saveColor(color);
	}

}
