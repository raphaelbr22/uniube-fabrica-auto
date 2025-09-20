/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A classe Carro herda de Automovel e adiciona
 * características específicas de um carro.
 * @author rapha
 */

package fabricaauto;
public class Carro extends Automovel {

    // Atributos específicos do Carro
    int tetosolar; // 0 para não, 1 para sim
    int aberto; // 0 para fechado, 1 para aberto

    
    //Alterna o estado do carro entre aberto e fechado
    public void abrirFechar() {
        if (this.aberto == 0) {
            this.aberto = 1; // Atualiza o estado para aberto
            System.out.println("O carro agora está aberto.");
        } else {
            this.aberto = 0; // Atualiza o estado para fechado
            System.out.println("O carro agora está fechado.");
        }
    }
}