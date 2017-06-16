package br.ufrpe.social_network.negocio.beans;

import java.util.ArrayList;

public class Post {
    
	private static long nextId=1;
	
    private long id;
    private String texto;
    private Person author;
    private ArrayList<Post> comments;

    public Post(String texto, Person author) {
        // Implementar a mesma estratégia da classe Person para geração de ID  
        this.id = nextId;
        nextId += 1;
        this.texto = texto;
        this.author = author;
        this.comments = new ArrayList<>();
    }
    
    public Post() {
        this(null, null);
    }

    public long getId() {
        return this.id;
    }
    
    
    
    //  gerar todos os métodos get/set, exceto o setId
    
    public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public ArrayList<Post> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Post> comments) {
		this.comments = comments;
	}

	public void addComment(Post comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }
    
    public void removeComment(Long id) {
        // TODO remover comentário da lista de comentários se ele existir. 
        // Você deve varrer a lista inteira verificando se há algum 
        // comentário com o ID informado como parâmetro e então removê-lo
    }
    
    @Override
    public String toString() {
        //  Implementar método toString da classe Person
    	String str = this.getAuthor().toString() + "\n" + this.getTexto();
        return str;
    }
    
}


