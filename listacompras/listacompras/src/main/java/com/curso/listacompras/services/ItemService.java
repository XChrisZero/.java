package com.curso.listacompras.services;

import com.curso.listacompras.models.Item;
import com.curso.listacompras.repositories.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    //Injetando dependências
    @Autowired
    private ItemRepo itemRepo;

    //Métod0 responsável pelo service de salvamento de um novo item
    public Item salvarItem(Item item) {

        System.out.println("Item " + item + " salvo com sucesso" );
        return itemRepo.save(item);
    }

    //Métod0 responsável pelo service de busca do item por id
    public Item buscarItemPorId(Integer id) {

        Item findedItem = itemRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));

        System.out.println(findedItem);

        return findedItem;
    }

    //Métod0 responsável pelo service de busca por todos os clientes
    public List<Item> buscarTodosItens() {
        List<Item> customers = new ArrayList<>();
        itemRepo.findAll().forEach(customers::add);

        customers.forEach(aItem -> System.out.println(aItem));

        return customers;
    }
}
