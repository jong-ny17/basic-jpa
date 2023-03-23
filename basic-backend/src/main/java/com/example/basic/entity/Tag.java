package com.example.basic.entity;

import com.example.basic.dto.TagRequestDTO;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Getter
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tag", uniqueConstraints = {@UniqueConstraint(name = "id", columnNames = "id")})
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", columnDefinition = "varchar(50) default 'unrecognizableUser'")
    private String name;

    @Builder
    public Tag(String name) {
        this.name = name;
    }

    public static Tag modifyTag(Long id, TagRequestDTO dto) {
        return new Tag(id, dto.getName());
    }
}
