package com.zimahaba.angularmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseSequence {

    private String id;
    private Long sequence;
}
