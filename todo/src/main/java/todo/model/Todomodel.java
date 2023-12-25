package todo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todo")
public class Todomodel {
    private String _id;
    private String title;
    private String description;

    // public Todomodel(String title,String description){
    // this.title=title;
    // this.description=description;
    // System.out.println("Todomodel"+title);
    // }

    // public void setTitle(String title){
    // this.title=title;
    // System.out.println("setTitle"+title);
    // }

    // public void setDescription(String description){
    // this.description=description;
    // System.out.println("setDescription"+description);
    // }

    // public String getTitle(){
    // System.out.println("getTitle"+title);
    // return title;
    // }

    // public String getDescription(){
    // System.out.println("getDescription"+description);
    // return description;
    // }

    @Override
    public String toString() {
        return "Todomodel [title" + title + ",description" + description + "]";
    }
}
