package Empresa;

public class Empresa {
	private Directivo directivo;
	private Desarrollador desarrollador1;
	private Desarrollador desarrollador2;
	private Desarrollador desarrollador3;
	private Tester tester1;
	private Tester tester2;
	
	public Empresa (Directivo directivo, Desarrollador desarrollador1) {
		this.directivo = directivo;
		this.desarrollador1 = desarrollador1;
	}

	public Directivo getDirectivo() {
		return directivo;
	}
	public void setDirectivo(Directivo directivo) {
		this.directivo = directivo;
	}

	public Desarrollador getDesarrollador1() {
		return desarrollador1;
	}
	public void setDesarrollador1(Desarrollador desarrollador1) {
		this.desarrollador1 = desarrollador1;
	}

	public Desarrollador getDesarrollador2() {
		return desarrollador2;
	}
	public void setDesarrollador2(Desarrollador desarrollador2) {
		this.desarrollador2 = desarrollador2;
	}

	public Desarrollador getDesarrollador3() {
		return desarrollador3;
	}
	public void setDesarrollador3(Desarrollador desarrollador3) {
		this.desarrollador3 = desarrollador3;
	}

	public Tester getTester1() {
		return tester1;
	}
	public void setTester1(Tester tester1) {
		this.tester1 = tester1;
	}

	public Tester getTester2() {
		return tester2;
	}
	public void setTester2(Tester tester2) {
		this.tester2 = tester2;
	}
	
	public String getSueldo() {
		String sueldos = "Los sueldos en la empresa son: \nDirectivo: " + this.directivo.getSueldo() + " mas un bonus de " + this.directivo.getBonus()
		+ "\nDesarrollador 1: " + this.desarrollador1.getSueldo();
		if (desarrollador2 != null) {
			sueldos += "\nDesarrollador 2: " + this.desarrollador2.getSueldo();
		}
		if (desarrollador3 != null) {
			sueldos += "\nDesarrollador 3: " + this.desarrollador3.getSueldo();
		}
		if (tester1 != null) {
			sueldos += "\nTester 1: " + this.tester1.getSueldo();
		}
		if (tester2 != null) {
			sueldos += "\nTester 2: " + this.tester2.getSueldo();
		}
		return sueldos;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String empresa = "Directivo: " + directivo + "\nPrimer desarrollador: " + desarrollador1;
		if (desarrollador2 != null) {
			empresa += "\nSegundo desarrollador: " + desarrollador2;
		}
		if (desarrollador3 != null) {
			empresa += "\nTercer desarrollador: " + desarrollador3;
		}
		if (tester1 != null) {
			empresa += "\nPrimer tester: " + tester1;
		}
		if (tester2 != null) {
			empresa += "\nSegundo tester: " + tester2;
		}
		return empresa;
	}
}
