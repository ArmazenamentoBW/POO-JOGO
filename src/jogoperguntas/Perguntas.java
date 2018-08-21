/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoperguntas;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0367
 */
public class Perguntas {
    
    public Perguntas(){
    }
    
    public void criarPergunta(){
        int operacao = ThreadLocalRandom.current().nextInt(0,2);
                
        switch (operacao) {
            case 0:
                adicao();
                break;
            case 1:
                subtracao();
                break;
            default:
                multiplicacao();
                break;
        }
        
        
        
    }
    
    private void adicao(){
       int operador1 = ThreadLocalRandom.current().nextInt(0,100);
       int operador2 = ThreadLocalRandom.current().nextInt(0,20);
       
       String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + "+" + operador2 + "?");
       int respostaInt = Integer.parseInt(resposta);
       if (operador1 + operador2 == respostaInt){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
        
    }
    
    private void subtracao(){
       int operador1 = ThreadLocalRandom.current().nextInt(0,100);
       int operador2 = ThreadLocalRandom.current().nextInt(0,20);
       
       String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + "-" + operador2 + "?");
       int respostaInt = Integer.parseInt(resposta);
       if (operador1 - operador2 == respostaInt){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
        
    }
    
    private void multiplicacao(){
       int operador1 = ThreadLocalRandom.current().nextInt(0,10);
       int operador2 = ThreadLocalRandom.current().nextInt(0,10);
       
       String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + "*" + operador2 + "?");
       int respostaInt = Integer.parseInt(resposta);
       if (operador1 * operador2 == respostaInt){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
        
    }
    
}
