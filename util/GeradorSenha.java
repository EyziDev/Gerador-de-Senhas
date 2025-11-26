package geradorDeSenha.util;

import java.security.SecureRandom;

public class GeradorSenha {
    private static final String letrasSenha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String numerosSenha = "0123456789";
    private static final String caracteresSenha = "!@#$%&*_?";

    public static String gerarSenha(int tamanho){
        String padrao = letrasSenha + numerosSenha + caracteresSenha;
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++){
            int index = random.nextInt(padrao.length());
            senha.append(padrao.charAt(index));
        }

        return senha.toString();
    }
}
