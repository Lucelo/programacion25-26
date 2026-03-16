package Libro_de_conjuros.conjuros;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GrimorioController {

    private final GrimorioService service;

    public GrimorioController(GrimorioService service) {
        this.service = service;
    }

    @GetMapping("/nombres")
    public List<String> obtenerNombres() {
        return service.obtenerNombres();
    }

    @GetMapping("/buscar")
    public Conjuro buscar(@RequestParam String nombre) {
        return service.buscar(nombre);
    }
}