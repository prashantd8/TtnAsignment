package com.myapp.core.services.Impl;

import com.myapp.core.services.PublishedBlogs;
import com.myapp.core.services.pagePath;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = pagePath.class)
@Designate(ocd = pagePathConfiguration.class)
public class pagePathImpl implements pagePath {
    int age;

    @Activate
    public void activate(pagePathConfiguration config) {
        age = config.max_Age();
    }

    @Override
    public int maxAge() {
        return age;
    }
}




