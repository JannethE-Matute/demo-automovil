package ec.edu.ups.demoautomovil.controller;

import ec.edu.ups.demoautomovil.interfaces.AutomovilRepository;
import ec.edu.ups.demoautomovil.model.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://34.139.229.141:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/automovil")
public class AutomovilController {
    @Autowired
    private AutomovilRepository a;

    @PostMapping("/add")
    public Automovil add(
            @RequestBody Automovil val) {
        return a.save(val);
    }

    @GetMapping("/all")
    public List<Automovil> views(){

        return a.findAll();
    }
}
