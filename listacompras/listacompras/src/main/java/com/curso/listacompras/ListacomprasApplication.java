package com.curso.listacompras;

import com.curso.listacompras.models.Item;
import com.curso.listacompras.services.ItemService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListacomprasApplication {

	private static ItemService itemService;

	public ListacomprasApplication(ItemService itemService) {
		this.itemService = itemService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ListacomprasApplication.class, args);

		//Trabalhando com a criação de um item ESTÁ COMENTADO
		//Item item1 = new Item(, "", 5.00f);
		//itemService.salvarItem(item1);

		// bUSCANDO iTENS
		// itemService.buscarItemPorId(2);

		// Buscando todos os itens
		itemService.buscarTodosItens();
	}

}

// CHRISTIAN KURIAK CHUNG FERRARI
// ANDRÉ OLIVER
// FELIPE BASILIO ROMEU
