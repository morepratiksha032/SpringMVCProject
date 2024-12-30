package com.Spring.DAO;

import java.util.List;import javax.xml.bind.ValidationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.Model.Vehicle;

@Component
public class VehicleDAO {
	
//	@Autowired
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public VehicleDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public void add(Vehicle v1) {
		template.save(v1);
	}
	
	@Transactional
	public Vehicle updateData(Vehicle v1, int vId) {
		
		Vehicle v = template.get(Vehicle.class, vId);
		v.setvName(v1.getvName());
		v.setPrice(v1.getPrice());
		v.setMilage(v1.getMilage());
		
		template.update(v);
		return v;
	}
	
	@Transactional
	public void deleteData(Vehicle v1) {
		template.delete(v1);
	}
	
	
	public Vehicle getById(int id) {
		Vehicle v = template.get(Vehicle.class,id);
		return v;
	}
	
	public List<Vehicle> showAll(Vehicle v1) {
		List<Vehicle> list = template.loadAll(Vehicle.class);
		return list;
	}
}
