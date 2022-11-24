package com.myapp.core.services.Impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name= "MyCompany Configration")
public @interface MyCompanyConfigration {
	
@AttributeDefinition(name = "Organization Name" ,required = true,

		description ="Please enter your organization name")
String getOrganizationName_config() default "To The New";
@AttributeDefinition(name = "Description" ,required = true,

description ="Please enter the company Details")
String getDescription_config() default "TO THE NEW is a digital technology company providing digital transformation and product engineering services to ISVs, Consumer Internet, and large enterprises across the globe. We design & build digital platforms and products with Cloud and Data at the focal point by working on cutting-edge technologies";

@AttributeDefinition(name = "Total Employee" ,required = true,

description ="Please enter Total Employee")
int getNoOfEmployees_config() default 14;

@AttributeDefinition(name = "Location" ,required = true,

description ="Please enter your location")
String getLocation_config() default "Noida";

@AttributeDefinition(name = "Total Employee" ,required = true,

description ="Please enter All Services")
String getServices_config() default "Digital_solution";



}
