package com.example.selling_shoes.repositorys;

import com.example.selling_shoes.models.tbl_use;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorys extends JpaRepository<tbl_use, Integer> {
}
