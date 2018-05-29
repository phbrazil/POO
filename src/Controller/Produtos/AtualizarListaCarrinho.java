package Controller.Produtos;

import Model.Produtos.Games;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.hbezerra
 */
public class AtualizarListaCarrinho {

    private static java.util.List<Games> listaCarrinho = new ArrayList<Games>();

    
    public void inserirProduto(Games produtos) {
        listaCarrinho.add(produtos);

    }

    public void RemoverProduto(int indice) {
        listaCarrinho.remove(indice);

    }

    public static Games atualizarListaCarrinho() {
        if (!listaCarrinho.isEmpty()) {
            for (int i = 0; i < listaCarrinho.size(); i++) {
                if (listaCarrinho.get(i) != null) {
                    return listaCarrinho.get(i);

                }
            }
        }
        return null;
    }
    
     public static Games pesquisarProduto(int indice) {
        if (!listaCarrinho.isEmpty()) {
            for (int i = 0; i < listaCarrinho.size(); i++) {
                if (listaCarrinho.get(indice) != null) {
                    return listaCarrinho.get(indice);

                }
            }
        }
        return null;
    }

    public int TamanhoListaCarrinho() {
        return listaCarrinho.size();
    }

}
