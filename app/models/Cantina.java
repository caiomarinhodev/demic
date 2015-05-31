package models;

import javax.persistence.*;

/**
 * Created by Caio on 31/05/2015.
 */
@Entity
@Table(name = "CANTINA")
public class Cantina {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String data;
    @Column
    private String dia;
    @Column
    private Double gasto;
    @Column
    private Double lucro;
    @Column
    private String descricao;

    public Cantina(){

    }

    public Cantina(String data, String dia, Double gasto, Double lucro, String descricao) {
        this.data = data;
        this.dia = dia;
        this.gasto = gasto;
        this.lucro = lucro;
        this.descricao = descricao;
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

    public Double getGasto() {
        return gasto;
    }

    public void setGasto(Double gasto) {
        this.gasto = gasto;
    }

    public Double getLucro() {
        return lucro;
    }

    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
