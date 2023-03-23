package com.example.basic.dto;

import com.example.basic.entity.PublicGoods;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class PublicGoodsResponseDTO {

    private Long id;
    private String name;
    private boolean available;
    private String remark;
    private LocalDateTime createTime;

    public PublicGoodsResponseDTO(PublicGoods publicGoods) {
        this.id = publicGoods.getId();
        this.name = publicGoods.getName();
        this.available = publicGoods.isAvailable();
        this.remark = publicGoods.getRemark();
        this.createTime = publicGoods.getCreateTime();
    }

}
