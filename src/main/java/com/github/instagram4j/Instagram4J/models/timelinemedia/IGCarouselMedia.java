package com.github.instagram4j.Instagram4J.models.timelinemedia;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName("8")
public class IGCarouselMedia extends IGTimelineMedia {
    private int carousel_media_count;
    private List<IGCaraouselItem> carousel_media;
}