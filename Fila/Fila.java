public class Fila implements IFila{

  private int[] array;

  private int size;

  private int index;

  private int maxI;
  
  @Override
  public void enqueue(Object o){
    if(this.size == maxI - 1){
      System.out.println("Fila cheia");
    }

    else
      this.array[this.index] = (int) o;
      this.index = (this.index+1) % this.maxI;
      this.size += 1;

    System.out.println(this.array[index-1]);
    System.out.println(this.index);
  }

  @Override
  public Object dequeue(){
    Object a = null;
    /*if(this.isEmpty()){
      System.out.println("Fila vazia");
    }
    else {*/
      a = this.array[this.index];
      System.out.println(a);
      this.index = (index+1)%this.maxI;
      this.size -= 1;
    
    return a;
  }

  @Override
  public Object first(){
    return this.array[this.index];
  }

  @Override
  public int size(){
    return this.size;
  }

  @Override
  public boolean isEmpty(){
    boolean ret = true;
    if(this.size >= 0){
      ret = false;
    }
    return ret;
  }

  public Fila(){
    this.array = new int[10];
    this.maxI = 10;
    this.index = 0;
    this.size = 0;
  }

}