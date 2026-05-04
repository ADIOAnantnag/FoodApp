package org.example.foodapp.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
public class Response<T> {

    private String StatusCode;

    private String StatusMessage;
    private T data;
    private Map<String, Serializable> meta;
}
