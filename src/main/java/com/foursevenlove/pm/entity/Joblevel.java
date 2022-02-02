package com.foursevenlove.pm.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Joblevel implements Serializable {
    private Integer id;

    private String name;

    private String titleLevel;

}