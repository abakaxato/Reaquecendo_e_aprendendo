public class ProjetoLivro {

    public static void main (String [] args){

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Masculino",25,"joão");
        p[1] = new Pessoa("Feminino",27, "maria");
        p[2] = new Pessoa("Masculino", 8, "otavio");

        l[0] = new Livro("Alice no pais das maravilhas","Lewis Carroll",136,p[1]);
        l[2] = new Livro("Jogos vorazes","Suzanne Collins",400,p[0]);
        l[1] = new Livro("O senhor dos aneis","J. R. R. Tolkien",1228,p[2]);

        System.out.println(l[0].Detalhes());

    }

}
