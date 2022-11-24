package com.myapp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class)
public class blogmodel {
    private int max_number;

    @OSGiService

    public int getMax_number() {

        return max_number;
    }


}

