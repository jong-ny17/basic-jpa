package com.example.basic.controller;

import com.example.basic.dto.TagRequestDTO;
import com.example.basic.dto.TagResponseDTO;
import com.example.basic.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/tags")
public class TagController {
    private final TagService tagService;

    @PostMapping
    public void createTag(@RequestBody TagRequestDTO dto) {
        tagService.createTag(dto);
    }

    @GetMapping
    public List<TagResponseDTO> getTagList() {
        System.err.println("???");
        return tagService.getTagList();
    }

    @GetMapping("/{id}")
    public TagResponseDTO getTag(@PathVariable Long id) {
        return tagService.getTag(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
    }

    @DeleteMapping
    public void deleteALl() {
        tagService.deleteAll();
    }

    @PutMapping("/{id}")
    public void modifyTag(@PathVariable Long id, @RequestBody TagRequestDTO dto) {
        tagService.modifyTag(id, dto);
    }


}
