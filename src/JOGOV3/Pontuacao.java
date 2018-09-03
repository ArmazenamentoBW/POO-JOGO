/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOGOV3;

/**
 *
 * @author 20171BSI0367
 */
public class Pontuacao {
    
    int pontos;
    
    void verificarQuestão(Questao questao){
        pontos +=questao.pontos;
    }
    
    void exibirPontuacao(){
        
    }
    
}
