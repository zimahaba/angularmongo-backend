package com.zimahaba.angularmongo.entity;


import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class ApplicationUser extends SuperEntity {

    @Transient
    private final String SEQUENCE_NAME = "user_sequence";

    private String username;
    private String password;

    @Override
    public String getSequenceName() {
        return SEQUENCE_NAME;
    }
}
