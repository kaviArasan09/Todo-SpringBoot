package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import todo.model.Todomodel;


public interface Todorepo extends MongoRepository<Todomodel,String> {
    
}
