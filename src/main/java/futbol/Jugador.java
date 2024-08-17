package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	
	public Jugador() {
		super("Maradona", 30, "delantero");
		this.dorsal = 7;
		this.golesMarcados = 289;
	}
	
	
	public int compareto(Jugador f) {
		return Math.abs(this.getEdad() - f.getEdad());
	}
	
	
	public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
	}
	
	
	
	public boolean jugarConLasManos() {
		return false;
	}
}
