package Value_Injection;

public class Bike 
{
String brand;
int cc;
Music music;
public Bike(String brand, int cc, Music music) {
	super();
	this.brand = brand;
	this.cc = cc;
	this.music = music;
}
@Override
public String toString() {
	return "Bike [brand=" + brand + ", cc=" + cc + ", music=" + music + "]";
}


}
