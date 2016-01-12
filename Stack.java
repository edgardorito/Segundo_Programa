public class Stack<T>{

  private T pila[];
  private int tope;

  public Stack(int capacidad){
    pila = (T[]) new Object[capacidad];
    tope = -1;
  }

  public boolean isEmpty(){
    return tope == -1;
  }

  public void push(T i){
   
    if (tope+1 < pila.length){
      pila[++tope] = i;
      System.out.println("El dato se inserto correctamente");
    }else
      System.out.println("La pila esta llena, elimine algunos elementos");
  }

  public T pop(){
    if(isEmpty())
      return null;
    return pila[tope--];
  }


}
