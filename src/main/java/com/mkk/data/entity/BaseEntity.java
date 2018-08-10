package com.mkk.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 3967453158129709276L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private Long id;

    @Column(name = "CREATED_BY", length = 20)
    protected String createdBy;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdDate;
    @Column(name = "CREATED_MACHINE", length = 50)
    protected String createdMachine;
    @Column(name = "MODIFIED_BY", length = 20)
    protected String modifiedBy;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modifiedDate;
    @Column(name = "MODIFIED_MACHINE", length = 50)
    protected String modifiedMachine;

}