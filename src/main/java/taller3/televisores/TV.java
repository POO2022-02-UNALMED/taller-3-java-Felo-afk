package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV= 0;
	public TV(Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
		numTV++;
	}
	public void setCanal(int canal) {
		if(estado && canal>=0 && canal<= 120) {
			this.canal=canal;
		}
	}
	public int getCanal() {
		return this.canal;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setVolumen(int volumen) {
		if(estado && volumen>=0 && volumen<= 7) {
			this.volumen=volumen;
		}
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public Control getControl() {
		return this.control;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int Num) {
		numTV=Num;
	}
	public void turnOn() {
		this.estado= true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if(canal < 120 && estado) {
			canal++;
			}
		}
	public void canalDown() {
		if(canal > 1 && estado) {
			canal--;			}
		}
	public void volumenUp() {
		if(volumen < 7 && estado) {
			volumen++;
			}
		}
	
	public void volumenDown() {
		if(volumen > 0 && estado) {
				volumen--;
			}
		}
	
}
