import java.util.Scanner;

public final class VendaProduto {
    private String descricao, nomeProduto; 
    private float qtd, valor, newValue, ValorTotal, tota, total; 
    private float porcentagemDesconto; 
    private float valorDesconto, resultado, resul, setValorTotalProduto;
    private int setQuantProduto, quant, setnota, notacliente;
    int cont = 0;
    char resposta = 'R';
    int b, x, y;
    
    
    
    public VendaProduto(){
    }
    
    //sobrecarga
    public VendaProduto(float newValue){
        this.setValorTotal(valor);
        this.setDesconto(newValue);
        
    }
   
   public void x(String descricao){
       this.descricao=descricao;
   }
    
    public void setValorTotal(float valor) {
        this.valor=valor;
    }
    
    public void setQuantProduto(int quant){
        this.quant = quant;
        this.ValorTotal = this.valor * this.quant;
    }
    
    
    public void setDesconto(float newValue) {
        this.newValue = newValue / 100;
    }
    
    public float valorDesconto(){
        valorDesconto = ValorTotal * newValue;
        return this.valorDesconto;
    }
    
        public float setnota(int notacliente){
        this.notacliente = notacliente;
        return this.notacliente;
    }
    
    public float resultado(){
        resul = valor - valorDesconto;
        return this.resul;
    }
    
    public float total(){
        tota = resul * quant;
        return this.tota;
    }

    public void status(){
        System.out.println("==================== NOTA FISCAL ========================");
        System.out.println(" Opção do Hambúrguer: " + x +
        "\n Valor do Hambúrguer: " + this.valor + 
        "\n Quantidade de Hambúrguer: " + this.quant +
        "\n Valor de Todos os Hambúrguers: " + this.ValorTotal +
        "\n Valor do Desconto: " + this.valorDesconto() +
        "\n Valor Total de cada Hambúrguer: " + this.resultado()+
        "\n Valor Total de todos os Hambúrguers com desconto: " + this.total() + 
        "\n Nota de Atendimento: " +this.notacliente);
        System.out.println("==========================================================");
    }
    
    
    public void MenuPrincipal(){
        Scanner s = new Scanner(System.in);
        while (resposta == 'R' || resposta == 'R') {
            
            
            System.out.println("1 - X - Salada");
            System.out.println("2 - X - Bacon");
            System.out.println("3 - X - Frango");
            System.out.println("4 - X - Picanha");
            System.out.println("Escolha um opcao: ");
            
            x = s.nextInt();
            switch(x)
            {
                case 1:
                    System.out.print("Você escolheu a opção X - Salada: \n");
                    System.out.print("          \n");
                    break;
                case 2:
                    System.out.print("Você escolheu a opção X - Bacon: \n");
                    System.out.print("          \n");
                    break;
                    
                case 3:
                    System.out.print("Você escolheu a opção X - Frango: \n");
                    System.out.print("          \n");
                    break;
                case 4:
                    System.out.print("Você escolheu a opção X - Picanha: \n");
                    System.out.print("          \n");
                    break;
                default:
                System.out.println("Operacao Invalida!!!");
                break;
            }
        break;
      }
    }
  }
