package controllers;

import models.*;

import java.util.List;

/**
 * Created by Caio on 31/05/2015.
 */
public class SGDB {

    private static GenericDAO dao = new GenericDAO();

    // Atividade

    public static void addAtividade(String data, String dia, String atividade){
        Atividade a = new Atividade(data, dia,atividade);
        dao.persist(a);
        dao.flush();
    }

    public static void removeAtividade(Atividade a){
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static void removeAtividade(long id){
        Atividade a= dao.findByEntityId(Atividade.class,id);
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static List<Atividade> getAllAtividades(){
        return dao.findAllByClassName(Atividade.class.getName());
    }

    // Cantina

    public static void addCantina(String data, String dia,Double gasto, Double lucro, String descricao){
        Cantina c = new Cantina(data,dia,gasto,lucro,descricao);
        dao.persist(c);
        dao.flush();
    }

    public static void removeCantina(Cantina c){
        if(c!=null){
            dao.remove(c);
            dao.flush();
        }
    }

    public static void removeCantina(long id){
        Cantina c= dao.findByEntityId(Cantina.class,id);
        if(c!=null){
            dao.remove(c);
            dao.flush();
        }
    }

    public static List<Cantina> getAllCantinas(){
        return dao.findAllByClassName(Cantina.class.getName());
    }


    // Componente

    public static void addComponente(String nome){
        Componente c = new Componente(nome);
        dao.persist(c);
        dao.flush();
    }

    public static Componente getComponente(Long id){
        return dao.findByEntityId(Componente.class,id);
    }

    public static Componente getComponente(String nome){
        List<Componente> l = dao.findByAttributeName(Componente.class.getName(),"nome",nome);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void removeComponente(Componente c){
        if(c!=null){
            dao.remove(c);
            dao.flush();
        }
    }

    public static void removeComponente(long id){
        Componente c= dao.findByEntityId(Componente.class,id);
        if(c!=null){
            dao.remove(c);
            dao.flush();
        }
    }

    public static List<Componente> getAllComponentes(){
        return dao.findAllByClassName(Componente.class.getName());
    }


    // Doacao

    public static void addDoacao(String data, String nome, String dia, Double valor){
        Doacao d = new Doacao(data,nome,valor,dia);
        dao.persist(d);
        dao.flush();
    }

    public static void removeDoacao(Doacao d){
        if(d!=null){
            dao.remove(d);
            dao.flush();
        }
    }

    public static void removeDoacao(long id){
        Doacao d= dao.findByEntityId(Doacao.class,id);
        if(d!=null){
            dao.remove(d);
            dao.flush();
        }
    }

    public static List<Doacao> getAllDoacoes(){
        return dao.findAllByClassName(Doacao.class.getName());
    }


    // Musica

    public static void addMusica(String titulo, String trecho, String banda, String tom, String link){
        Musica m = new Musica(titulo, trecho, banda, tom,link);
        dao.persist(m);
        dao.flush();
    }

    public static void removeMusica(Musica m){
        if(m!=null){
            dao.remove(m);
            dao.flush();
        }
    }

    public static void removeMusica(long id){
        Musica m= dao.findByEntityId(Musica.class,id);
        if(m!=null){
            dao.remove(m);
            dao.flush();
        }
    }

    public static List<Musica> getAllMusicas(){
        return dao.findAllByClassName(Musica.class.getName());
    }


    // Oferta

    public static void addOferta(long idcomponenete, Double valor, String data){
        Oferta o = new Oferta(idcomponenete, valor,data);
        dao.persist(o);
        dao.flush();
    }

    public static void removeOferta(Oferta o){
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static void removeOferta(long id){
        Oferta o= dao.findByEntityId(Oferta.class,id);
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static List<Oferta> getAllOfertas(){
        return dao.findAllByClassName(Oferta.class.getName());
    }


    // Operacao

    public static void addOperacao(String data, String descricao, Double valor){
        Operacao o = new Operacao(data,descricao, valor);
        dao.persist(o);
        dao.flush();
    }

    public static void removeOperacao(Operacao o){
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static void removeOperacao(long id){
        Operacao o= dao.findByEntityId(Operacao.class,id);
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static List<Operacao> getAllOperacoes(){
        return dao.findAllByClassName(Operacao.class.getName());
    }


    // Sugestao

    public static void addSugestao(String content, String nome){
        Sugestao s = new Sugestao(content,nome);
        dao.persist(s);
        dao.flush();
    }

    public static void removeSugestao(Sugestao o){
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static void removeSugestao(long id){
        Sugestao o= dao.findByEntityId(Sugestao.class,id);
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static List<Sugestao> getAllSugestoes(){
        return dao.findAllByClassName(Sugestao.class.getName());
    }

    // View

    public static void addview(int valor, long idcomponente){
        View s = new View(valor,idcomponente);
        dao.persist(s);
        dao.flush();
    }

    public static void removeView(View o){
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static View getView(String attr, String val){
        List<View> l = dao.findByAttributeName(View.class.getName(),attr,val);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void removeView(long id){
        View o= dao.findByEntityId(View.class,id);
        if(o!=null){
            dao.remove(o);
            dao.flush();
        }
    }

    public static List<View> getAllViews(){
        return dao.findAllByClassName(View.class.getName());
    }

    public static void setView(long id, int valor){
        View v= dao.findByEntityId(View.class,id);
        v.setValor(valor);
        dao.merge(v);
        dao.flush();
    }

    public static void setView(View v, int valor){
        v.setValor(valor);
        dao.merge(v);
        dao.flush();
    }

    private static double getcantinas(){
        double ganho=0;
        List<Cantina> lc = getAllCantinas();
        for(Cantina c: lc){
            ganho+=c.getLucro();
        }
        return ganho;
    }

    private static double getdoacoes(){
        double ganho=0;
        List<Doacao> ld = getAllDoacoes();
        for(Doacao d: ld){
            ganho+=d.getValor();
        }
        return ganho;
    }

    private static double getofertas(){
        double ganho=0;
        List<Oferta> lo = getAllOfertas();
        for(Oferta o: lo){
            ganho+=o.getValor();
        }
        return ganho;
    }

    private static double getoperacoes(){
        double op=0;
        List<Operacao> lo = getAllOperacoes();
        for(Operacao o: lo){
            op+=o.getValor();
        }
        return op;
    }

    public static double getCaixa(){
        double receita = getofertas()+getcantinas()+getdoacoes();
        double g = getoperacoes();

        return receita-g;
    }
}
