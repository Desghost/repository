package Tarefa4;

public class ItemDePedido {
    
    private int id;
    private String nome;
    private String descrição;
    private double preço;
    private int quantidade;
   
    public void cadastrar(int novoId, String novoNome, double novoPreço, String novaDescricao, int novaQtd){
        this.id = novoId;
        this.nome = novoNome;
        this.descrição = novaDescricao;
        this.quantidade = novaQtd;  
        this.preço = novoPreço;
        
    }
   public boolean vender(int qtdDesejada){
       if(this.quantidade >= qtdDesejada){
           this.quantidade -= qtdDesejada;
           return true;
       }
       else{
           return false;
       }
       
   }
   public void setNome(String novoNome){
       this.nome = novoNome;    
   } 
   public void setDescricao(String novaDesc){
       this.descrição = novaDesc;
   }
   public void setValor(double novoValor){
       this.preço = novoValor;
   }
   public void setQuantidade(int novaQTD){
       this.quantidade = novaQTD;
   }
   
   public int getId(){
       return this.id;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public String getDescricao(){
       return this.descrição;
   }
   
   public int getQuantidade(){
       return this.quantidade;
   }
   
   public double getValor(){
       return this.preço;
   }
}
