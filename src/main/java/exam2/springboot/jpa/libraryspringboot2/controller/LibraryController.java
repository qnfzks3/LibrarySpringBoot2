package exam2.springboot.jpa.libraryspringboot2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    @GetMapping("/")
    public String list(){

        return "list";

    }



}
