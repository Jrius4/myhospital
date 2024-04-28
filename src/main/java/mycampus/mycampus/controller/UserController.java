package mycampus.mycampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mycampus.mycampus.entities.UserEntity;
import mycampus.mycampus.repositories.UserRepository;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserEntity> users() {
        return userRepository.findAll();
    }

    // public void createUser(String username, String password) {
    //     repository.save(new userEntity(username, password));
    // }

}
