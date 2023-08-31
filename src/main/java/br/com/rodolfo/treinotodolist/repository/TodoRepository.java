package br.com.rodolfo.treinotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rodolfo.treinotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
