public class Paciente implements Comparable<Paciente>{
    private String nombre;
    private String sintomas;
    private String prioridad;
    
    public Paciente() {
    	
    }
    
    public Paciente(String name, String symptom, String priority) {
    	this.nombre = name;
    	this.sintomas = symptom;
    	this.prioridad = priority;
    }

    public void setNombre(String name){
        this.nombre = name;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setSintomas(String symptom){
        this.sintomas = symptom;
    }

    public String getSintomas(){
        return this.sintomas;
    }

    public void setPrioridad(String priority){
        this.prioridad = priority;
    }

    public String getPrioridad(){
        return this.prioridad;
    }
    
	@Override
	public int compareTo(Paciente o) {
		return this.prioridad.compareTo(o.prioridad);
    }
    
    @Override
	public String toString() {
		return "Prioridad: " + prioridad + "\nNombre: " + nombre + "\nSintoma: " + sintomas;
	}
}