package com.example.selling_shoes.services;

import com.example.selling_shoes.models.tbl_use;
import com.example.selling_shoes.repositorys.UserRepositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImps implements UserServices {
    @Autowired
    UserRepositorys userRepositorys;
    @Override
    public Iterable<tbl_use> getAllUser(){
        return userRepositorys.findAll();
    }

    @Override
    public tbl_use getUserById(Integer id){
        return  userRepositorys.findById(id).orElse(null);
    }
    @Override
    public void saveUser(tbl_use users) {
        userRepositorys.save(users);
    }
    @Override
    public  void deleteUser(Integer id){
         userRepositorys.deleteById(id);
    }
}
