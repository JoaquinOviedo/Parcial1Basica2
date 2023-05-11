package a.a;

import java.util.ArrayList;
import java.util.Objects;

public class Stant {
	
	String editorial;
	Integer metroscuadradosocupados;
	Integer ubicacion;
	
	public Stant(String editorial, Integer metroscuadradosocupados, Integer ubicacion) {

		this.editorial=editorial;
		this.metroscuadradosocupados=metroscuadradosocupados;
		this.ubicacion=ubicacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ubicacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stant other = (Stant) obj;
		return Objects.equals(ubicacion, other.ubicacion);
	}
	
}