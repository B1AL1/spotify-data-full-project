package com.bialy.spotifydatarestapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document
public class RecordData {
    @Id
    private String id;
    @Field(name = "artist")
    private String artist;
    @Field(name = "chart")
    private String chart;
    @Field(name = "date")
    private Date date;
    @Field(name = "rank")
    private int rank;
    @Field(name = "region")
    private String region;
    @Field(name = "streams")
    private int streams;
    @Field(name = "title")
    private String title;
    @Field(name = "trend")
    private String trend;
    @Field(name = "url")
    private String url;
}
