package com.example.demo.Models;

import java.io.Serializable;

public enum Quadrant implements Serializable {
    NQ1("North Quadrant 1 - Must only be observed using the North Gemini observatory"),
    NQ2("North Quadrant 2 - Must only be observed using the North Gemini observatory"),
    NQ3("North Quadrant 3 - Must only be observed using the North Gemini observatory"),
    NQ4("North Quadrant 4 - Must only be observed using the North Gemini observatory"),
    SQ1("South Quadrant 1 - Must only be observed using the South Gemini observatory"),
    SQ2("South Quadrant 2 - Must only be observed using the South Gemini observatory"),
    SQ3("South Quadrant 3 - Must only be observed using the South Gemini observatory"),
    SQ4("South Quadrant 4 - Must only be observed using the South Gemini observatory");

    private final String description;

    Quadrant(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
