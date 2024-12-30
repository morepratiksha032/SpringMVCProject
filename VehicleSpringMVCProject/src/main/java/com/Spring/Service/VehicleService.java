package com.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.DAO.VehicleDAO;
import com.Spring.Model.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDAO dao;
	
//	public VehicleService() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public VehicleDAO getDao() {
//		return dao;
//	}
	
	public void setDao(VehicleDAO dao) {
		this.dao = dao;
	}

	public void addVehicle(Vehicle v1) {
		dao.add(v1);
	}
	
	public void changeInfo(Vehicle v1) {
		dao.updateData(v1, 3);
	}
	
	public void deleteInfo(Vehicle v1) {
		dao.deleteData(v1);
	}
	
	public List<Vehicle> showAll(Vehicle v1) {
		 return (List<Vehicle>) dao.showAll(v1);
	}
	
	public Vehicle getById(int id) {
		return dao.getById(6);
	}
}
