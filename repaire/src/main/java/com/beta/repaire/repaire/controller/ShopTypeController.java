package com.beta.repaire.repaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.beta.repaire.repaire.entity.ShopType;
import com.beta.repaire.repaire.repository.ShopTypeRepository;

@Controller
public class ShopTypeController {
	
	@GetMapping(value="/")
	public String defaultPage()
	{
		
		return "thymeleaf/Login";
	}
	
	@GetMapping(value="/shopType")
	public String shopType()
	{
		return "thymeleaf/ShopType";
	}
	
	@Autowired
	private ShopTypeRepository shopTypeRepo;
	
	// Save the shoptype details
	@PostMapping(value="/saveShopTypeDetails")
	public String saveShopTypeDetails( ShopType shopType,Model model )
	{
		// Business Logic
		System.out.println("The Data is : "+shopType.toString());
		shopTypeRepo.save(shopType);
		model.addAttribute("Message","Saved Successfully.");
		
		
		return "thymeleaf/ShopType";
	}
	
	
	// Get the view url
	@GetMapping(value="viewShopType")
	public String viewShopType(Model model)
	{
		List<ShopType> shops = shopTypeRepo.findAll();// find all means fetch all the information available inside table
		model.addAttribute("Shop",shops);
		return "thymeleaf/ViewShopType";
	}
	
	
	// delete the shoptype
	@PostMapping("deleteShoptype/{shopTypeId}")
	public String deleteShopType(Model model,@PathVariable("shopTypeId") Integer shopTypeId)
	{
		shopTypeRepo.deleteById(shopTypeId);
		model.addAttribute("Message","Deleted Successfully.");
		List<ShopType> shops = shopTypeRepo.findAll();// find all means fetch all the information available inside table
		model.addAttribute("Shop",shops);
		return "thymeleaf/ViewShopType";
	}

}
