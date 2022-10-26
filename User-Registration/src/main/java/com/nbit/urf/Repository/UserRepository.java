package com.nbit.urf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nbit.urf.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
