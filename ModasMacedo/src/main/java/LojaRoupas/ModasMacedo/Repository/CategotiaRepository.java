package LojaRoupas.ModasMacedo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LojaRoupas.ModasMacedo.Model.Categoria;


@Repository
public interface CategotiaRepository extends JpaRepository<Categoria,Long> {
	
	public List <Categoria>findAllByNomeContainingIgnoreCase(String nome);

	
}
