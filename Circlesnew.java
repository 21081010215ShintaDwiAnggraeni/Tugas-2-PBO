package circlesnew;
import java.util.Scanner;

public class Circlesnew {
    public double r;
    
        public double Area(){
            double Area;
            Area = Math.PI * this.r * this.r;
            return Area;
        }
        
        public double Perimeter(){
            double Perimeter;
            Perimeter = 2*Math.PI*this.r;
            return Perimeter;
        }
    
    public static void main(String[] args) {
        Circlesnew lingkaran = new Circlesnew();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan r: ");
        lingkaran.r = input.nextDouble();
        System.out.println("Luas Lingkaran adalah "+lingkaran.Area());
        System.out.println("Keliling Lingkaran adalah "+lingkaran.Perimeter());
    }
    
}
