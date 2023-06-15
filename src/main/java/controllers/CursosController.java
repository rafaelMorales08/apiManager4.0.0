package controllers;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.citi.model.Curso;
import com.example.citi.repository.CursoRepository;


@RestController
@RequestMapping("/api")
public class CursosController {

    private final CursoRepository cursoRepository;

    public CursosController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
    
    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }
  
    @GetMapping(value = "curso/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> buscarCurso(@PathVariable("name") String nombre) {
        return cursoRepository.findByNombreContaining(nombre);
    }
    
    @DeleteMapping(value = "curso/{name}")
    public void eliminarCurso(@PathVariable("name") String nombre) {
        cursoRepository.deleteByNombre(nombre);
    }
    
    @PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso altaCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
    
    @PutMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso actualizar(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}
