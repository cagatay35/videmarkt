package com.mkk.rest.response;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ControllerResponse implements Serializable {
    private String resultDesc = "success";
    private int resultCode = 0;
    private Map<String, Object> data = new HashMap<>();

    public void add(String key, Object val) {
        getData().put(key, val);
    }

    public Map<String, Object> getData() {
        if (data == null) {
            data = new HashMap<>();
        }
        return data;
    }
}
