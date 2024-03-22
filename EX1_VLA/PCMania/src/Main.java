import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar computador da promoção 1 e adicionar suas informações
        SistemaOperacional so1 = new SistemaOperacional();
        so1.nome = "Linux Ubuntu";
        so1.tipo = 32;
        HardwareBasico[] hb1 = new HardwareBasico[3];
        hb1[0] = new HardwareBasico();
        hb1[0].nome = "Pentium Core i3";
        hb1[0].capacidade = 2200;
        hb1[1] = new HardwareBasico();
        hb1[1].nome = "Memória RAM";
        hb1[1].capacidade = 8;
        hb1[2] = new HardwareBasico();
        hb1[2].nome = "HD";
        hb1[2].capacidade = 500;
        MemoriaUSB m1 = new MemoriaUSB();
        m1.nome = "Pen-drive";
        m1.capacidade = 16;
        Computador c1 = new Computador(so1, hb1);
        c1.marca = "Positivo";
        c1.preco = 3300;
        c1.addMemoriaUSB(m1);

        //Criar computador da promoção 2 e adicionar suas informações
        SistemaOperacional so2 = new SistemaOperacional();
        so2.nome = "Windows 8";
        so2.tipo = 64;
        HardwareBasico[] hb2 = new HardwareBasico[3];
        hb2[0] = new HardwareBasico();
        hb2[0].nome = "Pentium Core i5";
        hb2[0].capacidade = 3370;
        hb2[1] = new HardwareBasico();
        hb2[1].nome = "Memória RAM";
        hb2[1].capacidade = 16;
        hb2[2] = new HardwareBasico();
        hb2[2].nome = "HD";
        hb2[2].capacidade = 1000;
        MemoriaUSB m2 = new MemoriaUSB();
        m2.nome = "Pen-drive";
        m2.capacidade = 32;
        Computador c2 = new Computador(so2, hb2);
        c2.marca = "Acer";
        c2.preco = 8800;
        c2.addMemoriaUSB(m2);

        //Criar computador da promoção 3 e adicionar suas informações
        SistemaOperacional so3 = new SistemaOperacional();
        so3.nome = "Windows 10";
        so3.tipo = 64;
        HardwareBasico[] hb3 = new HardwareBasico[3];
        hb3[0] = new HardwareBasico();
        hb3[0].nome = "Pentium Core i7";
        hb3[0].capacidade = 4500;
        hb3[1] = new HardwareBasico();
        hb3[1].nome = "Memória RAM";
        hb3[1].capacidade = 32;
        hb3[2] = new HardwareBasico();
        hb3[2].nome = "HD";
        hb3[2].capacidade = 2000;
        MemoriaUSB m3 = new MemoriaUSB();
        m3.nome = "HD Externo";
        m3.capacidade = 1000;
        Computador c3 = new Computador(so3, hb3);
        c3.marca = "Vaio";
        c3.preco = 4800;
        c3.addMemoriaUSB(m3);

        //Criar scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Criar cliente
        Cliente cliente = new Cliente();
        //Ler informações do cliente e cadastrá-lo
        System.out.println("Bem-vindo à loja PC Mania!");
        System.out.println("Vamos iniciar com seu cadastro!");
        System.out.println("Entre com seu nome:");
        cliente.nome = entrada.nextLine();
        System.out.println("Entre com seu CPF:");
        cliente.cpf = entrada.nextLong();
        System.out.println("Cadastro realizado com sucesso!");

        //Criar menu de compra
        boolean flagMenu = true; //controle do menu
        int opcao; //controle de opções do menu
        int qtdComputadores = 0; //quantidade de computadores do cliente

        while(flagMenu){
            System.out.println("\n------------------------------------------------------------");
            System.out.println("Bem-vindo ao menu de compras!");
            System.out.println("Escolha uma opção de promoção ou finalize a compra:");
            System.out.println("\n0- Finalizar compra;");
            System.out.println("\n1- Promoção 1:");
            c1.mostraPCConfigs();
            System.out.println("\n2- Promoção 2:");
            c2.mostraPCConfigs();
            System.out.println("\n3- Promoção 3:");
            c3.mostraPCConfigs();
            //Ler opção escolhida
            opcao = entrada.nextInt();

            switch (opcao){
                //Finalizar compra e fechar menu
                case(0):
                    System.out.println("Compra finalizada!");
                    flagMenu = false;
                    break;
                //Adicionar computador da promoção 1
                case(1):
                    cliente.computadores[qtdComputadores] = c1;
                    qtdComputadores += 1;
                    System.out.println("Compra realizada do computador da promoção 1!");
                    break;
                //Adicionar computador da promoção 2
                case(2):
                    cliente.computadores[qtdComputadores] = c2;
                    qtdComputadores += 1;
                    System.out.println("Compra realizada do computador da promoção 2!");
                    break;
                //Adicionar computador da promoção 3
                case(3):
                    cliente.computadores[qtdComputadores] = c3;
                    qtdComputadores += 1;
                    System.out.println("Compra realizada do computador da promoção 3!");
                    break;
                //Caso apresente uma opção inválida
                default:
                    System.out.println("Entre com uma opção válida!");
                    break;
            }

        }
        //Mostrar informações do cliente
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\nInformações do cliente:");
        System.out.println(" -Nome: "+cliente.nome);
        System.out.println(" -CPF: "+cliente.cpf);
        //Mostrar computadores adquiridos e total da compra
        if(qtdComputadores != 0){
            System.out.println("\nOs computadores adquiridos foram:");
            for(Computador computador : cliente.computadores){
                if(computador != null){
                    computador.mostraPCConfigs();
                    System.out.println();
                }
            }
            System.out.println("O total da compra foi R$"+cliente.calculaTotalCompra());
        }
        else{
            System.out.println("\nNenhuma compra foi realizada!");
        }

        //Encerrar scanner
        entrada.close();
    }
}
