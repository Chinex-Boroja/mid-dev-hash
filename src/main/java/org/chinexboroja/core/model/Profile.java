package org.chinexboroja.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

    private Long id;
    private String username;
    private String bio;
    private String image;
}
