

public class Pilha implements IPilha{

  int tamanhoInicial = 10;

  int topoRubro;

  int topoNegro;

  int a[];

  int tamanho;

  Pilha(){
    this.topoRubro = -1;
    this.topoNegro = 10;
    this.tamanho = 0;
    this.a = new int[tamanhoInicial];
  }

  //Implementação Pilha Rubra
  
  @Override
  public void pushRubro(int o){
    if (topoRubro >= (tamanhoInicial-1)){
      System.out.println("Pilha Rubra cheia > Duplicar pilha");
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
      throw new PilhaVaziaException("Pilha Rubra vazia!");
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

    int[] newR = new int [this.tamanhoInicial%2];
    int[] newN = new int [this.tamanhoInicial%2];
    int[] newA = new int [this.tamanhoInicial*2];
    
    for (int i = 0; i<this.tamanhoInicial%2;i++){
      newR[i] = this.a[i]; 
    }

    for (int i = (tamanhoInicial%2 + 1); i<this.tamanhoInicial;i++){
      newN[i] = this.a[i]; 
    }

    for (int i = 0; i< tamanhoInicial%2; i++){
      newA[i] = newR[i];
    }

    for (int i = (tamanhoInicial*2)-1; i> tamanhoInicial%2; i--){
      newA[i] = newN[i];
    }    

    this.a = new int[this.tamanhoInicial*2];

    for (int i = 0; i< tamanhoInicial%2; i++){
      this.a[i] = newR[i];
    }

    for (int i = (tamanhoInicial*2)-1; i> tamanhoInicial%2; i--){
      this.a[i] = newN[i];
    }  

    this.tamanhoInicial = this.tamanhoInicial*2;

    System.out.println("Pilha duplicada");
    
  }

  //Implementação Pilha Negra

  @Override
  public void pushNegro(int o){
    if (topoNegro <= ((this.tamanhoInicial % 2)-1)){
      System.out.println("Pilha Negra cheia > Duplicar pilha");
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
    if(topoNegro > this.tamanhoInicial-1){
      throw new PilhaVaziaException("Pilha Negra vazia!");
    }
    else{
      this.topoNegro += 1;
      int x = a[this.topoNegro++];
      this.tamanho -= 1;
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
    System.out.println("entrou");
    for(int i = 0; i < this.tamanhoInicial;i++){
      System.out.println(this.a[i]);
    }
  }
  
  
}