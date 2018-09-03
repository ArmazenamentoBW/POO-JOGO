/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGOV3;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0367
 */
public class JOGO {
    
    public void iniciaJogo(){
        Adicao perguntas_adi = new Adicao();
        Subtracao perguntas_sub = new Subtracao();
        Multiplicacao perguntas_mult = new Multiplicacao();
        Pontuacao pont = new Pontuacao();
        String resposta;
        int intResposta = 1;
        int operacao;
        
        
        while (intResposta == 1){
            operacao = ThreadLocalRandom.current().nextInt(0,2);
            switch (operacao) {
                case 0:
                    perguntas_adi.criarPergunta();
                    pont.verificarQuestão(perguntas_adi);
                    break;
                case 1:
                    perguntas_sub.criarPergunta();
                    break;
                default:
                    perguntas_mult.criarPergunta();
                    break;
            }
            resposta = JOptionPane.showInputDialog("Proxima? (Responda 1 para continuar)");
            intResposta = Integer.parseInt(resposta);
            JOptionPane.showMessageDialog(null,"" +resposta);
        }
    }
    
}
