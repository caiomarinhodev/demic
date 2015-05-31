package models;

import javax.persistence.*;

/**
 * Created by Caio on 31/05/2015.
 */
@Entity
@Table(name = "OFERTA")
public class Oferta {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idcomponente;
    @Column
    private Double valor;
    @Column
    private String data;

    public Oferta(){

    }

    public Oferta(long idcomponente, Double valor, String data) {
        this.idcomponente = idcomponente;
        this.valor = valor;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdcomponente() {
        return idcomponente;
    }

    public void setIdcomponente(long idcomponente) {
        this.idcomponente = idcomponente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
