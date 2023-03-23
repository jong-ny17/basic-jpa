package com.example.basic.dto;

import com.example.basic.entity.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TagResponseDTO {

    private Long id;
    private String name;

    public TagResponseDTO(Tag tag) {
        this.id = tag.getId();
        this.name = tag.getName();
    }
}
