package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	
	public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
	}
	
	
	 public Futbolista() {
	        this("Maradona", 30, "delantero");
	 }
	 
	 
	 public String getNombre() {
		 return nombre;
	 }
	 
	 public int getEdad() {
		 return edad;
	 }
	 
	 public String getPosicion() {
		 return posicion;
	 }
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public void setEdad(int edad) {
		 this.edad = edad;
	 }
	 
	 @Override
	 public int compareto(Futbolista f) {
		 return Integer.compare(this.edad, f.edad);
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		    if (this == obj) return true; 
		    if (obj == null || getClass() != obj.getClass()) return false;
		    
		    Futbolista otro = (Futbolista) obj;

		    return this.edad == otro.edad &&
		           this.nombre.equals(otro.nombre) &&
		           this.posicion.equals(otro.posicion);
		}
	 
	 public String toString() {
		 return "El futbolista " + nombre + " tiene " + edad + " anos, y juega de " + posicion + ".";
	 }
	 
	 
	 
	 public abstract boolean jugarConLasManos();
	 
}
