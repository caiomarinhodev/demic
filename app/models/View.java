package models;

import javax.persistence.*;

/**
 * Created by Caio on 31/05/2015.
 */
@Entity
@Table(name = "VIEW")
public class View {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private long idcomponente;
    @Column
    private int valor;


    public View(){

    }

    public View(int valor, long idcomponente) {
        this.valor = valor;
        this.idcomponente = idcomponente;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
