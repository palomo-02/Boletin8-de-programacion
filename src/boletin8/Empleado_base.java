package boletin8;

public class Empleado_base {

	private String nombre;
	private double salarioBase;

	public Empleado_base(String nombre, double salarioBase) {
		this.nombre = nombre;
		setSalarioBase(salarioBase);

	}

	public double calcularSalario() {

		return salarioBase;

	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase < 0) {
			System.out.println("El salario base no puede ser negativo.");
			return;
		}
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			System.out.println("el nombre esta vacio");

		}
		this.nombre = nombre;
	}

}
