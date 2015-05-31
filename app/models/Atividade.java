package models;

import javax.persistence.*;

/**
 * Created by Caio on 31/05/2015.
 */
@Entity
@Table(name = "ATIVIDADE")
public class Atividade {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String data;
    @Column
    private String dia;
    @Column
    private String atividade;

    public Atividade(){

    }

    public Atividade(String data, String dia, String atividade) {
        this.data = data;
        this.dia = dia;
        this.atividade = atividade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
