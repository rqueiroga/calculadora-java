public class CatalogoAves {
    public static void main(String[] args) {
       
        Psittacidae arara = new Psittacidae("Arara-vermelha", "Ara chloropterus", 90, false, "Vermelha");
        Psittacidae papagaio = new Psittacidae("Papagaio-verdadeiro", "Amazona aestiva", 40, true, "Verde");
        Psittacidae calopsita = new Psittacidae("Calopsita", "Nymphicus hollandicus", 30, true, "Cinza");

       
        arara.emitirSom();
        arara.descrever();

        papagaio.emitirSom();
        papagaio.descrever();

        calopsita.emitirSom();
        calopsita.descrever();
    }
}
