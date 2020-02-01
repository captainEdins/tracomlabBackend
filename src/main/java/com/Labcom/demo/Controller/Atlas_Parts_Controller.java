package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Parts;
import com.Labcom.demo.Repository.Atlas_Parts_Repository;


@RestController
public class Atlas_Parts_Controller {

private Atlas_Parts_Repository repository;
	
	public Atlas_Parts_Controller(Atlas_Parts_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasParts",  method = RequestMethod.GET)
	public List<Atlas_Parts> getParts() {
		return repository.findAll();
	}

	
}
