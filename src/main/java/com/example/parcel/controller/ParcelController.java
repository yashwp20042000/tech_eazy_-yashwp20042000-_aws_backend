
package com.example.parcel.controller;

import com.example.parcel.entity.Parcel;
import com.example.parcel.service.ParcelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcels")
public class ParcelController {
    private final ParcelService service;

    public ParcelController(ParcelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Parcel> getAllParcels() {
        return service.getAllParcels();
    }

    @PostMapping
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return service.saveParcel(parcel);
    }
}
