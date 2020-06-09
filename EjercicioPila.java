public class EjercicioPila {
     ListaEnlazada lista; 
    private int tamanio;
    //Constructores
    public EjercicioPila(int N) {
        lista = new ListaEnlazada();
    }
    public int cantidad() {
        return this.tamanio-1;
    }
    public void apilar(int n){
        lista.agregarAlFin(new Nodo(null,n));
        tamanio++;
    }
    public Nodo sacar(){
     
       Nodo aux;
       aux=lista.eliminarAlFin();
        tamanio--;
        return  aux;
    }

}    
	    
