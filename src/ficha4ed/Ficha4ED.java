/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ed;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Ficha4ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedQueue lista = new LinkedQueue();

        int escolha = 3;

        switch (escolha) {
            case 0:
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.toString());
                break;
            case 1:
                try {
                    //teste de remover um elemento com a lista vazia
                    lista.dequeue();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4ED.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                //Teste remover com apenas um elemento na lista
                try {
                    lista.enqueue(1);
                    lista.dequeue();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4ED.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
                
            case 3: 
                //Teste remover com varios elementos na lista
                try {
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.enqueue(4);
                    lista.dequeue();
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4ED.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
        }
    }

}
