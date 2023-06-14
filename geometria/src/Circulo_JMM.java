
public class Circulo_JMM extends FiguraGeometrica_JMM {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JMM(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if(r<0) {
			r = Math.abs(r);
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
