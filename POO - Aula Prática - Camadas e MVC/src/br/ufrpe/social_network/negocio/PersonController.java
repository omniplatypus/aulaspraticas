package br.ufrpe.social_network.negocio;

import br.ufrpe.social_network.dao.PersonDAO;
import br.ufrpe.social_network.negocio.beans.Person;

public class PersonController {
    
    private PersonDAO personsRepository;
    private static PersonController instance;
    
    private PersonController() {
        // Construtor privado para implementação de singleton
    }

    public static PersonController getInstance() {
        if (instance == null) {
            instance = new PersonController();
        }
        return instance;
    }
    
    public void savePerson(Person p) {
        //  Método que salva pessoa no repositório
    	personsRepository.createPerson(p);
    }
    
    public Person find(long personId) {
        //  Retorna o objeto do tipo Person que contenha aquele ID
        return personsRepository.findPerson(personId);
    }
    
    public void update(Person newPerson) {
        // Encontra no repositório obj que tenha id igual a newPerson.id e atualiza objeto 
    	personsRepository.updatePerson(newPerson);
    }
    
    public void delete(Person p) {
        //  apaga do repositório objeto que contenha o id igual a p.id 
    	personsRepository.deletePerson(p.getId());
    }
}
