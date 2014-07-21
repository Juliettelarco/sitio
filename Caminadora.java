// aumento de junio-2014
//se actualizo las variables, se les agrego el private
//se creo dos constructores, uno vacio y uno con parametros 
//se hace uso del this
//usamos los metodos setters y getters
//DUDAS: PODRIA EXPLICAR LO DEL THIS.


public class Caminadora {

	
	//Atributos de este tipo objeto
	
	
	private int nroVelocidades;  //asume valor inicial cero
	private int nivelesInclinacion;
	private	int totalHorasUsadas;
	private	int velocidadActual;
	private	int nivelInclinacionActual;
	
	//constructor vacio
	public Caminadora(){
	
	}

	public Caminadora(int nroVelocidades,int nivelesInclinacion,int totalHorasUsadas){
		this.setNroVelocidades(nroVelocidades);
		this.setNivelesInclinacion(nivelesInclinacion);
		this.setTotalHorasUsadas(totalHorasUsadas);
	}

	//SETTERS
	
	public void  setNroVelocidades(int nroVelocidades){
		this.nroVelocidades = nroVelocidades;
	}
	
	public void setNivelesInclinacion(int nivelesInclinacion){
		this.nivelesInclinacion= nivelesInclinacion;
	}
	
	public void setTotalHorasUsadas(int totalHorasUsadas){
		this.totalHorasUsadas= totalHorasUsadas;
	}
	
	public void setVelocidadActual(){
		this.velocidadActual= velocidadActual; 
	}
	
	public void setNivelInclinacionActual(){
		this.nivelInclinacionActual = nivelInclinacionActual;
	}

	//GETTERS
	
	public int getNroVelocidades(){
		return nroVelocidades;
	}

	public int getNivelesInclinacion(){
		return nivelesInclinacion;
	}
	
	public int getTotalHorasUsadas(){
		return totalHorasUsadas;
	}
	
	public int getVelocidadActual(){
		return velocidadActual;
	}
	
	public int getNivelInclinacion(){
		return nivelesInclinacion;
	}
	
	//operaciones para este tipo de objeto (METODOS)
	
	public void aumentarVelocidadActual (){
		if (velocidadActual < this.nroVelocidades) {
			velocidadActual++;
		} else {
			System.out.println("Ya llego a su maximo nivel de inclinacion");
		}	
	}
	
	
	public void disminuirVelocidadActual (){
		if (velocidadActual > 0) {
			velocidadActual--;	
		} else {
			System.out.println("Ya llego a su minimo nivel de velocidad");
		}
				
	}
	
	
	public void aumentarNivelInclinacionActual (){
		if (nivelInclinacionActual < this.nivelesInclinacion) {
			nivelInclinacionActual++;	
		} else {
			System.out.println("Ya llego a su maximo nivel de inclinacion");
		}
				
	}
	
	
	public void disminuirNivelInclinacionActual (){
		if (nivelInclinacionActual > nivelesInclinacion) {
			nivelInclinacionActual--;	
		} else {
			System.out.println("Ya llegoa su minimo nivel de inclinacion");
		}	
	}
	
	public void usar (){
		totalHorasUsadas++;
		
	}
	
}
