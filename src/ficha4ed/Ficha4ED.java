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

        int escolha = 9;

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
            case 4:
                //Teste retornar front da lista
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                lista.enqueue(4);

                try {
                    System.out.println("Primeiro: " + lista.first());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4ED.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println(lista.toString());
                break;
            case 5:

                try {
                    //Teste retornar primeiro da lista vazia
                    System.out.println(lista.first());
                } catch (EmptyCollectionException2 ex) {
                    Logger.getLogger(Ficha4ED.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println(lista.toString());
                break;
                
            case 6:
                //Teste para verificar se a lista esta vazia
                System.out.println(lista.isEmpty());
                break;
                
            case 7: 
                //Teste para verificar se a lista esta vazia
                lista.enqueue(1);
                System.out.println(lista.isEmpty());
                break;
                
            case 8:
                //Teste size com lista Vazia
                System.out.println(lista.size());
                break;
                
            case 9:
                //Teste size com elementos na lista
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.size());
        }
    }

}
