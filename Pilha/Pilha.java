public class Pilha implements IPilha{

  int tamanhoInicial = 10;

  int topo;

  int a[];

  int tamanho;

  Pilha(){
    topo = -1;
  }
  
  @Override
  public void push(Object o){
    if (topo >= (tamanhoInicial-1)){
      System.out.println("Pilha cheia > Duplicar pilha");
    }

    else{
      this.a[++topo] = (int) o;
    }
  }

  @Override
	public Object pop() throws PilhaVaziaException{
    if(topo < 0){
      //throw new PilhaVaziaException("Pilha vazia!");
      System.out.println("Pilha vazia!");
    }
    else{
      int x = a[topo--];
      return (Object) x;
    }
  }

  @Override
	public Object top() throws PilhaVaziaException{
    if (topo < 0){
      //throw new PilhaVaziaException("Pilha vazia!");
      System.out.println("Pilha vazia!");
    }
    else{
      return (Object) a[topo];
    }
  }

  @Override
	public boolean isEmpty(){
    return (topo < 0);
  }
  
  @Override
	public int size(){
    return this.tamanho;
  }
  
}