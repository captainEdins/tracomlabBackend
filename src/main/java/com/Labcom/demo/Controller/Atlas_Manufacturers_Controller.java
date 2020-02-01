package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Manufacturers;
import com.Labcom.demo.Repository.Atlas_Manufacturers_Repository;

@RestController
public class Atlas_Manufacturers_Controller {
	
private Atlas_Manufacturers_Repository repository;
	
	public Atlas_Manufacturers_Controller(Atlas_Manufacturers_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasManufacturers",  method = RequestMethod.GET)
	public List<Atlas_Manufacturers> getManufacturers() {
		return repository.findAll();
	}

}
