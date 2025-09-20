/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Classe de teste do projeto
 * @author rapha
 */

package fabricaauto;
public class FabricaAuto {

    public static void main(String[] args) {
        // --- Criando e testando um objeto Carro ---
        System.out.println("---[ TESTE DO CARRO ]---");
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Sedan Esportivo";
        meuCarro.cor = "Preto";
        meuCarro.placa = "XYZ-1234";
        meuCarro.tetosolar = 1;
        meuCarro.aberto = 0; // Carro começa fechado

        // Tenta mover desligado (deve falhar)
        meuCarro.mover();

        // Liga o carro e tenta mover novamente (deve funcionar)
        meuCarro.ligar();
        meuCarro.mover();

        // Abre e fecha o carro
        meuCarro.abrirFechar();
        meuCarro.abrirFechar();

        // Para o carro
        meuCarro.parar();

        System.out.println("\n--------------------------\n");

        // --- Criando e testando um objeto Moto ---
        System.out.println("---[ TESTE DA MOTO ]---");
        Moto minhaMoto = new Moto();
        minhaMoto.modelo = "Street Fighter V2";
        minhaMoto.cor = "Vermelha";
        minhaMoto.placa = "ABC-9876";
        minhaMoto.freioabs = 1;
        minhaMoto.tembau = 0;

        // Liga e move a moto
        minhaMoto.ligar();
        minhaMoto.mover();

        // Aciona o alarme
        minhaMoto.alarme();

        // Para a moto
        minhaMoto.parar();
    }
}