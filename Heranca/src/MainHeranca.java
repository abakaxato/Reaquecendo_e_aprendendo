import java.util.ArrayList;
import java.util.List;

public class MainHeranca {

    public static void main (String [] args){

        //Iniciando uma lista
        List<Pessoa> pessoas = new ArrayList<>();
        //Adicionando um novo objeto na lista
        pessoas.add(new Pessoa("angelo","masc",26));
        //Recuperando um objeto atravez do endereço
        Pessoa a = pessoas.get(0);
        System.out.println(a.getNome());
        //Removendo um objeto da lista atraves do objeto criado no get, ou usando o endereço
        pessoas.remove(a);
        //pessoas.remove(0);









        /*Pessoa p1 = new Pessoa("caua","M",21);
        Aluno p2 = new Aluno("joao","M",15,7371,"Administração");
        Professor p3 = new Professor("ana","F",26,"Informatica",1550.00f);
        Funcionario p4 = new Funcionario("maria","F",32,"gerencia",true);

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
        p4.apresentar();*/


    }
}
