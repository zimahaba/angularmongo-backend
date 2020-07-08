package com.zimahaba.angularmongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class SuperEntity {

    @Id
    private String id;

    public abstract String getSequenceName();
}
