package com.Car4All.Proyecto.service;

import com.Car4All.Proyecto.entity.Auto;
import com.Car4All.Proyecto.entity.Categoria;
import com.Car4All.Proyecto.repository.AutoRepository;
import com.Car4All.Proyecto.repository.CategoriaRepository;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaService {
    private static final Logger logger=  LogManager.getLogger(CategoriaService.class);

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private AutoRepository autoRepository;

    public Categoria guardarCategoria(Categoria categoria){
        logger.info("Se esta llevando a cabo el proceso de Guardar Categoria");
        return categoriaRepository.save(categoria);
    }
    public Categoria actualizarCategoria(Categoria categoria){
        logger.info("Se esta llevando a cabo el proceso de Actualizar Categoria");
        return categoriaRepository.save(categoria);
    }
    public void eliminarCategoria(Long id){
        logger.info("Se esta llevando a cabo el proceso de Eliminar Categoria");
        categoriaRepository.deleteById(id);
    }
    public Optional<Categoria> buscarPorId(Long id){
        logger.info("Se esta llevando a cabo el proceso de buscar Categoria por Id");
        return categoriaRepository.findById(id);
    }
    public Optional<Categoria> buscarPorNombre(String nombre){
        logger.info("Se esta llevando a cabo el proceso de buscar Categoria por nombre");
        return categoriaRepository.findByNombre(nombre);
    }
    public List<Categoria> listarCategorias(){
        logger.info("Se esta llevando a cabo el proceso de Listar Categorias");
        return categoriaRepository.findAll();
    }
    public Optional<Categoria> agregarAutoACategoria(Long categoriaId, Long autoId) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(categoriaId);
        Optional<Auto> autoOptional = autoRepository.findById(autoId);

        if (categoriaOptional.isPresent() && autoOptional.isPresent()) {
            Categoria categoria = categoriaOptional.get();
            Auto auto = autoOptional.get();

            categoria.getAutos().add(auto);
            categoriaRepository.save(categoria);

            return Optional.of(categoria);
        } else {
            return Optional.empty();
        }
    }
    public Optional<Categoria> eliminarAutoDeCategoria(Long categoriaId, Long autoId) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(categoriaId);
        Optional<Auto> autoOptional = autoRepository.findById(autoId);

        if (categoriaOptional.isPresent() && autoOptional.isPresent()) {
            Categoria categoria = categoriaOptional.get();
            Auto auto = autoOptional.get();

            categoria.getAutos().remove(auto);
            categoriaRepository.save(categoria);

            return Optional.of(categoria);
        } else {
            return Optional.empty();
        }
    }
}

