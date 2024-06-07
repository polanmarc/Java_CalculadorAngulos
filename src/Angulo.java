
public class Angulo {

	private int grados;
	private int minutos;
	private int segundos;
	
	public Angulo(int grados, int minutos, int segundos) {
		this.grados = grados;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public void corregirResultado() {
		
	    if (this.segundos >= 60) {
	    	this.minutos += this.segundos / 60;
	    	this.segundos %= 60;
	    } else if (this.segundos < 0) {
	    	this.minutos += this.segundos / 60 - 1;
	    	this.segundos = 60 + this.segundos % 60;
	    }

	    if (this.minutos >= 60) {
	    	this.grados += this.minutos / 60;
	    	this.minutos %= 60;
	    } else if (this.minutos < 0) {
	    	this.grados += this.minutos / 60 - 1;
	    	this.minutos = 60 + this.minutos % 60;
	    }

	    if (this.grados >= 360) {
	    	this.grados %= 360;
	    } else if (this.grados < 0) {
	    	this.grados = 360 + this.grados % 360;
	    }
	    
	    System.out.println(this.grados + ":" + this.minutos + ":" + this.segundos);

	}
	
	public static Angulo sumarAngulos(Angulo angulo1, Angulo angulo2) {
        int totalGrados = angulo1.getGrados() + angulo2.getGrados();
        int totalMinutos = angulo1.getMinutos() + angulo2.getMinutos();
        int totalSegundos = angulo1.getSegundos() + angulo2.getSegundos();
        Angulo resultado = new Angulo(totalGrados,totalMinutos,totalSegundos);
        resultado.corregirResultado();
//        resultado.comprobarCeros(resultado);
        return resultado;
    }
	
	 public static Angulo restarAngulos(Angulo angulo1, Angulo angulo2) {
        int totalGrados = angulo1.getGrados() - angulo2.getGrados();
        int totalMinutos = angulo1.getMinutos() - angulo2.getMinutos();
        int totalSegundos = angulo1.getSegundos() - angulo2.getSegundos();
        Angulo resultado = new Angulo(totalGrados,totalMinutos,totalSegundos);
        resultado.corregirResultado();
//        resultado.comprobarCeros(resultado);
        return resultado;
    }
	 
//	public Angulo comprobarCeros(Angulo angulo) {
//		String[] partes = angulo.toString().split(":");
//		int[] conversion = {0,0,0};
//		for (int i = 0 ; i < partes.length ; i++) {
//			if (partes[i].length() == 1) {
//				partes[i] = 0 + partes[i];
//			}
//			System.out.println(partes[i]);
//	    }
//		return new Angulo(conversion[0],conversion[1],conversion[2]);
//	}

	public int getGrados() {
		return grados;
	}

	public void setGrados(int angulos) {
		this.grados = angulos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return this.getGrados() + ":" + this.getMinutos() + ":" + this.getSegundos();
	}
	
}
