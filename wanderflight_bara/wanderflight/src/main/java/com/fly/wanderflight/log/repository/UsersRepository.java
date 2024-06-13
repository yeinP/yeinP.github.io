package com.fly.wanderflight.log.repository;

import com.fly.wanderflight.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
