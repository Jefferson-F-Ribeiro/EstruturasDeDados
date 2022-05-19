

public class Pilha implements IPilha{

  int tamanhoInicial = 10;

  int topoRubro;

  int topoNegro;

  int a[];

  int tamanho;

  Pilha(){
    this.topoRubro = -1;
    this.tamanho = 0;
    this.a = new int[tamanhoInicial];
  }

  //Implementação Pilha Rubra
  
  @Override
  public void pushRubro(int o){
    if (topoRubro >= (tamanhoInicial-1)){
      System.out.println("Pilha cheia > Duplicar pilha");
      this.duplicarArray();
      this.pushRubro(o);
    }

    else{
      this.topoRubro += 1;
      this.a[topoRubro] = o;
      this.tamanho += 1;
    }
  }

  @Override
	public int popRubro() throws PilhaVaziaException{
    if(topoRubro < 0){
      throw new PilhaVaziaException("Pilha vazia!");
    }
    else{
      this.topoRubro -= 1;
      int x = a[topoRubro--];
      this.tamanho -= 1;
      return x;
    }  
  }

  @Override
	public int topRubro() throws PilhaVaziaException{

    if (topoRubro < 0){
      throw new PilhaVaziaException("Pilha vazia");
      }
      
    else{
      return a[topoRubro];
    }
  }

  @Override
	public boolean isEmptyRubro(){
    return (topoRubro < 0);
  }
  
  @Override
	public int size(){
    return this.tamanho;
  }

  public void duplicarArray(){

    int[] newA = new int [this.tamanhoInicial*2];
    
    for (int i = 0; i<this.tamanhoInicial;i++){
      newA[i] = this.a[i]; 
    }

    this.tamanhoInicial = tamanhoInicial*2;

    this.a = new int[this.tamanhoInicial];

    for (int i = 0; i<this.tamanhoInicial;i++){
      this.a[i] = newA[i]; 
    }
    

    System.out.println("Pilha duplicada");
    
  }

  //Implementação Pilha Negra

  @Override
  public void pushNegro(int o){
    if (topoNegro <= ((this.tamanhoInicial % 2)-1)){
      System.out.println("Pilha cheia > Duplicar pilha");
      this.duplicarArray();
      this.pushNegro(o);
    }

    else{
      this.topoNegro -= 1;
      this.a[topoNegro] = o;
      this.tamanho += 1;
    }
  }

  @Override
	public int popNegro() throws PilhaVaziaException{
    if(topoRubro < 0){
      throw new PilhaVaziaException("Pilha vazia!");
    }
    else{
      this.topoRubro -= 1;
      int x = a[topoRubro--];
      this.tamanho -= 1;
      return x;
    }  
  }

  @Override
	public int topNegro() throws PilhaVaziaException{

    if (topoRubro < 0){
      throw new PilhaVaziaException("Pilha vazia");
      }
      
    else{
      return a[topoRubro];
    }
  }

  @Override
	public boolean isEmptyNegro(){
    return (topoRubro < 0);
  }

  
  
}