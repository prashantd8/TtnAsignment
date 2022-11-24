package com.myapp.core.models.carousel;
import com.myapp.core.models.carousel.BannerItem;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class)
public class CarouselModel {
    @Inject
    private List<BannerItem> fieldList;
    public List<BannerItem> getFieldList() {
        return fieldList;
    }
}