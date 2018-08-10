package com.mkk.data.dto;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
public class CustomerDto implements Serializable {
    private Long id;

    private String name;

    private String surname;

    private String email;

    private Date memberDate;
}
