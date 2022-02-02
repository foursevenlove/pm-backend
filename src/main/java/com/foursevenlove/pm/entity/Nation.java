package com.foursevenlove.pm.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Nation implements Serializable {
    private Integer id;

    private String name;

}