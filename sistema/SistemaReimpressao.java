package sistema;

import estrutura.Pilha;
import modelo.Documento;
import modelo.Reimpressao;

public class SistemaReimpressao {
    public static void main(String[] args) {
        Pilha<Reimpressao> pilha = new Pilha<>();

        Documento doc1 = new Documento(4, "Nicolas", "PDF", "Reimprimir Conteúdo A");
        Documento doc2 = new Documento(5, "Gustavo", "DOCX", "Reimprimir Conteúdo B");

        pilha.empilhar(new Reimpressao(101, "Erro de impressão", doc1));
        pilha.empilhar(new Reimpressao(102, "Papel atolado", doc2));

        while (!pilha.estaVazia()) {
            Reimpressao reimpressao = pilha.desempilhar();
            System.out.println("Reimprimindo: " + reimpressao);
        }
    }
}
