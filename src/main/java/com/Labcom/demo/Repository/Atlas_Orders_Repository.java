package com.Labcom.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Labcom.demo.Model.Atlas_Orders;


@Repository
public interface Atlas_Orders_Repository extends JpaRepository<Atlas_Orders,Long>{

	
}
