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
public class Microsoft extends Consoles{
    
        public String Microsoft(int idconsole) {
        if (idconsole == 1) {
            Fabricante = "Xbox";
            return Fabricante;
        } else if (idconsole == 2) {
            Fabricante = "Xbox 360";
            return Fabricante;
        }else if (idconsole == 3) {
            Fabricante = "Xbox One";
            return Fabricante;
        }

        return null;
    }
    
    
    
}
