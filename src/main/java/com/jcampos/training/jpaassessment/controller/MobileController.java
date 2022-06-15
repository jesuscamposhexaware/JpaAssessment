package com.jcampos.training.jpaassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcampos.training.jpaassessment.dto.MobileDTO;
import com.jcampos.training.jpaassessment.service.MobileService;

@RestController
@RequestMapping("/api")
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@GetMapping("/mobile")
	public List<MobileDTO> getAllWithAppName() {
		return mobileService.findAllMobilesWithAppName();
	}
	
	@GetMapping(value = "/mobile", params = "mobileName")
	public List<MobileDTO> getAllWithAppNameByMobileName(@RequestParam String mobileName) {
		return mobileService.findAllWithAppNameByMobileName(mobileName);
	}
}
