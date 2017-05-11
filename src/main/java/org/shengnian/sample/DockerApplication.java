package org.shengnian.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by cheng on 2017/5/11.
 */
@SpringBootApplication
@RestController
public class DockerApplication {

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/")
    public String home () {

        StringBuffer buffer = new StringBuffer();

        this.repository.findAll().forEach(person -> {
            buffer.append("Hello [").append(person.getName()).append("]!<br />");
        });

        return buffer.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}

@Repository
interface PersonRepository extends CrudRepository<Person, Long> {
}

@Entity
class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
