
package facebook_contornos;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */

public class Metodos {
    
    
    
    public Facebook facebook;
    ResponseList<Post> results;

    /**
     * Introducir claves para que se conecte a tu cuenta de Facebook y puedas utilizar 
     * este programa sin errores.
     * NOTA: Los * representan donde tienes que introducir las claves.
     */
    
    public Metodos() { //Constructor con las KEYs
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthAppId("260029277794629")
        .setOAuthAppSecret("3d03f2569b5b8b8d69a09a4a1b6716b4")
        .setOAuthAccessToken("EAADsfsi78UUBAOYCcJXNgXI8nS902iwFjV1qhxVsC8ZAOUc77Kb4VpsPYylCOXVGc8P8zevYrulnoBLhsNbkcerDh8yV5vSMvRLcUbOn65jR10KNh3kf95cJ6NQed6oMQweVLZADUktgSrvVY6DSt801ZBJZAqUZD")
        .setOAuthPermissions("email,publish_stream,publish_actions");
    FacebookFactory ff = new FacebookFactory(cb.build());
    facebook = ff.getInstance();
    
    }
       
    /**
     * Publica un estado nuevo que introducimos por teclado al ejeutar el programa
     * @param mensaje
     */
    
    public void cambEstado(String mensaje){//Cambiar el estado usando permisos de visibilidad
        try {
            facebook.postStatusMessage(mensaje);
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Salta el mensaje que "Dale al boton de Like en la Pagina de Facebook fisicamente" por no funcionar automaticamente
     */
    
    public void darGusta(){ //Darle me gusta a un post
        JOptionPane.showMessageDialog(null,"Dale al boton de Like en la Pagina de Facebook fisicamente");
    }
    
    /**
     * Publica una imagen en nuestra Biografia por URL
     * @throws MalformedURLException
     */
    
    public void pubImagenURL()throws MalformedURLException{ //Postear una imagen por URL
        try {
            PostUpdate post = new PostUpdate(new URL("https://i.ytimg.com"))
                    .picture(new URL("https://i.ytimg.com/vi/I2siTsRov48/maxresdefault.jpg"))
                    .name("Rick")
                    .caption("i.ytimg.com")
                    .description("Rick & Morty");
            facebook.postFeed(post);
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    /**
     * Busca un post en nuestra biografia con los datos que le introducimos por teclado
     * @throws FacebookException
     */
    
    public void buscarPost() throws FacebookException{ //Busca un tema en la linea de tiempo
        ResponseList<Post> results = facebook.getPosts("reboot");
        System.out.println(results.toString());
    }
    
    /**
     * Publica un comentario que introducimos por teclado
     */
    
    public void comentar(){ //Publicar un comentario
        try {
            facebook.commentPost(results.get(1).getId(), "hola holita");
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   /**
     * Muestra las publicaciones de nuestra biografia y Muestrar los Comentarios de una publicación
     */
   
    public void mirarBiografia(){ //mirar biografia y comentarios
        try{
            ResponseList<Post> results= facebook.getFeed();
            System.out.println(results);
        } catch (FacebookException ex){
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    /**
     * Salta el mensaje que "Fuera de Servicio. Facebook lo cerraria el servicio" por no funcionar automaticamente
     */
    
    public void subirImagen(){ //subir imagen
        
        JOptionPane.showMessageDialog(null,"Fuera de Servicio. Facebook lo cerraria el servicio");
    }
    
    

}
