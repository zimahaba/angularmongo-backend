package com.zimahaba.angularmongo.entity.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class EntityDTO extends DTO {

    private String id;
    private String oneString;
    private Integer oneInteger;
    private Long oneLong;
    private BigDecimal oneDecimal;
    private LocalDate oneDate;
    private LocalTime oneTime;
}
