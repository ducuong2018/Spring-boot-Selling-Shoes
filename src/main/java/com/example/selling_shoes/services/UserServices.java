package com.example.selling_shoes.services;

import com.example.selling_shoes.models.tbl_use;

public interface UserServices {
    Iterable<tbl_use> getAllUser();
    tbl_use getUserById(Integer id);
    void saveUser(tbl_use users);
    void deleteUser(Integer id);
}
