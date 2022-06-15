package com.jcampos.training.jpaassessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcampos.training.jpaassessment.dto.MobileDTO;
import com.jcampos.training.jpaassessment.entity.Mobile;
import com.jcampos.training.jpaassessment.repository.MobileRepository;

@Service
public class MobileService {
	
	@Autowired
	private MobileRepository mobileRepository;

	public List<MobileDTO> findAllMobilesWithAppName() {
		List<Mobile> mobileList = mobileRepository.findAll();
		List<MobileDTO> mobileDtoList = new ArrayList<MobileDTO>();
		
		mobileList.forEach(m -> {
			m.getApps().forEach(a -> {
				MobileDTO md = new MobileDTO();
				md.setMobile_name(m.getMobileName());
				md.setApp_name(a.getAppName());
				mobileDtoList.add(md);
			});
		});
		
		return mobileDtoList;
	}
	
	public List<MobileDTO> findAllWithAppNameByMobileName(String mobileName) {
		List<Mobile> mobileList = mobileRepository.findAllByMobileName(mobileName);
		List<MobileDTO> mobileDtoList = new ArrayList<MobileDTO>();
		
		mobileList.forEach(m -> {
			m.getApps().forEach(a -> {
				MobileDTO md = new MobileDTO();
				md.setMobile_name(m.getMobileName());
				md.setApp_name(a.getAppName());
				mobileDtoList.add(md);
			});
		});
		
		return mobileDtoList;
	}
}
