/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe base para todos os automóveis da fábrica.
 * Contém atributos e comportamentos comuns as classes filhas.
 * @author rapha
 */

package fabricaauto;
public class Automovel {

    // Atributos comuns a todos os automóveis
    String cor;
    String placa;
    String modelo;
    int ligado; // 0 para desligado, 1 para ligado
    int emmovimento; // 0 para parado, 1 para em movimento

    //Liga o automóvel e atualiza seu estado
    public void ligar() {
        this.ligado = 1; // Atualiza o estado para ligado
        System.out.println("O automóvel modelo '" + this.modelo + "' está ligado.");
    }

    //Move o automóvel, se ele estiver ligado
    public void mover() {
        if (this.ligado == 1) {
            this.emmovimento = 1; // Atualiza o estado para em movimento
            System.out.println("O automóvel modelo '" + this.modelo + "' está em movimento.");
        } else {
            System.out.println("Não é possível mover. O automóvel '" + this.modelo + "' está desligado.");
        }
    }

    //Para o automóvel, se ele estiver em movimento
    public void parar() {
        if (this.emmovimento == 1) {
            this.emmovimento = 0; // Atualiza o estado para parado
            System.out.println("O automóvel modelo '" + this.modelo + "' está parado.");
        } else {
            System.out.println("Não é possível parar. O automóvel '" + this.modelo + "' já está parado.");
        }
    }
}
