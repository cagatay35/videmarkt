package com.mkk.data.dto;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class VideoDto implements Serializable {
    private String name;

    private String description;

    private Date produceDate;
}
