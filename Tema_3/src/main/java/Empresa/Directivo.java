package Empresa;

public class Directivo extends Empleados {
	
	private double bonus;
	
	public Directivo(String nombre, String dni, int edad, int sueldo, double bonus) {
		super(nombre, dni, edad, sueldo);
		this.bonus = bonus;
		
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nBonus: " + (bonus *= sueldo);
	}
}
