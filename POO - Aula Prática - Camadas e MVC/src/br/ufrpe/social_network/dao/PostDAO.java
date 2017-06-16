package br.ufrpe.social_network.dao;

import java.util.ArrayList;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class PostDAO {
    
	private ArrayList<Post> Posts = new ArrayList();
    // implementar singleton para esta classe - PostDAO
    private static PostDAO instance;
	private PostDAO() {
    	
    }
    public static PostDAO getInstance(){
    	if(instance==null){
    		instance = new PostDAO();
    	}
    	return instance;
    }
    //TODO Implementar CRUD para classe básica Post usando ArrayList
    public void createPost(Post post){
    	
    }
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
}
