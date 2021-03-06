package com.victor.colegio.service.serviceImpl;

import com.victor.colegio.entity.Asignatura;
import com.victor.colegio.repository.AsignaturaRepository;
import com.victor.colegio.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Autor: Víctor Fonseca
 */

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> obtenerAsignaturas() {
        return (List<Asignatura>) asignaturaRepository.findAll();
    }

    @Override
    public Optional<Asignatura> obtenerAsignaturaPorId(Long id) {
        return asignaturaRepository.findById(id);
    }

    @Override
    public List<Asignatura> obtenerAsignaturasPorProfesor(Long id) {
        return asignaturaRepository.obtenerAsignaturasPorProfesor(id);
    }
}
