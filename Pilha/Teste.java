class Main {
  public static void main(String[] args) {

    Pilha a = new Pilha();

    for(int i =0; i<=10; i++){
      a.push(i);
    }

    a.push(12);

    

    try{
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    a.pop();
    System.out.println(a.top());
    System.out.println(a.size());
    } catch (PilhaVaziaException y){
      System.out.println(y);
    }

    
      
  }
}