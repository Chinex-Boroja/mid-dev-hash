package org.chinexboroja.core.model;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {

    private Long id;
    private String slug;
    private String title;
    private String description;
    private String body;
    private String favoritesCount;
    private Instant createdAt;
    private Instant updatedAt;
    private Profile author;

}
