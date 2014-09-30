public class Triangle extends GeometricObject {
	
	private double Hypotenuse;
	private double Adjacent;
	private double Opposite;
	
	public Triangle(){
		Hypotenuse= 1.0;
		Adjacent= 1.0;
		Opposite= 1.0;
	}
	public Triangle(double Hypotenuse, double Adjacent, double Opposite){
		this.Hypotenuse = Hypotenuse;
		this.Adjacent = Adjacent;
		this.Opposite = Opposite;}
	
	public double getside_1(){
		return Hypotenuse;
	}
	
	public double getside_2(){
		return Adjacent;
	}
	
	public double getside_3(){
		return Opposite;
	}
	
	public double getPerimeter(){
		double perim;
		perim=(Hypotenuse + Adjacent + Opposite);
		return(perim);
		
	}
	
	public double getArea(){
		double i;
		
		i = getPerimeter();
		double Area;
		
		Area=Math.sqrt((i*(i-Hypotenuse)*(i-Adjacent)*(i-Opposite)));
		
		return(Area);}
	
	public String toString(){
		return("The triangles dimensions are:" + this.Hypotenuse + "," +this.Adjacent +"and" +this.Opposite +". This triangle's perimeter comes to: " +getPerimeter() +". This triangles area is: " +getArea()  );
	}
}