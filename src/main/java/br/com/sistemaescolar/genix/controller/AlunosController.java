package br.com.sistemaescolar.genix.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemaescolar.genix.model.Alunos;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping ("Alunos")
public class AlunosController {

    Logger log  = LoggerFactory.getLogger(getClass());
    
    List<Alunos> repository = new ArrayList<>();

    @GetMapping
    public List<Alunos> index(){
        return repository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Alunos create(@RequestBody Alunos alunos){ //binding
        log.info("cadastrando aluno " + alunos);
        repository.add(alunos);
        return alunos;
    }

    @GetMapping("{id}")
    public ResponseEntity<Alunos> show(@PathVariable Long id){
        log.info("buscar alunos por id {} ", id);

        // for(Alunos alunos : repository){
        //     if (alunos.id().equals(id))
        //         return ResponseEntity.ok(alunos);
        // }


        var alunosEncontrados = getAlunosById(id);

        if (alunosEncontrados.isEmpty())
            return ResponseEntity.notFound().build();
        
        return ResponseEntity.ok(alunosEncontrados.get());
   
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("Apagando Alunos com id {} ", id);

        var alunosEncontrados = getAlunosById(id);

        if (alunosEncontrados.isEmpty())
            return ResponseEntity.notFound().build();

        repository.remove(alunosEncontrados.get());
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Alunos> atualizar(@PathVariable Long id, @RequestBody Alunos alunos){
        log.info("atualizando alunos com id {} para {}", id, alunos);
         
        var alunosEncontrados = getAlunosById(id);

        if (alunosEncontrados.isEmpty())
            return ResponseEntity.notFound().build();

        var alunosAntiga = alunosEncontrados.get();
        var alunosNova = new Alunos(id, alunos.getNome(), alunos.getIcone(), 
                                alunos.getRm(),alunos.getCpf(),alunos.getTelefone(),
                                alunos.getEmail(), alunos.getResponsavel());

        repository.remove(alunosAntiga);
        repository.add(alunosNova);
        return ResponseEntity.ok(alunosNova);

    }


    private Optional<Alunos> getAlunosById(Long id) {
        var alunosEncontrada = repository
                                    .stream()
                                    .filter( c -> c.id().equals(id))
                                    .findFirst();
        return alunosEncontrada;
    }

}