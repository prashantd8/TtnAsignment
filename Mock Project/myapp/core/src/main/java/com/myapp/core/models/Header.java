package com.myapp.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Header {


    @Inject
    @Default(values = "Bootcamp Blogs")
    @Required
    private String mainTitle;
    @Inject
    @Default(values = "/content/dam/myapp/ttn-logo.jpg")
    private String logo;


    @Inject
    private List<HeaderListItem> pagelist;

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<HeaderListItem> getPagelist() {
        return pagelist;
    }

    /*public void setPagelist(ArrayList<HeaderListItem> pagelist) {
        this.pagelist = pagelist;
    }*/


}
















