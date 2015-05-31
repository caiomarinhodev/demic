package models;

import javax.persistence.*;

/**
 * Created by Caio on 31/05/2015.
 */
@Entity
@Table(name = "MUSICA")
public class Musica {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String titulo;
    @Column
    private String trecho;
    @Column
    private String banda;
    @Column
    private String tom;
    @Column
    private String link;


    public Musica(){

    }

    public Musica(String titulo, String trecho, String banda, String tom, String link) {
        this.titulo = titulo;
        this.trecho = trecho;
        this.banda = banda;
        this.tom = tom;
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTrecho() {
        return trecho;
    }

    public void setTrecho(String trecho) {
        this.trecho = trecho;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getTom() {
        return tom;
    }

    public void setTom(String tom) {
        this.tom = tom;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
