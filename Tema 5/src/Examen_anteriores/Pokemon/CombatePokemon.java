package Examen_anteriores.Pokemon;


import eléctrico;

import static Examen_anteriores.Pokemon.Pokemon.criaturasCreadas;

public class CombatePokemon {

    static void main(String[] args) {

        Combate();

    }

    private static void Combate() {
        Pokemon[] pokemons = new Pokemon[40];

        for (int i = 0; i < pokemons.length; i++) {

            int criaturas = (int) (Math.random() * (5 - 1 + 1)) + 1;

            if (criaturas == 1) {
                Agua(pokemons);
            } else if (criaturas == 2) {
                fuego(pokemons);
            } else if (criaturas == 3) {
                eléctrico(pokemons);
            } else if (criaturas == 4) {
                tierra(pokemons);
            } else if (criaturas == 5) {
                divino(pokemons);
            }

        }


        for (Pokemon pokemon : pokemons) {

            if (pokemon != null) {


                String string = pokemon.toString();
                System.out.println(string);

            }

        }


        //combate(pokemons);
    }

    private static void combate(Pokemon[] pokemons) {
        boolean terminaElCombate = false;

        while (!terminaElCombate) {
            int pokemonderrotados = 0;

            for (Pokemon pokemon : pokemons) {

                if (pokemon.Vida_act == 0 || pokemon.tipo.equals("divino")) {
                    pokemonderrotados++;

                    if (pokemonderrotados == pokemons.length) {
                        terminaElCombate = true;
                    }

                }

            }


        }
    }

    private static void divino(Pokemon[] pokemons) {
        int x1 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        String[] pokemonHada = {
                "Clefairy", "Clefable", "Jigglypuff", "Wigglytuff", "Togepi",
                "Togetic", "Togekiss", "Azurill", "Marill", "Azumarill",
                "Snubbull", "Granbull", "Ralts", "Kirlia", "Gardevoir",
                "Sylveon", "Mawile", "Whimsicott", "Flabebe", "Xerneas"
        };
        String nombre = pokemonHada[x1 - 1];

        int x2 = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int x3 = (int) (Math.random() * (15 - 5 + 1)) + 5;
        int x4 = (int) (Math.random() * (25 - 5 + 1)) + 5;


        pokemons[criaturasCreadas] = new divino(nombre, x2, x3, x4);
    }

    private static void tierra(Pokemon[] pokemons) {
        int x1 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        String[] pokemonTierra = {
                "Sandshrew", "Sandslash", "Diglett", "Dugtrio", "Geodude",
                "Graveler", "Golem", "Onix", "Cubone", "Marowak",
                "Rhyhorn", "Rhydon", "Wooper", "Quagsire", "Phanpy",
                "Donphan", "Trapinch", "Vibrava", "Flygon", "Hippopotas"
        };
        String nombre = pokemonTierra[x1 - 1];

        int x2 = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int x3 = (int) (Math.random() * (15 - 5 + 1)) + 5;
        int x4 = (int) (Math.random() * (25 - 5 + 1)) + 5;
        int x5 = (int) (Math.random() * (9 - 1 + 1)) + 1;


        pokemons[criaturasCreadas] = new tierra(nombre, x2, x3, x4, x5);
    }

    private static void eléctrico(Pokemon[] pokemons) {
        int x1 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        String[] pokemonRayo = {
                "Pikachu", "Raichu", "Magnemite", "Magneton", "Voltorb",
                "Electrode", "Electabuzz", "Jolteon", "Zapdos", "Chinchou",
                "Lanturn", "Mareep", "Flaaffy", "Ampharos", "Elekid",
                "Raikou", "Plusle", "Minun", "Shinx", "Luxray"
        };
        String nombre = pokemonRayo[x1 - 1];

        int x2 = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int x3 = (int) (Math.random() * (15 - 5 + 1)) + 5;
        int x4 = (int) (Math.random() * (25 - 5 + 1)) + 5;
        int x5 = (int) (Math.random() * (15 - 10 + 1)) + 10;

        pokemons[criaturasCreadas] = new eléctrico(nombre, x2, x3, x4, x5);
    }

    private static void fuego(Pokemon[] pokemons) {
        int x1 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        String[] pokemonFuego = {
                "Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales",
                "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Magmar",
                "Flareon", "Cyndaquil", "Quilava", "Typhlosion", "Torchic",
                "Combusken", "Blaziken", "Torkoal", "Chimchar", "Infernape"
        };
        String nombre = pokemonFuego[x1 - 1];

        int x2 = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int x3 = (int) (Math.random() * (15 - 5 + 1)) + 5;
        int x4 = (int) (Math.random() * (25 - 5 + 1)) + 5;
        int x5 = (int) (Math.random() * (10 - 5 + 1)) + 5;

        pokemons[criaturasCreadas] = new fuego(nombre, x2, x3, x4, x5);
    }

    private static void Agua(Pokemon[] pokemons) {

        int x1 = (int) (Math.random() * (20 - 1 + 1)) + 1;

        String[] pokemonAgua = {
                "Squirtle", "Wartortle", "Blastoise", "Psyduck", "Golduck",
                "Poliwag", "Poliwhirl", "Poliwrath", "Tentacool", "Tentacruel",
                "Slowpoke", "Slowbro", "Seel", "Dewgong", "Magikarp",
                "Gyarados", "Lapras", "Vaporeon", "Totodile", "Feraligatr"
        };

        String nombre = pokemonAgua[x1 - 1];

        int x2 = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int x3 = (int) (Math.random() * (15 - 5 + 1)) + 5;
        int x4 = (int) (Math.random() * (25 - 5 + 1)) + 5;
        int x5 = (int) (Math.random() * (10 - 1 + 1)) + 1;

        pokemons[criaturasCreadas] = new agua(nombre, x2, x3, x4, x5);
    }


}
