package br.edu.senaisp.WebApi_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.WebApi_demo.model.Medico;

@Repository
public interface MedRepository extends JpaRepository<Medico, Integer>{

}
