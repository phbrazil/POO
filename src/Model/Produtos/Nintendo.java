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
public class Nintendo extends Consoles{
    
            public String Nintendo(int idconsole) {
        if (idconsole == 1) {
            Fabricante = "Wii";
            return Fabricante;
        } else if (idconsole == 2) {
            Fabricante = "Switch";
            return Fabricante;
        }else if (idconsole == 3) {
            Fabricante = "Nintendo DS";
            return Fabricante;
        }

        return null;
    }
}
