package com.zimahaba.angularmongo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "entity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Entity extends SuperEntity {

    @Transient
    private final String SEQUENCE_NAME = "entity_sequence";

    private String oneString;
    private Integer oneInteger;
    private Long oneLong;
    private BigDecimal oneDecimal;
    private LocalDate oneDate;
    private LocalTime oneTime;

    @Override
    public String getSequenceName() {
        return SEQUENCE_NAME;
    }
}
