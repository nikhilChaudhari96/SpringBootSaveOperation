package com.example.demo.controller;

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
public ResponseEntity<CentreStatusReport> saveReport(@RequestBody CentreStatusReport centreStatusReport) {
	CentreStatusReport centre =centreStatusReportService.saveCentreStatusReport(centreStatusReport);
	return ResponseEntity.ok().body(centre);
}
private void sout() {
	// TODO Auto-generated method stub

}
}
