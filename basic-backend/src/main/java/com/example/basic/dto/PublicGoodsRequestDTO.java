package com.example.basic.dto;

import com.example.basic.entity.PublicGoods;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PublicGoodsRequestDTO {

    private String name;
    private boolean available;
    private String remark;
    private LocalDateTime createTime;

    @Builder
    public PublicGoodsRequestDTO(String name, boolean available, String remark, LocalDateTime createTime) {
        this.name = name;
        this.available = available;
        this.remark = remark;
        this.createTime = createTime;
    }

    public PublicGoods toEntity() {
        return PublicGoods.builder()
                .name(name)
                .available(available)
                .remark(remark)
                .createTime(LocalDateTime.now())
                .build();
    }
}
