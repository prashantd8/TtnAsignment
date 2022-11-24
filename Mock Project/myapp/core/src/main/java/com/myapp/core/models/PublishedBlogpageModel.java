package com.myapp.core.models;

//import com.myapp.core.services.PublishedBlogs;
import com.myapp.core.services.BlogService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.myapp.core.services.PublishedBlogs;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PublishedBlogpageModel {

    @Inject
    private List<BlogFields> publishedBlogs;

    @OSGiService
    BlogService blogService;

    int numBlogs;

    public List<BlogFields> getPublishedBlogs() {
        return publishedBlogs;
    }
//
    public int getNumBlogs() {
        return blogService.max_number()-1;
    }
}
