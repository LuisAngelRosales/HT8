public class System{
    private PriorityQueue<Paciente> datos;
	private Paciente pacienteActual;
	
	public System(String ch) {
		Chooser<Paciente> choose = new Chooser<Paciente>();
		datos = choose.getPrioridad(ch);
	}
	
	/**
	 * AGREGA PACIENTES
	 */
	public void addPaciente() {
		Object[] data = Reader.read(Reader.getRuta());
		for (Object a : data) {
			this.datos.add(((Paciente)a));
		}
	}
	
	/**
	 * TRANSFIERE PACIENTES
	 */
	public void transferirPaciente() {
		pacienteActual = datos.remove();
	}
	
	/**
	 * PACIENTE ACTUAL
	 * @return
	 */
	public Paciente getPaciente() {
		return pacienteActual;
	}
	
	/**
	 * ATIENDE PACIENTE
	 * @return
	 */
	public boolean atenderPaciente() {
		pacienteActual = null;
		return true;
	}
	
	/**
	 * TODOS LOS PACIENTES
	 * @return
	 */
	public PriorityQueue<Paciente> getMorePaciente(){
		return datos.clone();
	}
	
	/**
	 * TAMANIO
	 * @return
	 */
	public int size() {
		return datos.size();
	}
}