package Pdf1_Ej3_Amigos;

import java.util.Objects;

public class Pandilla {

	private int capacidad = 0;
	private Amigo[] lista ;

	public Pandilla() {
		this.lista = new Amigo[5];
	}

	public void addAmigo(Amigo a) throws NoMeGustaTuNombreException, PandillaCompletaException {
		if (this.capacidad < this.lista.length) {
			char last = a.getNombre().charAt(a.getNombre().length() - 1);
			if (last == 'S' || last == 's') {
				throw new NoMeGustaTuNombreException(
						"Lo siento mi bro pero tu nombre tiene una S al final y no comulgamos en esa iglesia");
			} else {
				for (int i = 0; i < lista.length; i++) {
					if (lista[i] == null) {
						lista[i] = a;
						this.capacidad++;
						System.out.println("Amigo añadido a la pandilla");
						break;
					}
				}
			}
		} else {
			throw new PandillaCompletaException("Ya sois demasiados bro, los amigos se cuentan con los dedos de una mano y te faltan manos a este paso");
		}
	}
	
	public void mostrarLista() {
		for (Amigo amigo : lista) {
			System.out.println(amigo);
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Amigo[] getLista() {
		return lista;
	}

	public void setLista(Amigo[] lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidad, lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pandilla other = (Pandilla) obj;
		return capacidad == other.capacidad && Objects.equals(lista, other.lista);
	}

	@Override
	public String toString() {
		return "Pandilla [capacidad=" + capacidad + ", lista=" + lista + "]";
	}

}
