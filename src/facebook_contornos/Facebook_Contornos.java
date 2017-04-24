
package facebook_contornos;

import javax.swing.JOptionPane;

public class Facebook_Contornos {

    public static void main(String[] args) {
        
        Metodos met=new Metodos();
        
        
        
        int opciones;
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("1- Ver TimeLine y buscar Trending \n2- Tweetear \n3- Enviar Mensaje Directo \n0- Salir"));
                switch(opciones){
                    case 1: 
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Error");
                }
            }while(opciones!=0);
    }
    
}