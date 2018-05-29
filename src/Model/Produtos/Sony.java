/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Produtos;

/**
 *
 * @author Paulo.Bezerra
 */
public class Sony extends Consoles {

    public String Sony(int idconsole) {
        if (idconsole == 1) {
            Fabricante = "Playstation 1";
            return Fabricante;
        } else if (idconsole == 2) {
            Fabricante = "Playstatio 2";
            return Fabricante;
        }else if (idconsole == 3) {
            Fabricante = "Playstatio 3";
            return Fabricante;
        }else if (idconsole == 4) {
            Fabricante = "Playstatio 4";
            return Fabricante;
        }

        return null;
    }

}
