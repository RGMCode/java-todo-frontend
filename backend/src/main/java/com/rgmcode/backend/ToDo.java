package com.rgmcode.backend;

import lombok.Data;

@Data
public class ToDo {

    private String id;
    private String description;
    private String status;

    public ToDo(String id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
}
