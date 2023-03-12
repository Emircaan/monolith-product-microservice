package com.example.Product.service;

import com.example.Product.DTO.PhonesMapper;
import com.example.Product.entities.Phones;
import com.example.Product.entities.PhonesDTO;
import com.example.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PhoneService {
    @Autowired
    ProductRepository repository;
    @Autowired
    private PhonesMapper phonesMapper;

    public PhonesDTO addPhone(PhonesDTO phoneDto) {
        Phones phone = phonesMapper.toEntity(phoneDto);
        phone = repository.save(phone);
        return phonesMapper.toDTO(phone);
    }


    public List<PhonesDTO> getAllPhones() {
        List<Phones> phones = repository.findAll();
        return phones.stream()
                .map(phonesMapper::toDTO)
                .collect(Collectors.toList());

    }

    public Optional<PhonesDTO> findById(int id) {
        Optional<Phones> phone = Optional.ofNullable(repository.findById(id));
        return phone.map(phonesMapper::toDTO);

    }

    public Phones updatePhone(int id , PhonesDTO updatedPhone) {
        Phones phone = repository.findById(id);
        if (phone == null) {
            throw new IllegalArgumentException("Updated phone cannot be null");
        }
        phone.setId(updatedPhone.getId());
        phone.setBrand(updatedPhone.getBrand());
        phone.setModel(updatedPhone.getModel());
        phone.setPrice(updatedPhone.getPrice());
        return repository.save(phone);

    }


}

