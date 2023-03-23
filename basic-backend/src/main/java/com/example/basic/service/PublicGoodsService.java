package com.example.basic.service;

import com.example.basic.dto.PublicGoodsRequestDTO;
import com.example.basic.dto.PublicGoodsResponseDTO;
import com.example.basic.entity.PublicGoods;
import com.example.basic.repository.PublicGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PublicGoodsService {

    @Autowired
    private PublicGoodsRepository repository;


    public void createPublicGoods(PublicGoodsRequestDTO dto) {
        repository.save(dto.toEntity());
    }

    public void modifyPublicGoods(Long id, PublicGoodsRequestDTO dto) {
        PublicGoods goods = repository.findById(id).orElseThrow(NoSuchElementException::new);
        repository.save(PublicGoods.modifyPublicGoods(goods.getId(), dto));
    }


    public List<PublicGoodsResponseDTO> getPublicGoodsList() {
        List<PublicGoodsResponseDTO> list = new ArrayList<>();
        repository.findAll().forEach(element -> {
            list.add(new PublicGoodsResponseDTO(element));
        });
        return list;
    }

    public PublicGoodsResponseDTO getPublicGoods(Long id) {
        return new PublicGoodsResponseDTO(repository.findById(id).get());
    }

    public void deletePublicGoods(Long id) {
        PublicGoods goods = repository.findById(id).orElseThrow(NoSuchElementException::new);
        repository.deleteById(goods.getId());
    }

    public void deleteAllPublicGoods() {
        repository.deleteAll();
    }

}
