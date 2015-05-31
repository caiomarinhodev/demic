package controllers;

import models.Componente;
import models.View;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    @Transactional
    public static Result index() {
        return ok(index.render(1));
    }
    @Transactional
    public static Result renderAdmin(){
        return ok(admin.render(1));
    }
    @Transactional
    public static Result renderCantinas(){
        return ok(cantinas.render(3));
    }
    @Transactional
    public static Result renderDoacao(){
        return ok(doacao.render(4));
    }
    @Transactional
    public static Result renderMovimentacoes(){
        return ok(movimentacoes.render(2));
    }
    @Transactional
    public static Result renderRepertorio(){
        return ok(repertorio.render(5));
    }

    @Transactional
    public static Result addCantina(){
        DynamicForm r = Form.form().bindFromRequest();
        String data = r.get("data");
        String dia = r.get("dia");
        Double gasto = Double.parseDouble(r.get("gasto"));
        Double lucro = Double.parseDouble(r.get("lucro"));
        String desc = r.get("descricao");
        SGDB.addCantina(data,dia,gasto,lucro,desc);
        return renderAdmin();
    }

    @Transactional
    public static Result addDoacao(){
        DynamicForm r = Form.form().bindFromRequest();
        String data = r.get("data");
        String dia = r.get("dia");
        String nome = r.get("nome");
        Double valor = Double.parseDouble(r.get("valor"));
        SGDB.addDoacao(data,nome,dia,valor);
        return renderAdmin();
    }

    @Transactional
    public static Result addComponente(){
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        SGDB.addComponente(nome);
        Componente co = SGDB.getComponente(nome);
        Long idcomp = co.getId();
        SGDB.addview(0,idcomp);
        return renderAdmin();
    }

    @Transactional
    public static Result addView(){
        DynamicForm r = Form.form().bindFromRequest();
        int valor = Integer.parseInt(r.get("valor"));
        Long idcomp = Long.parseLong(r.get("id"));
        SGDB.addview(valor,idcomp);
        return renderAdmin();
    }

    @Transactional
    public static Result addOferta(){
        DynamicForm r = Form.form().bindFromRequest();
        Long id = Long.parseLong(r.get("id"));
        Double valor = Double.parseDouble(r.get("valor"));
        String data = r.get("data");
        SGDB.addOferta(id,valor,data);
        return renderAdmin();
    }

    @Transactional
    public static Result addSugestao(){
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        String content = r.get("musica");
        SGDB.addSugestao(content,nome);
        return renderRepertorio();
    }

    @Transactional
    public static Result addOperacao(){
        DynamicForm r = Form.form().bindFromRequest();
        String data = r.get("data");
        String desc = r.get("descricao");
        Double valor = Double.parseDouble(r.get("valor"));
        SGDB.addOperacao(data,desc,valor);
        return renderAdmin();
    }

    @Transactional
    public static Result addMusica(){
        DynamicForm r = Form.form().bindFromRequest();
        String titulo = r.get("titulo");
        String banda = r.get("banda");
        String tom = r.get("tom");
        String link = r.get("link");
        SGDB.addMusica(titulo,"",banda,tom,link);
        return renderAdmin();
    }

    @Transactional
    public static Result addAtividade(){
        return ok();
    }


    @Transactional
    public static Result removeCantina(Long id){
        SGDB.removeCantina(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeDoacao(Long id){
        SGDB.removeDoacao(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeComponente(Long id){
        SGDB.removeComponente(id);
        View v = SGDB.getView("idcomponente", String.valueOf(id));
        if(v!=null){
            SGDB.removeView(v);
        }
        return renderAdmin();
    }

    @Transactional
    public static Result removeView(Long id){
        SGDB.removeView(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeOferta(Long id){
        SGDB.removeOferta(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeSugestao(Long id){
        SGDB.removeSugestao(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeOperacao(Long id){
        SGDB.removeOperacao(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeMusica(Long id){
        SGDB.removeMusica(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeAtividade(Long id){
        return ok();
    }

    @Transactional
    public static Result setView(Long id, String value){
        int valor = Integer.parseInt(value);
        SGDB.setView(id,valor);

        return renderAdmin();
    }
}
