package com.fernanda.gonzalez.service;

import java.util.List;

import com.fernanda.gonzalez.model.Producto;

public interface IntProductoService {
	//lógica de negocio
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar (Integer idProducto);
	public Producto buscarPorId(Integer idProducto);
	

}
