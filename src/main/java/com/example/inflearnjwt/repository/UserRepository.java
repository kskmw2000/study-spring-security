package com.example.inflearnjwt.repository;

import com.example.inflearnjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
// @Repository 라는 어노테이션이 없어도 IoC가 된다. 그 이유는 JpaRepository를 상속했기 때문이다.(SimpleJpaRepository 에 내용이 존재함)
public interface UserRepository extends JpaRepository<User, Long> {
    // findBy규칙 -> Username문법 : JPA Query Method
    // select * from user where username = 1?
    User findByUsername(String username);
}
