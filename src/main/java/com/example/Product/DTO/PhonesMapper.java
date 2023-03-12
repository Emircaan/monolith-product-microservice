package com.example.Product.DTO;

import com.example.Product.entities.Phones;
import com.example.Product.entities.PhonesDTO;
import org.springframework.stereotype.Component;

@Component

public class PhonesMapper {


        public PhonesDTO toDTO(Phones phone) {
            PhonesDTO phoneDTO = new PhonesDTO();
            phoneDTO.setId(phone.getId());
            phoneDTO.setBrand(phone.getBrand());
            phoneDTO.setModel(phone.getModel());
            phoneDTO.setPrice(phone.getPrice());
            return phoneDTO;
        }

        public Phones toEntity(PhonesDTO phoneDTO) {
            Phones phone = new Phones();
            phone.setId(phoneDTO.getId());
            phone.setBrand(phoneDTO.getBrand());
            phone.setModel(phoneDTO.getModel());
            phone.setPrice(phoneDTO.getPrice());
            return phone;
        }

}
