public class Computador {
    //Atributos do computador
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico;
    MemoriaUSB memoriaUSB;

    //Criar contrutor do Computador
    public Computador(SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasico) {
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico;
    }

    //Mostrar as configuraçõs do PC
    void mostraPCConfigs(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Preço: R$"+this.preco);
        System.out.println(this.hardwareBasico[0].nome+" ("+this.hardwareBasico[0].capacidade+" Mhz)");
        System.out.println(this.hardwareBasico[1].capacidade+" Gb de "+this.hardwareBasico[1].nome);
        if(this.hardwareBasico[2].capacidade < 1000){
            System.out.println(this.hardwareBasico[2].capacidade+"Gb de "+this.hardwareBasico[2].nome);
        }
        else{
            System.out.println((this.hardwareBasico[2].capacidade/1000)+"Tb de "+this.hardwareBasico[2].nome);
        }
        System.out.println("Sistema Operacional "+this.sistemaOperacional.nome+" ("+this.sistemaOperacional.tipo+" bits)");
        if(memoriaUSB != null){
            if(this.memoriaUSB.capacidade < 1000){
                System.out.println("Acompanha "+this.memoriaUSB.nome+" de "+this.memoriaUSB.capacidade+"Gb");
            }
            else{
                System.out.println("Acompanha "+this.memoriaUSB.nome+" de "+(this.memoriaUSB.capacidade/1000)+"Tb");
            }
        }
    }

    //Adicionar a memória USB
    void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
