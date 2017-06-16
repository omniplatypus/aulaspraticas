package br.ufrpe.social_network.dao;

public class PersonDAO {
    // implementar singleton para esta classe - PersonDAO

	public static PersonDAO instance;
	
	private PersonDAO(){	
	}
	
	public static PersonDAO getInstance(){
		if(instance==null){
			instance = new PersonDAO();
		}
		return instance;
	}
    
    //TODO Implementar CRUD para classe básica Person usando array
    
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
    
}
