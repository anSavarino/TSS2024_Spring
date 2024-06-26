package com.savarino.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
}
