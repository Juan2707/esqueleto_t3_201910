package model.data_structures;

public class Objeto <T>{
	public Objeto<T> siguiente;
	public T perroCaliente;
	public Objeto(T helpMe){
		siguiente=null;
		perroCaliente=helpMe;
	}
	public void cambiarSiguiente(Objeto o){
		siguiente=o;
	}
	public T darT(){
		return perroCaliente;
	}
	public void a�adirAlFinal(T t){
		if(siguiente==null){
			siguiente = new Objeto<T>(t);
		}
		else{
			siguiente.a�adirAlFinal(t);
		}
	}
	public Objeto darSiguiente(){
		return siguiente;
	}
	
}
