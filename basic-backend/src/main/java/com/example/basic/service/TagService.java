package com.example.basic.service;

import com.example.basic.dto.TagRequestDTO;
import com.example.basic.dto.TagResponseDTO;
import com.example.basic.entity.Tag;
import com.example.basic.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TagService {

    @Autowired
    private TagRepository repository;



    public void createTag(TagRequestDTO body){
        repository.save(body.toEntity());
    }

    public TagResponseDTO getTag(Long id) {
        return new TagResponseDTO(repository.findById(id).get());
    }

    public List<TagResponseDTO> getTagList(){
        List<TagResponseDTO> dtoList = new ArrayList<>();
        repository.findAll().forEach(item -> {
            dtoList.add(new TagResponseDTO(item));
        });
      return dtoList;
    }

    public void deleteTag(Long id) {
        Tag tags = repository.findById(id).orElseThrow(NoSuchElementException::new);
        repository.deleteById(tags.getId());
    }

    public void deleteAll(){
        repository.deleteAll();
    }

    public void modifyTag(Long id , TagRequestDTO tag) {
        Tag tags = repository.findById(id).orElseThrow(NoSuchElementException::new);
        repository.save(Tag.modifyTag(tags.getId(), tag));
    }
}
