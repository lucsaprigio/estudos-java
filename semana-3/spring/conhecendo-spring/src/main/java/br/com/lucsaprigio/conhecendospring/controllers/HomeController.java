package br.com.lucsaprigio.conhecendospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.lucsaprigio.conhecendospring.dto.DiaristaForm;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String home() {
        // nome da camada de templates - criado o arquivo em resources/templates
        return "home";
    }

    // Valores do controller para a view
    @GetMapping("/modelmap") // Aqui colocamos o nome da rota
    public String home2(ModelMap modelMap){

        // Nome do Id da tag e o valor
        modelMap.addAttribute("nome", "Lucas");  
        
        return "home";
    }

    @GetMapping("/modelandview")
    public ModelAndView home3() {
        var modelAndView = new ModelAndView("home");

        modelAndView.addObject("nome", "Lucas");

        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form() {
        var modelAndView = new ModelAndView("form");

        modelAndView.addObject("form", new DiaristaForm());

        return modelAndView;
    }

    @PostMapping("/form")
    public String form2(DiaristaForm form){
        System.out.println(form);

        return "redirect:/form";
    }

    //50:23
    
}
