package Contas;
public class Contas {
    public static void mais(String[] args) {
        Conta_Banco p1 = new Conta_Banco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.estadoAtual();

        Conta_Banco p2 = new Conta_Banco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.estadoAtual();
    }
}