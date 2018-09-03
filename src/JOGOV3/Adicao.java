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
public class Adicao extends Questao {
      
    void criarPergunta(){
       this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
       this.operador2 = ThreadLocalRandom.current().nextInt(0,20);
       String resposta = JOptionPane.showInputDialog("Quanto é " + this.operador1 + "+" + this.operador2 + "?");
       this.respostas = Integer.parseInt(resposta);
       verificarResposta();
    }
    
    public boolean verificarResposta(){
        if (this.operador1 + this.operador2 == this.respostas){
            exibirResposta(true);
            return true;
            
       }else{
           exibirResposta(false);
           return false;
       }

    }
}
