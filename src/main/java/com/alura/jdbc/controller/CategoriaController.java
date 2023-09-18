package com.alura.jdbc.controller;


import java.util.List;

import com.alura.jdbc.CategoriaDAO.categoriaDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
	
	private categoriaDAO categoriaDAO;
	
	public CategoriaController() {
		var factory = new ConnectionFactory();
		this.categoriaDAO = new categoriaDAO(factory.recuperaConexion());
	}
	
	public List<Categoria> listar() {
		return categoriaDAO.listar();
	}

    public List<Categoria> cargaReporte() {    
        return this.categoriaDAO.listarConProductos();
    }

}
