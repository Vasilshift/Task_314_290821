package com.example.vasil.controller;

import com.example.vasil.model.User;
import com.example.vasil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//    @GetMapping("/users/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id)
//            throws ResourceNotFoundException {
//        User user = UserRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//        return ResponseEntity.ok().body(user);
//    }
//
//    @PostMapping("/users")
//    public User createEmployee(@Valid @RequestBody User user) {
//        return UserRepository.save(user);
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity<User> updateEmployee(@PathVariable(value = "id") Long id,
//                                                   @Valid @RequestBody User UserDetails) throws ResourceNotFoundException {
//        User user = UserRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//
//        user.setEmailId(UserDetails.getEmailId());
//        user.setLastName(UserDetails.getLastName());
//        user.setFirstName(UserDetails.getFirstName());
//        final user updatedUser = UserRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//        employeeRepository.delete(employee);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }



}
