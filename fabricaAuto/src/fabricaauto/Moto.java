/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A classe Moto herda de Automovel e adiciona
 * características específicas de uma moto.
 * @author rapha
 */

package fabricaauto;
public class Moto extends Automovel {

    // Atributos específicos da Moto
    int freioabs; // 0 para não, 1 para sim
    int tembau;   // 0 para não, 1 para sim

    //Ativa o alarme da moto
    public void alarme() {
        System.out.println("Alarme da moto '" + this.modelo + "' ligado! BI BI BI!");
    }
}