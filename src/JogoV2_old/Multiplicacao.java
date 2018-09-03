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
 * @author 20171BSI0367
 */
public class Multiplicacao {
    int operador1;
    int operador2;
    int pontos;
    int respostas;
    
    private void Multiplciacao(){
      this.pontos = 0;
    }
    void CriarPergunta(){
       this.operador1 = ThreadLocalRandom.current().nextInt(0,10);
       this.operador2 = ThreadLocalRandom.current().nextInt(0,10);
       String resposta = JOptionPane.showInputDialog("Quanto é " + this.operador1 + "*" + this.operador2 + "?");
       int respostaInt = Integer.parseInt(resposta);
       VerificarResposta(respostaInt);
    }
    
    void VerificarResposta(int valor){
        if (this.operador1 * this.operador2 == valor){
            ExibirResposta(true);
            
       }else{
           ExibirResposta(false);
       }
    }
    
    void ExibirResposta(boolean resultado){
        if (resultado == true){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
           this.pontos += 1;
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
    }
    
}
