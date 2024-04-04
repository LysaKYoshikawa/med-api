package med.yoshikawa.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoCotroller {

    @PostMapping
    public void cadastrar(String json){
//        System.out.println(json);

    }
}
