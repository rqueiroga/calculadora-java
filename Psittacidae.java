public class Psittacidae {
    
    String nomePopular;
    String especie;
    int tamanhoCm;
    boolean podeFalar;
    String corPredominante;

    
    public Psittacidae(String nomePopular, String especie, int tamanhoCm, boolean podeFalar, String corPredominante) {
        this.nomePopular = nomePopular;
        this.especie = especie;
        this.tamanhoCm = tamanhoCm;
        this.podeFalar = podeFalar;
        this.corPredominante = corPredominante;
    }

    public void voar() {
        System.out.println(nomePopular + " está voando!");
    }

    public void emitirSom() {
        System.out.println(nomePopular + " está emitindo um som!");
    }

    public void descrever() {
        System.out.println("\n--- Ficha da Ave ---");
        System.out.println("Nome Popular: " + nomePopular);
        System.out.println("Espécie: " + especie);
        System.out.println("Tamanho (cm): " + tamanhoCm);
        System.out.println("Pode falar: " + (podeFalar ? "Sim" : "Não"));
        System.out.println("Cor predominante: " + corPredominante);
        System.out.println("--------------------");
    }
}
