package org.chinexboroja.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleIdTag {

    private Long articleId;
    private String tag;
}
