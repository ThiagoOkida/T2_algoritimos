package modelo;

public class Reimpressao {
    private int id;
    private String motivo;
    private Documento documento;

    public Reimpressao(int id, String motivo, Documento documento) {
        this.id = id;
        this.motivo = motivo;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public String getMotivo() {
        return motivo;
    }

    public Documento getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return "Reimpressao{" +
               "ID=" + id +
               ", Motivo='" + motivo + '\'' +
               ", Documento=" + documento +
               '}';
    }
}
