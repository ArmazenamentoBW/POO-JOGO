/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGOV3;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171BSI0367
 */
public abstract class Questao {
    int operador1;
    int operador2;
    int pontos;
    int respostas;
    
    private void Questao(){
      //this.pontos = 0;
    }
    
    
    public abstract boolean verificarResposta();
    
    
    void exibirResposta(boolean resultado){
        if (resultado == true){
           JOptionPane.showMessageDialog(null,"Acertô mizeravi!");
           this.pontos += 1;
       }else{
           JOptionPane.showMessageDialog(null,"Erroooooooooou!");
       }
    }
    
}
