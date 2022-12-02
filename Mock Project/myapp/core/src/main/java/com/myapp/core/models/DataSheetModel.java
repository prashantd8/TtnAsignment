package com.myapp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import java.util.Iterator;

@Model(adaptables = Resource.class)
public class DataSheetModel {
    @SlingObject
    ResourceResolver resourceResolver;

    public String getName() {
        return resourceResolver.getResource("/content/myapp/dataNode").getName();
    }

    public String getPath() {
        return resourceResolver.getResource("/content/myapp/dataNode").getPath();
    }

    private String path;

    private String name;

    public Iterator<Resource> getAllChildren() {
        return resourceResolver.getResource("/content/myapp/dataNode").listChildren();
    }
}
//
