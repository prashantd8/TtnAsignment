package com.myapp.core.services.Impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "pagePath Configuration")
public @interface pagePathConfiguration {

    @AttributeDefinition(name = "Enter the criteria age")
    int max_Age();

}

