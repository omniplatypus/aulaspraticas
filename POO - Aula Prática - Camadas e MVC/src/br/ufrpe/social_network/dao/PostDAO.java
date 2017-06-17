package br.ufrpe.social_network.dao;

import java.util.ArrayList;
import br.ufrpe.social_network.negocio.beans.Post;

public class PostDAO {
    
	private static ArrayList<Post> posts = new ArrayList<>();
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
    // Implementar CRUD para classe básica Post usando ArrayList
   
    public void createPost(Post post){
    	posts.add(post);
    }
    
    public boolean deletePost(long id){
    	boolean removed = false;
    	Post found = this.findPost(id);
    	if(found.getId() == id){
    		posts.remove(found);
    		removed = true;
    	}
    	return removed;
    }
    
    public Post findPost(long id){
    	Post result = null;;
    	for (Post post : posts) {
			if(post.getId() == id){
				result = post;
			}
		}
    	return result;
    }
    
    
    public boolean updatePost(Post post){
    	boolean found = false;
    	for(int i=0; i<posts.size() && !found; i++){
    		if(post.getId() == posts.get(i).getId()){
    			posts.remove(i);
    			posts.set(i, post);
    			found = true;
    		}
    	}
    	return found;
    	
    }
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
}
