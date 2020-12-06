package pe.edu.tecsup.springbootapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springbootapp.models.Categoria;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> listar() throws Exception {
		return categoriaRepository.listar();
	}
}