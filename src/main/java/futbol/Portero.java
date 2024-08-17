package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		 this.golesRecibidos = golesRecibidos;
	     this.dorsal = dorsal;
	}
	
	
	public int compareTo(Portero f) {
        return Math.abs(this.golesRecibidos - f.golesRecibidos);
    }
	
	
	
	public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " anos, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
    }
	
	
	
	
	public boolean jugarConLasManos() {
		return true;
	}
}
