package com.example.basic.dto;

import com.example.basic.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class TagRequestDTO {
    private String name;

    @Builder
    public TagRequestDTO() {
        this.name = name;
    }

    public Tag toEntity() {
        return Tag.builder()
                .name(name)
                .build();
    }
}
