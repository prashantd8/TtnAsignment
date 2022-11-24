package com.myapp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class listof {

    @Inject
    @Default(values = "Banner1")
    @Required

    private String image1;

    @Inject
    private String heading1;

    @Inject
    @Default(values = "/content/dam/myapp/1.jpg")
    private String headlink1;
    @Inject
    private String subheading1;
    @Inject
    private String copylink1;

    public String getImage1() {
        return image1;
    }

    public String getHeading1() {
        return heading1;
    }

    public String getHeadlink1() {
        return headlink1;
    }

    public String getSubheading1() {
        return subheading1;
    }

    public String getCopylink1() {
        return copylink1;
    }

}