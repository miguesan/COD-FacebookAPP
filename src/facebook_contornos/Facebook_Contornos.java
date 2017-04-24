
package facebook_contornos;

import javax.swing.JOptionPane;

public class Facebook_Contornos {

    public static void main(String[] args) {
        
        Metodos met=new Metodos();
        
        
        
        int opciones;
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("1- Cambiar Estado \n2- 'Me Gusta' un Post \n3- Publicar Imagen \n4- Buscar en TimeLine \n5- Comentar Publicacion \n6- Publicar Comentario/Estado \n0- Salir"));
                switch(opciones){
                    case 1:
                        met.cambEstado();
                        break;
                    case 2:
                        met.darGusta();
                        break;
                    case 3:
                        met.pubImagen();
                        break;
                    case 4:
                        met.lineaTiempo();
                        break;
                    case 5:
                        met.comentariosPublicacion();
                        break;
                    case 6:
                        met.comentar();
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