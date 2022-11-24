package com.myapp.core.models;

import com.day.cq.commons.inherit.HierarchyNodeInheritanceValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CurrentPageModel {
    @Inject
    private Page currentPage;

    public int getHead() {

            InheritanceValueMap inheritedProperties = new
                    HierarchyNodeInheritanceValueMap(currentPage.getContentResource());
            if (inheritedProperties.get("head") == null) {
                return 4;
            } else {
                return inheritedProperties.getInherited("head", Integer.class) - 1;
            }
        }
    }



