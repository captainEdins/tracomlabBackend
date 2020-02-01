package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Shipped;
import com.Labcom.demo.Repository.Atlas_Shipped_Repository;

@RestController
public class Atlas_Shipped_Controller {

private Atlas_Shipped_Repository repository;
	
	public Atlas_Shipped_Controller(Atlas_Shipped_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasShipped",  method = RequestMethod.GET)
	public List<Atlas_Shipped> getShipped() {
		return repository.findAll();
	}
}
