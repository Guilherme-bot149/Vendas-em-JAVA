import java.util.Scanner;
public class Main {
    public static void main(String[] args){ 
        

    VendaProduto vendas = new VendaProduto();
    
    
    System.out.println("    Bem Vindo    ");
    Scanner leia = new Scanner(System.in);
    
    vendas.MenuPrincipal();
    
    System.out.print("Digite o valor do Total do Produto: ");
    vendas.setValorTotal(leia.nextInt());
    
    System.out.print("Digite a Quantidade Total do Produto: ");
    vendas.setQuantProduto(leia.nextInt());
 
    System.out.print("Digite o Desconto: ");
    vendas.setDesconto(leia.nextInt());
    
    System.out.print("Nota do Atendimento de 1 a 5: ");
    vendas.setnota(leia.nextInt());
    
    
    
    vendas.status();
    }
}
