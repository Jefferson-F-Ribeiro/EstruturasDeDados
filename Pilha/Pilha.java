

public class Pilha implements IPilha{

  int tamanhoInicial = 10;

  int topoRubro;

  int sizeRubro;

  int topoNegro;

  int sizeNegro;

  int a[];

  int tamanho;

  Pilha(){
    this.topoRubro = -1;
    this.topoNegro = 10;
    this.tamanho = this.sizeRubro = this.sizeNegro = 0;
    this.a = new int[tamanhoInicial];
  }

  //Implementação Pilha Rubra
  
  @Override
  public void pushRubro(int o){
    if (topoRubro >= (tamanhoInicial/2)-1){
      this.duplicarArray();
      this.pushRubro(o);
    }

    else{
      this.topoRubro += 1;
      this.a[topoRubro] = o;
      this.tamanho += 1;
      this.sizeRubro += 1;
    }
  }

  @Override
	public int popRubro() throws PilhaVaziaException{
    if(topoRubro < 0){
      throw new PilhaVaziaException("Pilha Rubra vazia!");
    }
    else{
      this.topoRubro -= 1;
      int x = a[topoRubro];
      this.tamanho -= 1;
      this.sizeRubro -= 1;
      return x;
    }  
  }

  @Override
	public int topRubro() throws PilhaVaziaException{

    if (this.topoRubro < 0){
      throw new PilhaVaziaException("Pilha Rubra vazia");
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
  
    int[] newA = new int[this.tamanhoInicial*2];

    for (int i = 0; i<this.tamanhoInicial/2; i++){
      newA[i] = this.a[i];
      newA[(this.tamanhoInicial*2)-i-1] = this.a[this.tamanhoInicial-i-1];
    }
    this.tamanhoInicial = this.tamanhoInicial*2;

    this.topoNegro = this.tamanhoInicial - this.sizeNegro;
    
    this.a = new int[tamanhoInicial];
    a = newA;
  }

  //Implementação Pilha Negra

  @Override
  public void pushNegro(int o){
    if (topoNegro <= ((this.tamanhoInicial/2))){
      System.out.println("Pilha Negra cheia > Duplicar pilha");
      this.duplicarArray();
      this.pushNegro(o);
    }

    else{
      this.topoNegro -= 1;
      this.a[topoNegro] = o;
      this.tamanho += 1;
      this.sizeNegro += 1;
    }
  }

  @Override
	public int popNegro() throws PilhaVaziaException{
    if(this.topoNegro >= this.tamanhoInicial){
      throw new PilhaVaziaException("Pilha Negra vazia!");
    }
    else{
      this.topoNegro += 1;
      int x = a[this.topoNegro];
      this.tamanho -= 1;
      this.sizeNegro -= 1;
      return x;
    }  
  }

  @Override
	public int topNegro() throws PilhaVaziaException{

    if (topoNegro > this.tamanhoInicial-1){
      throw new PilhaVaziaException("Pilha Negra vazia");
      }
      
    else{
      return a[topoNegro];
    }
  }

  @Override
	public boolean isEmptyNegro(){
    return (topoNegro > this.tamanhoInicial-1);
  }

  public void imprimir(){
    for(int i = 0; i < this.tamanhoInicial;i++){
      System.out.print("[" + this.a[i] + "] ");
    }
    System.out.println("\n");
  }
  
  
}