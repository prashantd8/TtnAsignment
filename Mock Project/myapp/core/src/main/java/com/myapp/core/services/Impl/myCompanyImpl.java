package com.myapp.core.services.Impl;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import com.myapp.core.services.MyCompany;

@Component(service = MyCompany.class, immediate =true)
@Designate(ocd = MyCompanyConfigration.class)
public class myCompanyImpl implements MyCompany{
	
String nameOfOrg;
String desc;
int noOfEmp;
String location;
String service;
@Activate
public void activate(MyCompanyConfigration config) {
	
	nameOfOrg = config.getOrganizationName_config();
	desc = config.getDescription_config();
	noOfEmp= config.getNoOfEmployees_config();
	location= config.getLocation_config();
	service = config.getServices_config();
}

@Override
public String getOrganizationName() {
	return nameOfOrg;
}
@Override
public String getDescription() {
	return desc;
}
@Override
public int getNoOfEmployees() {
	return noOfEmp;
}
@Override
public String getLocation() {
	return location;
}
@Override
public String getServices() {
	return service;
}
}
