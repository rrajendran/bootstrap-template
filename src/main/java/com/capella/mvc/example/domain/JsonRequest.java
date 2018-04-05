package com.capella.mvc.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright 2018 (c) Mastek UK Ltd
 * <p>
 * Created on : 24/03/2018
 *
 * @author Ramesh Rajendran
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JsonRequest {
    private String provider;
    private String jsonPath;
    private Object data;
}
