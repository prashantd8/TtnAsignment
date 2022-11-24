package com.myapp.core.models;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;


@Model(adaptables = {Resource.class,SlingHttpServletRequest.class})
public class Footer {

    @ValueMapValue( injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "Copyright is a form of protection grounded in the U.S. Constitution ")
    private String linkText;



    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }
















}
