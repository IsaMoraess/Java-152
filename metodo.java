package atvd49;

public class metodo {
    public static void main(String args[]) {
        // INSTANCIA OBJETO
        tv televisao = new tv();

        // CHAMADA DE ATRIBUTOS
        televisao.nome = "Samsung";
        televisao.polegadas = 75.5;
        televisao.canais = 14;

        // CHAMADA DE METODOS
        televisao.smartSim();
        // televisao.smartNao();
        televisao.status();
        televisao.TvLed();
        System.out.println("----------------------------------------------");

                                    // CRIANDO OUTRA INSTANCIA

        // INSTANCIA OBJETO
        tv televisao2 = new tv();

        // CHAMADA DE ATRIBUTOS
        televisao2.nome = "TCL";
        televisao2.polegadas = 50.0;
        televisao2.canais = 15;

        // CHAMADA DE METODOS
        // televisao2.smartSim();
        televisao2.smartNao();
        televisao2.status();
        televisao2.TvLed();
    }
}
