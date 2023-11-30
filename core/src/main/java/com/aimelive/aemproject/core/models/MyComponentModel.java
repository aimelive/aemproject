package com.aimelive.aemproject.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class MyComponentModel {
    private String myComponentText;

    @ValueMapValue(name = "jcr:title", injectionStrategy = InjectionStrategy.OPTIONAL)
    @Default(values = "No jcr title provided")
    protected String jcrTitle;

    @PostConstruct
    protected void init() {
        myComponentText = jcrTitle;
    }

    public String getMyComponentText() {
        return myComponentText;
    }
}
