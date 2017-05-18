package com.eccom.demo.repository;

import com.eccom.demo.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zyn on 5/18/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
