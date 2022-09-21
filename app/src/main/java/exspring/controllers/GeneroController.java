package exspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import exspring.repositories.GeneroRepository;

@Controller
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroRepository generosRepo;

//Model é uma classe, na qual é utilizada quando se quer passar informações à camada do usuário (JSP)
// model.addAttribute Cria uma variavel chamada gênero
    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("generos", this.generosRepo.findAll());
        return "list";
    }

    @RequestMapping("insert")
    public String insert() {
        return "insert";
    }
}