package Pdf_1;

import java.util.Objects;

public class Pelicula {

	
	private String codigo;
	private String titulo;
	
	public Pelicula(String codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(titulo, other.titulo);
	}
}
