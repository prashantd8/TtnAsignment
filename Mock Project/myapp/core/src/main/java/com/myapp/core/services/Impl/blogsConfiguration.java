package com.myapp.core.services.Impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name= "Blogs Configuration")
public @interface blogsConfiguration {
	
@AttributeDefinition(name = "max_number" ,required = true,

		description ="Please enter the max_number")
int max_number_config() default 2;


}
