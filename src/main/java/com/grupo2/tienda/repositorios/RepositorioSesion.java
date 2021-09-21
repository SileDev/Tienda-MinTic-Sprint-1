package com.grupo2.tienda.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.grupo2.tienda.entidades.Usuarios;

//Esta interfaz se puede unificar con la de usuarios en general para un solo repositorio

@Repository
public interface RepositorioSesion extends CrudRepository <Usuarios , Long> {
	
	public Optional<Usuarios> findByUsuario(String usuario);

}
