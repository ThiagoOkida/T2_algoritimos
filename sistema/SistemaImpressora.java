package sistema;

import estrutura.Fila;
import modelo.Documento;

public class SistemaImpressora {
    public static void main(String[] args) {
        Fila<Documento> fila = new Fila<>();

        fila.enfileirar(new Documento(1, "Joana", "PDF", "Conteúdo A"));
        fila.enfileirar(new Documento(2, "Gabriel", "DOCX", "Conteúdo B"));
        fila.enfileirar(new Documento(3, "Felipe", "TXT", "Conteúdo C"));

        while (!fila.estaVazia()) {
            Documento doc = fila.desenfileirar();
            System.out.println("Imprimindo: " + doc);
        }
    }
}
