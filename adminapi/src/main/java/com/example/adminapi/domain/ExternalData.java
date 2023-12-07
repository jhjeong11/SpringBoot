package com.example.adminapi.domain;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExternalData {

    private String id;
    private String title;
    private String name;
    private List<String> comments;

    public ExternalData(String id, String title, String name, List<String> comments) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.comments = comments;
    }
}
