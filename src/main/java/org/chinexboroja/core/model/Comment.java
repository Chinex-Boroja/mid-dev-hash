package org.chinexboroja.core.model;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Long id;
    private String body;
    private Instant createdAt;
    private Instant updatedAt;
    private Profile author;


}
