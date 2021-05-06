package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.models.User;
@Repository
public interface Userdao extends JpaRepository<User,Long> {

}
