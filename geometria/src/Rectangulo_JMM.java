/**
 * 
 * @author Jaime Maciá Mora
 *@version 1.2
 */
public class Rectangulo_JMM extends FiguraGeometrica_JMM {
	private double l1;
	private double l2;
	
	public Rectangulo_JMM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * @return devuelve el área en un double
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * @return devuelve el perímetro en un double
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
