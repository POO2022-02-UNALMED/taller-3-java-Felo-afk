package taller3.televisores;

public class Control {
	TV tv;
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public void setT(TV tv) {
		this.tv=tv;
	}
	public TV getTv() {
		return this.tv;
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
}
