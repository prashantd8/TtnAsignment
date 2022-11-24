package com.myapp.core.services.Impl;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Published Blogs")
public @interface publishedBlogsConfiguration {

    @AttributeDefinition(name = "Enter Number Of Blogs")
    int noOfBlogs();

}
