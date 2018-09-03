/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoV2_old;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author walla
 */
public class JogoV2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Adicao perguntas_adi = new Adicao();
        Subtracao perguntas_sub = new Subtracao();
        Multiplicacao perguntas_mult = new Multiplicacao();
        String resposta;
        int intResposta = 1;
        int operacao;
        
        
        while (intResposta == 1){
            operacao = ThreadLocalRandom.current().nextInt(0,2);
            switch (operacao) {
                case 0:
                    perguntas_adi.CriarPergunta();
                    break;
                case 1:
                    perguntas_sub.CriarPergunta();
                    break;
                default:
                    perguntas_mult.CriarPergunta();
                    break;
            }
            resposta = JOptionPane.showInputDialog("Proxima?(Responda 1 para continuar)");
            intResposta = Integer.parseInt(resposta);
            JOptionPane.showMessageDialog(null,"" +resposta);
        }
        JOptionPane.showMessageDialog(null,"Sua pontuacao total é:" + (perguntas_mult.pontos + perguntas_adi.pontos + perguntas_sub.pontos));
        
    }
    
}
