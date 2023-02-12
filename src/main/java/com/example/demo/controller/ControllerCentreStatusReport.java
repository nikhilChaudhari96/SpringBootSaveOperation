package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CentreStatusReport;
import com.example.demo.service.CentreStatusReportService;

@RestController
@RequestMapping("/data")
public class ControllerCentreStatusReport {
@Autowired
private CentreStatusReportService centreStatusReportService;
@PostMapping("/savePost")
public ResponseEntity<CentreStatusReport> saveData(@RequestBody CentreStatusReport centreStatusReport) {
	CentreStatusReport centre =centreStatusReportService.saveCentreStatusReport(centreStatusReport);
	Map map=new HashMap();
	map.put(1, "nikhil");
	System.out.println(map);
	return ResponseEntity.ok().body(centre);

	
}
}
