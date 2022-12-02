package com.myapp.core.models;

import javax.inject.Inject;

import com.day.cq.commons.inherit.HierarchyNodeInheritanceValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = {SlingHttpServletRequest.class,Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class ModelForConversion {


    @Inject

    private Page currentPage;

    public int getNum() {
        InheritanceValueMap inheritedProperties = new
                HierarchyNodeInheritanceValueMap(currentPage.getContentResource());
            return inheritedProperties.getInherited("num", Integer.class) - 1;
        }
}
//inheritance value map


//        ValueMap v = currentPage.getProperties();
//        return v.get("num",Integer.class)-1;


//    public int getNum() {
//        InheritanceValueMap inheritedProperties = new
//                HierarchyNodeInheritanceValueMap(currentPage.getContentResource());
//        if (inheritedProperties.get("num") == null) {
//            return 4;
//        } else {
//            return inheritedProperties.getInherited("num", Integer.class) - 1;
//        }
//    }
//}