
package com.example.parcel.service;

import com.example.parcel.entity.Parcel;
import com.example.parcel.repository.ParcelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelService {
    private final ParcelRepository repository;

    public ParcelService(ParcelRepository repository) {
        this.repository = repository;
    }

    public List<Parcel> getAllParcels() {
        return repository.findAll();
    }

    public Parcel saveParcel(Parcel parcel) {
        return repository.save(parcel);
    }
}
