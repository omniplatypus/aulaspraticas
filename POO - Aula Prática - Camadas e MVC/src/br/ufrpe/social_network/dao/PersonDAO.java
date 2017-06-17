package br.ufrpe.social_network.dao;

import java.util.ArrayList;
import br.ufrpe.social_network.negocio.beans.Person;

public class PersonDAO {
    // implementar singleton para esta classe - PersonDAO

	private static PersonDAO instance;
	
	private static ArrayList<Person> persons = new ArrayList<>();
	
	private PersonDAO(){	
	}
	
	public static PersonDAO getInstance(){
		if(instance==null){
			instance = new PersonDAO();
		}
		return instance;
	}
    
    // Implementar CRUD para classe básica Person usando array
    
	public void createPerson(Person person){
    	persons.add(person);
    }
    
    public boolean deletePerson(long id){
    	boolean removed = false;
    	Person found = this.findPerson(id);
    	if(found.getId() == id){
    		persons.remove(found);
    		removed = true;
    	}
    	return removed;
    }
    
    public Person findPerson(long id){
    	Person result = null;;
    	for (Person person : persons) {
			if(person.getId() == id){
				result = person;
			}
		}
    	return result;
    }
    
    
    public boolean updatePerson(Person person){
    	boolean found = false;
    	for(int i=0; i<persons.size() && !found; i++){
    		if(person.getId() == persons.get(i).getId()){
    			persons.remove(i);
    			persons.set(i, person);
    			found = true;
    		}
    	}
    	return found;
    }
    /*
     * Antes de implementar os métodos, pense bem na assinatura dos mesmos
     */
    
}
