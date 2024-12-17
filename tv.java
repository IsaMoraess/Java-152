package atvd49;

public class tv {
    // ATRIBUTOS
    String nome;
    double polegadas;
    int canais;
    boolean smart;

    // STATUS DO OBJ
    void status() {
        System.out.println("Uma Tv: " + this.nome);
        System.out.println("Polegadas: " + this.polegadas);
        System.out.println("Canais: " + this.canais);
        System.out.println("Smart: " + this.smart);
    }

    // METODOS
    void TvLed() {
        if (this.smart == true) {
            System.out.println("Parabens, sua Tv é smart!");
        } else {
            System.out.println("Que pena, sua Tv não é smart!");
        }
    }

    void smartSim() {
        this.smart = true;
    }

    void smartNao() {
        this.smart = false;
    }
}
