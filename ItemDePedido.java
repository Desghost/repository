package Tarefa4;

public class ItemDePedido {
    
    private int id;
    private String nome;
    private String descri��o;
    private double pre�o;
    private int quantidade;
   
    public void cadastrar(int novoId, String novoNome, double novoPre�o, String novaDescricao, int novaQtd){
        this.id = novoId;
        this.nome = novoNome;
        this.descri��o = novaDescricao;
        this.quantidade = novaQtd;  
        this.pre�o = novoPre�o;
        
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
       this.descri��o = novaDesc;
   }
   public void setValor(double novoValor){
       this.pre�o = novoValor;
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
       return this.descri��o;
   }
   
   public int getQuantidade(){
       return this.quantidade;
   }
   
   public double getValor(){
       return this.pre�o;
   }
}
