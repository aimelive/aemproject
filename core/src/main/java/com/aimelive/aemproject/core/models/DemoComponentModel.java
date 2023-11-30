package com.aimelive.aemproject.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = Resource.class)
public class DemoComponentModel {
    @Inject
    @Named("jcr:title")
    private String title;

    @Inject
    @Optional
    private String customDescription;

    @PostConstruct
    protected void init() {
        String desc = StringUtils.isNotBlank(customDescription) ? customDescription.toUpperCase()
                : "Not Available";
        setCustomDescription(desc);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustomDescription() {
        return customDescription;
    }

    public void setCustomDescription(String customDescription) {
        this.customDescription = customDescription;
    }
}
