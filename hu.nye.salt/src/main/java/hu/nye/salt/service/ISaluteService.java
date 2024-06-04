package hu.nye.salt.service;

import java.util.List;

import hu.nye.salt.entity.SaluteEntity;
import hu.nye.salt.request.SaluteRequest;

public interface ISaluteService {
    SaluteEntity saveSalute(SaluteRequest saluteRequest);
    SaluteEntity getSaluteById(Long id);
    SaluteEntity updateSalute(Long id, SaluteRequest saluteRequest);
    void deleteSaluteById(Long id);
    List<SaluteEntity> findAllByLocation(String location);
}
