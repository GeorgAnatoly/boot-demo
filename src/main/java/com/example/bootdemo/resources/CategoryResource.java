package com.example.bootdemo.resources;

import com.example.bootdemo.models.Category;
import com.example.bootdemo.vo.CategoryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

    @GetMapping("/{id}")
    public ResponseEntity<Category> findOne(@PathVariable String id) {
        return ResponseEntity.ok(new Category());
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Category(), new Category()));
    }

    @PostMapping
    public ResponseEntity<Category> newCategory(CategoryRequest categoryRequest) {
        return new ResponseEntity<>(new Category(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCategory(@PathVariable String id) {}

    @PutMapping("/{id")
    public ResponseEntity<Category> updateCategory(@PathVariable String id, CategoryRequest categoryRequest) {
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }
}
