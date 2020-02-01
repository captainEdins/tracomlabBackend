package com.Labcom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Labcom.demo.Model.Ufs_Authentication;

public interface Ufs_Authentication_Repository extends JpaRepository<Ufs_Authentication,Long>{

	Ufs_Authentication findByUsername(String username);

}
