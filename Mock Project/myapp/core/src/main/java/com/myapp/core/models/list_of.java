package com.myapp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class)
public class list_of {
    @Inject
    private List<listof> fieldList;
    public List<listof> getFieldList() {
        return fieldList;
    }
}