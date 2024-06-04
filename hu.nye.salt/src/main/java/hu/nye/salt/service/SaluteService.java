package hu.nye.salt.service;

import java.util.List;

import hu.nye.salt.entity.SaluteEntity;
import hu.nye.salt.exception.SaluteNotFoundException;
import hu.nye.salt.repository.ISaluteRepository;
import hu.nye.salt.request.SaluteRequest;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaluteService implements ISaluteService{

    @Autowired
    private ISaluteRepository saluteRepository;
    @Override
    public SaluteEntity saveSalute(SaluteRequest saluteRequest) {
        SaluteEntity saluteEntity = SaluteEntity.builder()
                .size(saluteRequest.getSize())
                .activity(saluteRequest.getActivity())
                .location(saluteRequest.getLocation())
                .unit(saluteRequest.getUnit())
                .time(saluteRequest.getTime())
                .equipment(saluteRequest.getEquipment())
                .build();
        return saluteRepository.save(saluteEntity);
    }

    @Override
    @SneakyThrows
    public SaluteEntity getSaluteById(Long id) {
        return saluteRepository.findById(id).orElseThrow(SaluteNotFoundException::new);
    }

    @Override
    @SneakyThrows
    public SaluteEntity updateSalute(Long id, SaluteRequest saluteRequest) {
        SaluteEntity saluteEntity = saluteRepository.findById(id).orElseThrow(SaluteNotFoundException::new);
        saluteEntity.setSize(saluteRequest.getSize());
        saluteEntity.setActivity(saluteRequest.getActivity());
        saluteEntity.setLocation(saluteRequest.getLocation());
        saluteEntity.setUnit(saluteRequest.getUnit());
        saluteEntity.setTime(saluteRequest.getTime());
        saluteEntity.setEquipment(saluteRequest.getEquipment());
        saluteEntity.setRegistrationTime(saluteRequest.getRegistrationTime());
        return saluteRepository.save(saluteEntity);
    }

    @Override
    public void deleteSaluteById(Long id) {
    saluteRepository.deleteById(id);
    }

    @Override
    public List<SaluteEntity> findAllByLocation(String location) {
        return saluteRepository.findAllByLocation(location);
    }
}
