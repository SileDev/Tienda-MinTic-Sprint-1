package com.grupo2.tienda.controladores;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.grupo2.tienda.implemetaciones.ImplementacionUsuarios;

@Component
public class ControladorBaseDatos {
	
	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource fuenteDatos = new DriverManagerDataSource();
		
		fuenteDatos.setDriverClassName("com.mysql.cj.jdbc.Driver");
		fuenteDatos.setUrl("jdbc:mysql://localhost/tiendagenerica");
		fuenteDatos.setUsername("root");
		fuenteDatos.setPassword("0170d0i2c");

		return fuenteDatos;
		
	}
	
	@Bean
	public ImplementacionUsuarios getImplementacionUsuarios() {
		
		return new ImplementacionUsuarios(getDataSource());
		
	}

}
