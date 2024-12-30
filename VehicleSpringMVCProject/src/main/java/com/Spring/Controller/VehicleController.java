package com.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring.Model.Vehicle;
import com.Spring.Service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService service;
	
	@RequestMapping("/gotoform")
	public String form() {
		return "add";
	}
	
	@RequestMapping("/add")
	public String insert(@ModelAttribute Vehicle v1) {
		System.out.println("Inserted");
		System.out.println(v1);
		service.addVehicle(v1);
		return "add";
	}
	
	@RequestMapping("/updateform")
	public String updateVehicle() {
		return "update";
	}
	
	@RequestMapping("/update")
	public String updated(@ModelAttribute Vehicle v1) {
		
		System.out.println("Updated");
		System.out.println(v1);
		service.changeInfo(v1);
		
		return "update";
	}
	
	@RequestMapping("/deletedata")
	public String deleteVehicle() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	public String deleted(@ModelAttribute Vehicle v1) {
		System.out.println("Deleted");
		service.deleteInfo(v1);
		return "delete";
	}
	
	@RequestMapping("/getbyid/{vId}")
	public String getById(@PathVariable ("vId") int id , Model model) {
		Vehicle v = service.getById(id);
		model.addAttribute("infobyid", v);
		System.out.println(v);
		return "getbyid";
	}
	
	@RequestMapping("/showall")
	public String showAll(Model model, @ModelAttribute Vehicle v1) {
		List<Vehicle> v = service.showAll(v1);
		model.addAttribute("allinfo", v);
		System.out.println(v);
		return "getall";
	}
}
