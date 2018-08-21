/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoV2;

//import static java.lang.Boolean;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0367
 */
public class Subtracao {
    int operador1;
    int operador2;
    int pontos;
    int respostas;
    
    private void Subtracao(){
      this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
      this.operador2 = ThreadLocalRandom.current().nextInt(0,20);
    }
    void CriarPergunta(){
       String resposta = JOptionPane.showInputDialog("Quanto é " + this.operador1 + "-" + this.operador2 + "?");
       int respostaInt = Integer.parseInt(resposta);
       VerificarResposta(respostaInt);
    }
    
    void VerificarResposta(int valor){
        if (this.operador1 - this.operador2 == valor){
            ExibirResposta(true);
            
       }else{
           ExibirResposta(false);
       }
    }
    
    void ExibirResposta(boolean resultado){
        if (resultado == true){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
    }
    
}
