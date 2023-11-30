package com.aimelive.aemproject.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Button {

    @Inject
    private String title;

    @Inject
    private String link;

    public String getTitle() {
        return StringUtils.isNotBlank(title) ? title : "Button";
    }

    public String getLink() {
        return StringUtils.isNotBlank(link) ? link : "#";
    }

    @PostConstruct
    protected void init() {

    }
}
