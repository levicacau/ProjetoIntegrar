package poder.ufac.br.projetointegrar.cdp;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by Levi Cacau on 01/10/2015.
 */
@DatabaseTable(tableName="tarefa")
public class Tarefa implements Serializable{
    @DatabaseField(generatedId=true)
    private Long id;
    @DatabaseField
    private int status;
    @DatabaseField
    private int tipo;
    @DatabaseField
    private int miniatura;
    @DatabaseField
    private String nome;
    @DatabaseField(dataType= DataType.SERIALIZABLE)
    private int[] imagens;
    @DatabaseField(dataType=DataType.SERIALIZABLE)
    private int[] audio;
    @DatabaseField
    private int titulo;

    public Tarefa(){}
    public Tarefa(String nome, int [] imagens, int[] audio, int titulo, int miniatura, int tipo, int status){
        this.miniatura = miniatura;
        this.nome = nome;
        this.imagens = imagens;
        this.audio = audio;
        this.titulo = titulo;
        this.tipo = tipo;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getImagens() {
        return imagens;
    }

    public void setImagens(int[] imagens) {
        this.imagens = imagens;
    }

    public int[] getAudio() {
        return audio;
    }

    public void setAudio(int[] audio) {
        this.audio = audio;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }
}
