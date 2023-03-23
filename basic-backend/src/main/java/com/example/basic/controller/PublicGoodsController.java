package com.example.basic.controller;

import com.example.basic.dto.PublicGoodsRequestDTO;
import com.example.basic.dto.PublicGoodsResponseDTO;
import com.example.basic.service.PublicGoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/publicGoods")
public class PublicGoodsController {

    private final PublicGoodsService service;

    @GetMapping("/{id}")
    public PublicGoodsResponseDTO getPublicGoods(@PathVariable Long id) {
        return service.getPublicGoods(id);
    }

    @GetMapping
    public List<PublicGoodsResponseDTO> getPublicGoodsList() {
        return service.getPublicGoodsList();
    }

    @PostMapping
    public void createPublicGoods(@RequestBody PublicGoodsRequestDTO dto) {
        service.createPublicGoods(dto);
    }

    @PutMapping("/{id}")
    public void modifyPublicGoods(@PathVariable Long id, @RequestBody PublicGoodsRequestDTO dto) {
        service.modifyPublicGoods(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletePublicGoods(@PathVariable Long id) {
        service.deletePublicGoods(id);
    }

    @DeleteMapping
    public void deleteAllGoods(){
        service.deleteAllPublicGoods();
    }
}
