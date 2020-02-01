package com.Labcom.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Labcom.demo.Model.Atlas_Repair;
import com.Labcom.demo.Repository.Atlas_Repair_Repository;

@RestController
public class Atlas_Repair_Controller {

private Atlas_Repair_Repository repository;
	
	public Atlas_Repair_Controller(Atlas_Repair_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/list/atlasRepair",  method = RequestMethod.GET)
	public List<Atlas_Repair> getRepair() {
		return repository.findAll();
	}
}
