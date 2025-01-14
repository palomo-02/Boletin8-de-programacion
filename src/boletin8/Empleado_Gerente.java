package boletin8;

class Empleado_Gerente extends Empleado_base {

	private double bono;

	public Empleado_Gerente(String nombre, double salarioBase) {
		super(nombre, salarioBase);
		this.bono = bono;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase()+bono;
	}

	
	
	
	
	
}