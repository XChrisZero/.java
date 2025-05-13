package com.curso.listacompras.repositories;

import com.curso.listacompras.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends CrudRepository <Item, Integer> {

}
