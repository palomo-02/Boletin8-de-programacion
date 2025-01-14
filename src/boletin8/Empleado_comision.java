package boletin8;

class Empleado_comision extends Empleado_base {
	private double porcentaje;
	private double ventas;

	public Empleado_comision(String nombre, double salarioBase) {
		super(nombre, salarioBase);
		this.porcentaje=porcentaje;
		this.ventas=ventas;


	
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalarioBase()+(porcentaje/100)*ventas;
	}

	public void setPorcentaje(double porcentaje) {
		
		if(porcentaje<0) {
			System.out.println("el porcentaje no puede ser negativo");
		}
		this.porcentaje = porcentaje;
	}

	public void setVentas(double ventas) {
		if(ventas<0) {
			System.out.println("las ventas no puede ser negativo");
		}
		this.ventas = ventas;
	}
	
	
	
	
	
	
	

}
