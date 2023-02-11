package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CentreStatusReport;
import com.example.demo.repository.CetreStatusReportRepository;
@Service
public class CentreStatusReportServiceImp implements CentreStatusReportService {
@Autowired
private CetreStatusReportRepository cetreStatusReportRepository;
	@Override
	public CentreStatusReport saveCentreStatusReport(CentreStatusReport centreStatusReport) {
		CentreStatusReport  centre =cetreStatusReportRepository.save(centreStatusReport);

		System.out.println("this is service nikhil");

		

		return  centre;
	}

}
