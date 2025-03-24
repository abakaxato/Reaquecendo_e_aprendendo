public class gafanhoto {

    //Atributos
    private boolean login;
    private int totAssistido;

    //Métodos

    public void assistirMaisUm(){
        this.setTotAssistido(+1);
    }

    //Getters and Setters

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
