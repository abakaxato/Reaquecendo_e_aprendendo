public class MainHeranca {

    public static void main (String [] args){

        Pessoa p1 = new Pessoa("caua","M",21);
        Aluno p2 = new Aluno("joao","M",15,7371,"Administração");
        Professor p3 = new Professor("ana","F",26,"Informatica",1550.00f);
        Funcionario p4 = new Funcionario("maria","F",32,"gerencia",true);

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
        p4.apresentar();

        System.out.println("\n salario da ana = " + p3.getSalario() + "\n");
        System.out.println("tome um aumento minha filha ");
        p3.receberAume(50);
        System.out.println(p3.getSalario());

    }
}
