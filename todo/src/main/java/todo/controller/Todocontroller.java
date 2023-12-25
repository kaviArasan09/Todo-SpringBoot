package todo.controller;

import java.util.List;

import repository.Todorepo;
import todo.model.Todomodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Todocontroller {
    @Autowired
    private Todorepo trepo;

    @GetMapping("/todo")
    public List<Todomodel>getTodo(){
        System.out.println("Get todo");
        return trepo.findAll();
    }

    @PostMapping("/todo")
    public Todomodel postTodo(@RequestBody Todomodel entity){
        System.out.println("postTodo:"+entity);
        return trepo.save(entity);
    }

    @PutMapping("/todo/{id}")
    public Todomodel updateTodo(@PathVariable String id, @RequestBody Todomodel entity) {
        //Todo: process PUT request
        Todomodel oldEntity=trepo.findById(id).get();
        oldEntity.setTitle(entity.getTitle());
        oldEntity.setDescription(entity.getDescription());
        
        return trepo.save(oldEntity);
    }

    @DeleteMapping("/todo/{id}")
    public String deleteTodo(@PathVariable String id){
    trepo.deleteById(id);
    return id;
}

}
