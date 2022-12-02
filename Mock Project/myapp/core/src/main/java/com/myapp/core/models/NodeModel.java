package com.myapp.core.models;

import com.myapp.core.services.pagePath;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import java.util.List;


    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class NodeModel {



        @OSGiService
        pagePath pagepath;

        public int getAge() {
            return pagepath.maxAge();
        }

        int age;

    }


