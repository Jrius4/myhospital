package mycampus.mycampus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mycampus.mycampus.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{

    
} 
