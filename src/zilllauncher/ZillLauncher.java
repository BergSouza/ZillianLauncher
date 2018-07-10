/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zilllauncher;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Bergson
 */
public class ZillLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:/ZillianLauncher/contas.zlc");
        if(file.exists()){
            Menu menu = new Menu();
            menu.mousedrag(menu);
        }else{
            Contas contas = new Contas();
            contas.mousedrag(contas);
        }
    }
    
}
