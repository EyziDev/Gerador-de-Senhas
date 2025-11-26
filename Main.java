package geradorDeSenha;

import geradorDeSenha.util.GeradorSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GeradorSenha geradorSenha = new GeradorSenha();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da senha: ");
        //int tamanhoSenha = sc.nextInt(); "Opção desativada! Tamanho padrão = 20"

        System.out.printf("Senha Gerada: %s", GeradorSenha.gerarSenha(20)); //para alterar o tamanho da senha, basta alterar o número dentro do parâmetro.
    }
}
