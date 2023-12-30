package br.com.lucsaprigio.conhecendospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lucsaprigio.conhecendospring.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

    @Autowired
    private DiaristaRepository repository;

    @GetMapping
    public ModelAndView buscarTodos() {
        var modelAndView = new ModelAndView("listas_diaristas");

        modelAndView.addObject("diaristas", repository.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}") // Colocamos entre {} para indicar que é uma variável, e logo abaixo, colocamos
                         // o @PathVariable para indicar ele acima
    public ModelAndView buscarPorId(@PathVariable Long id) {
        var modelAndView = new ModelAndView("detalhes");

        modelAndView.addObject("diarista", repository.getReferenceById(id));

        return modelAndView;
    }
}

//aula - 009