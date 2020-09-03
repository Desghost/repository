package Tarefa4;
import java.util.Scanner;
public class Tarefa4 {

	public static void main(String[] args) {

        
        Scanner read = new Scanner(System.in);
         ItemDePedido[] lista;
         System.out.println("Informe quantos produtos tem na lolja");
         
         read.nextLine();
         System.out.println("Quantos produtos?");
         int qtd = read.nextInt();
         read.nextLine();
         lista = new ItemDePedido[qtd];
         int op = 0;
         while(op !=999){
             System.out.println("1- cadastrar estoque"); //incluir pedido *
             System.out.println("2- alterar dados dos produtos"); //excluir pedido por nome do cliente *
             System.out.println("3- vender produto"); // listar pedidos
             System.out.println("4- relatorio do estoque"); // incluir item de pedido em pedido
             System.out.println("999 - sair do programa"); //excluir item de pedido em pedido
             op = read.nextInt(); //imprimir lista de pedidos
             
             
             
          switch(op){
              case 1:
                  
                  for(int cont = 0; cont <qtd; cont++){
                      lista[cont] = new ItemDePedido();
                      System.out.println("informe o nome do produto");
                      String nome = read.nextLine();
                      read.nextLine();
                      System.out.println("informe a descrição do produto");
                      String descricao = read.nextLine();
                      System.out.println("Informe a quantidade do produto");
                      int quantidade = read.nextInt();
                      read.nextLine();
                      System.out.println("informe o valor do produto");
                      double valor = read.nextDouble();
                      read.nextLine();
       
                      lista[cont].cadastrar(cont, nome, valor, descricao, quantidade);

                  }
                  break;
              case 2:
                 System.out.println("Qual produto?");
                 int tamanho = lista.length;
                 for(int cont = 0; cont < tamanho; cont++){
                     System.out.println("----------");
                     System.out.println("ID: "+ lista[cont].getId());
                     System.out.println("Nome: "+ lista[cont].getNome());
                 }
                  System.out.println("Digite o ID do produto: ");
                  int idProd = read.nextInt();
                  read.nextLine();
                  if(idProd >= 0 && idProd < tamanho){
                      System.out.println("O que você deseja alterar?");
                      System.out.println("1-Nome, 2-Descrição, 3-Valor, 4-Quantidade");
                      int escolhaAlteracao = read.nextInt();
                      read.nextLine();
                      switch(escolhaAlteracao){
                  
                      case 1:
                          System.out.println("Digite o novo nome: ");
                          String novoNome = read.nextLine();
                          lista[idProd].setNome(novoNome);
                          break;
                          
                      case 2:
                          System.out.println("Informe a nova descrição: ");
                          String novaDescricao = read.nextLine();
                          lista[idProd].setDescricao(novaDescricao);
                          break;
                      
                      case 3:
                          System.out.println("Informe o novo valor: ");
                          double novoValor = read.nextDouble();
                          lista[idProd].setValor(novoValor);
                          break;
                      
                      case 4:
                          System.out.println("Digite a nova quantidade: ");
                          int novaQtd = read.nextInt();
                          lista[idProd].setQuantidade(novaQtd);
                          break;
                      
                      default:
                          System.out.println("Opção invalida");
                          break;
                     
                  }
                  }else{
                      System.out.println("Inválido");
                  }
                  
                  break;
              case 3:
                  System.out.println("Qual produto você gostaria de comprar");
                 tamanho = lista.length;
                 for(int cont = 0; cont < tamanho; cont++){
                     System.out.println("----------");
                     System.out.println("ID: "+ lista[cont].getId());
                     System.out.println("Nome: "+ lista[cont].getNome());
                 }
                  break;
              case 4:    
                  System.out.println("Os produtos no estoque são: ");
                  
                  break;
              case 999:
                  System.out.println("cabo");
                  
                  break;
              default:
                  System.out.println("Opção inválida");
                  break;
          	}


         }

	}
}

