package com.example.crud2.Repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.crud2.Models.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa,Long> {

}