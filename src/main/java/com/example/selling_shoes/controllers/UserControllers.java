package com.example.selling_shoes.controllers;

import com.example.selling_shoes.models.tbl_use;
import com.example.selling_shoes.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class UserControllers {
    @Autowired
    UserServices userServices;

    @GetMapping("/api/user")
    public ResponseEntity<List<tbl_use>> getListUser(){
        return new ResponseEntity<>((List<tbl_use>) userServices.getAllUser(), HttpStatus.OK  );
    }
    @PostMapping("/api/user")
    public  ResponseEntity<List<tbl_use>> createUser(tbl_use users){
        userServices.saveUser(users);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
