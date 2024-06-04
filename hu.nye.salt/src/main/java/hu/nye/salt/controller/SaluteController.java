package hu.nye.salt.controller;

import java.util.List;

import hu.nye.salt.entity.SaluteEntity;
import hu.nye.salt.request.SaluteRequest;
import hu.nye.salt.service.ISaluteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaluteController {

    @Autowired
    private ISaluteService saluteService;

    @PostMapping ("/salute")
    public SaluteEntity saveSalute(@RequestBody @Valid SaluteRequest request) {
        return saluteService.saveSalute(request);
    }
    @GetMapping("/salute/{id}")
    public SaluteEntity getSalute(@PathVariable("id") Long id) {
        return saluteService.getSaluteById(id);
    }
    @PutMapping("/salute/{id}")
    public SaluteEntity saveSalute(@PathVariable("id") Long id, @RequestBody SaluteRequest request)  {
        return saluteService.updateSalute(id, request);
    }
    @DeleteMapping("/salute/{id}")
    public void deleteSalute(@PathVariable("id") Long id) {
        saluteService.deleteSaluteById(id);
    }
    @GetMapping("/salute/location/{location}")
    public List<SaluteEntity> getAllSaluteByLocation(@PathVariable("location") String location) {
        return saluteService.findAllByLocation(location);
    }
}

