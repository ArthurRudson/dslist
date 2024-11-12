package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameServices gamaServices;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gamaServices.findAll();
		return result;
	}
}