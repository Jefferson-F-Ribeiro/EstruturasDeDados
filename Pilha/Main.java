

class Main {
  public static void main(String[] args) {

    try{

    Pilha a = new Pilha();

    for(int i =0; i<=3; i++){
      a.pushRubro(i);
      System.out.println("Topo Rubro:" + a.topRubro());
    }

    for(int i =0; i<=3; i++){
      a.pushNegro(i*4);
      System.out.println("Topo Negro:" + a.topNegro());
    }
      
    a.imprimir();

    a.popRubro();
    a.popNegro();

    a.pushRubro(77);
    a.pushNegro(99);

    a.pushRubro(101);

    a.imprimir();

    a.pushRubro(25);

   

    a.pushRubro(667);

    

   
    

    a.popRubro();
    a.popRubro();
      
    System.out.println("Topo Rubro:" + a.topRubro());
    System.out.println("Topo Negro:" + a.topNegro());
    System.out.println(a.size());

    a.imprimir();
    

    
    } catch (Exception y){
      System.out.println(y);
    }  
  }
}