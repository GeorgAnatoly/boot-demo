package com.example.bootdemo.resources;

import com.example.bootdemo.models.User;
import com.example.bootdemo.vo.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @GetMapping("/{id}")
    public ResponseEntity<User> findOne(@PathVariable String id) {
        return ResponseEntity.ok(new User());
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new User(), new User()));
    }

    @PostMapping
    public ResponseEntity<User> newUser(UserRequest userRequest) {
        return new ResponseEntity<>(new User(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeUser(@PathVariable String id) {}

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, User userRequest) {
        return new ResponseEntity<>(new User(), HttpStatus.OK);
    }
}
