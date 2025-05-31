package modelo;

public class Documento {
    private int id;
    private String autor;
    private String tipo;
    private String conteudo;

    public Documento(int id, String autor, String tipo, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    public int getId() { return id; }
    public String getAutor() { return autor; }
    public String getTipo() { return tipo; }
    public String getConteudo() { return conteudo; }

    @Override
    public String toString() {
        return "Documento{" +
               "ID=" + id +
               ", Autor='" + autor + '\'' +
               ", Tipo='" + tipo + '\'' +
               ", Conteúdo='" + conteudo + '\'' +
               '}';
    }
}
