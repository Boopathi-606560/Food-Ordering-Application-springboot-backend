package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, String> {

}
