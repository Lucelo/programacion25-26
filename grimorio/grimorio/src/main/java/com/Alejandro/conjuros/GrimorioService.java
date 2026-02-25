package com.Alejandro.conjuros;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class GrimorioService {
    private List<Conjuro> conjuros = new ArrayList<>();

    public GrimorioService() {
        conjuros.add(new Conjuro(
                "Bola de Fuego",
                3,
                "Evocación",
                "Una explosión de fuego que inflige 8d6 de daño...",
                "150 pies",
                "V, S, M"
        ));
        conjuros.add(new Conjuro(
                "Curar Heridas",
                1,
                "Evocación",
                "Una criatura recupera 1d8 + modificador...",
                "Toque",
                "V, S"
        ));
    }

    public List<String> obtenerNombres() {
        return conjuros.stream().map(Conjuro::getNombre).toList();
    }

    public Conjuro buscar(String nombre) {
        return conjuros.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
