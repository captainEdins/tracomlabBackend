package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Delivery;
import com.Labcom.demo.Repository.Atlas_Delivery_Repository;

@RestController
public class Atlas_Delivery_Controller {
	
private Atlas_Delivery_Repository repository;
	
	public Atlas_Delivery_Controller(Atlas_Delivery_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasDelivery",  method = RequestMethod.GET)
	public List<Atlas_Delivery> getDelivery() {
		return repository.findAll();
	}

}
