package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public UserDTO user(@RequestParam(name = "role", required = false) String role) {

        // Assuming UserDTO is a simple DTO (Data Transfer Object) class
        UserDTO user = new UserDTO("John Doe", 30, role.toString()); // Replace with actual data
        return user;
    }

    // Example DTO class
    public class UserDTO {
        private String name;
        private int age;
        private String role;

        // Constructors, getters, and setters
        public UserDTO(String name, int age, String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }
}
