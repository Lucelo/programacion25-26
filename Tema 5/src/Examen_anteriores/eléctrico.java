package Examen_anteriores;

public class eléctrico extends Pokemon {

    public int resistenciaDeLluvia;

    public eléctrico(String nombre, int vida_max, int ataque, int defensa, int resistenciaDeLluvia) {
        super(nombre, vida_max, ataque, defensa);
        setresistenciadelluvia(resistenciaDeLluvia);
    }

    public void setresistenciadelluvia(int resistenciadelluvia) {

        if (resistenciadelluvia >= getresistenciadelluviaMin() && resistenciadelluvia <= getresistenciadelluviaMax()) {

            this.resistenciaDeLluvia = resistenciadelluvia;

        } else {
            throw new IllegalArgumentException("La resistencia de lluvia no es correcta");
        }

    }

    public int getresistenciadelluviaMin() {
        return 10;
    }

    public int getresistenciadelluviaMax() {
        return 15;
    }

    @Override
    public String getTipo() {
        return "eléctrico";
    }
}
