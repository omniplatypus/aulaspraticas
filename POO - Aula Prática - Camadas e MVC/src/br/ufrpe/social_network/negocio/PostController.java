package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.negocio.beans.Post;
import br.ufrpe.social_network.dao.PostDAO;

public class PostController {
    
    private PostDAO postsRepository;
    private static PostController instance;
    
    private PostController(){
    }
    
    //  Implementar singleton para este controlador
    public static PostController getInstance(){
    	if(instance == null){
    		instance = new PostController();
    	}
    	return instance;
    }
    
    //  implementar corpo dos métodos CRUD deste controlador
    public void savePost(Post post){
    	postsRepository.createPost(post);
    }
    
    public Post find(long id){
    	return postsRepository.findPost(id);
    }
    
    public void update(Post post){
    	postsRepository.updatePost(post);
    }
    
    public void delete(Post post){
    	postsRepository.deletePost(post.getId());
    }

    
    // TODO Implementar método que lista todos os posts de uma determinada pessoa
    
    // TODO DESAFIO Implementar método que busque todos comentários que uma dada pessoa realizou em posts de terceiros
    // Para implementar este método, você deve fazer uma buscar em todos os 
    // comentários de todos os posts, verificando quem realizou aqueele comentário.
    // Lembre-se que é possível realizar comentários de comentários e busca 
    // precisaria ser feita em profundidade
}
