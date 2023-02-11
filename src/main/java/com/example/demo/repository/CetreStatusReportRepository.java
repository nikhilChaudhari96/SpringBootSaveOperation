package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CentreStatusReport;

@Repository
public interface CetreStatusReportRepository extends CrudRepository<CentreStatusReport, Serializable>{
public  CentreStatusReport save( CentreStatusReport  centreStatusReport);
}
