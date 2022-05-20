

class Main {
  public static void main(String[] args) {

    try{

    Pilha a = new Pilha();

    for(int i =0; i<=4; i++){
      a.pushRubro(i);
      System.out.println("Topo Rubro:" + a.topRubro());
      a.imprimir();

    }

    for(int i =0; i<=4; i++){
      a.pushNegro(i*4);
      System.out.println("Topo Negro:" + a.topNegro());
      a.imprimir();

    }

    for(int i =0; i<=4; i++){
      a.popNegro();
      System.out.println("Topo Negro:" + a.topNegro());
    }

    for(int i =0; i<=4; i++){
      a.popRubro();
      System.out.println("Topo Rubro:" + a.topRubro());
    }

    
    } catch (PilhaVaziaException y){
      System.out.println(y);
    }  
  }
}
