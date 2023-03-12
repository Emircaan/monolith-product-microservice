package com.example.Product.controller;

import com.example.Product.entities.Phones;
import com.example.Product.entities.PhonesDTO;
import com.example.Product.repository.ProductRepository;
import com.example.Product.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class ProductController {

 @Autowired
    private ProductRepository repository;
 @Autowired
 private PhoneService phoneService;
@PutMapping("/add")
public ResponseEntity<PhonesDTO> createProduct(@RequestBody PhonesDTO phoneDto) {
    PhonesDTO createdPhoneDto = phoneService.addPhone(phoneDto);
    return new ResponseEntity<>(createdPhoneDto, HttpStatus.CREATED);
}
@GetMapping("/find/{id}")
    public Optional<PhonesDTO> findById(@PathVariable int id) {
    return phoneService.findById(id);

}
@GetMapping("/getAll")
    public List<PhonesDTO> getAllPhones(){
    return phoneService.getAllPhones();
}
    @PutMapping("/update/{id}")
    public ResponseEntity<PhonesDTO> updatePhone(@PathVariable(value = "id") int id,
                                              @RequestBody PhonesDTO updatedPhone) {
        PhonesDTO createdPhoneDto = phoneService.addPhone(updatedPhone);
        return new ResponseEntity<>(createdPhoneDto, HttpStatus.CREATED);

    }



}
