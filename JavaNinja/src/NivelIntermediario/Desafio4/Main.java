package NivelIntermediario.Desafio4;

public class Main {

    public static void main(String[] args) {
        NinjaBasico konokamaru = new NinjaBasico("Konohamaru Sarutobi", 10,"Konoha", TipoHabilidade.TAIJUTSU);

        konokamaru.mostrarInformacoes();
        konokamaru.executarHabilidade();

        NinjaAvancado naruto = new NinjaAvancado("Naruto Uzumaki", 16, "KONOHA", TipoHabilidade.NINJUTSU, "Rasengan");

        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
    }
}

