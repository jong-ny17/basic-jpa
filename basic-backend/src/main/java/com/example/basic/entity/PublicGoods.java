package com.example.basic.entity;

import com.example.basic.dto.PublicGoodsRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PublicGoods", uniqueConstraints = {@UniqueConstraint(name = "id", columnNames = "id")})
public class PublicGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "available")
    private boolean available;
    @Column(name = "remark")
    private String remark;

    @Column(name = "createTime")
    private LocalDateTime createTime;

    @Builder
    public PublicGoods(String name, boolean available, String remark, LocalDateTime createTime) {
        this.name = name;
        this.available = available;
        this.remark = remark;
        this.createTime = createTime;
    }

    public PublicGoods(Long id, String remark, boolean available) {
        this.id = id;
        this.remark = remark;
        this.available = available;
    }

    public static PublicGoods modifyPublicGoods(Long id, PublicGoodsRequestDTO dto) {
        return new PublicGoods(id, dto.getRemark(), dto.isAvailable());

    }


}
