package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController //bu classın bir controller class olduğunu tanımlar
@RequestMapping("/api/v1/user") // hangi url den gelindiğinnde bu classın çalışacağını belirtir
public class RestController {

    private UserService userService;

    public RestController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}") // urlden parametre almak istiyorsak bu şekilde tanımlanır @PathVariable ile alınır
    public User get(@PathVariable("id") Long id){
        return userService.get(id);
    }

    @GetMapping //herhangi bir parametre vermezsek requestmapping de tanımlanan url direk kulanılır o kök url olarak düşünülebilir
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public String save(@RequestBody User user){ //@RequestBody sorguda body den gönderilen veriyi almak için kullanılır
        return userService.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return userService.delete(id);
    }

}
