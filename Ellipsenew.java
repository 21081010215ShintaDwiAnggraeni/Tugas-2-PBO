package ellipsenew;
import java.util.Scanner;

public class Ellipsenew {
    public int sumbu_mayor, sumbu_minor ;
        
        public double Area(){
            double Area;
            Area = 0.5 * Math.PI * (this.sumbu_mayor + this.sumbu_minor);
            return Area;
        }
        
        public double Perimeter(){
            double Perimeter;
            Perimeter = 0.5 * Math.PI * (this.sumbu_mayor * this.sumbu_minor);
            return Perimeter;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ellipsenew elips = new Ellipsenew();
        System.out.print("Masukkan Sumbu Mayor: ");
        elips.sumbu_mayor = input.nextInt();
        System.out.print("Masukkan Sumbu Minor: ");
        elips.sumbu_minor = input.nextInt();
        System.out.println("Luas Ellipse adalah "+elips.Area());
        System.out.println("Keliling Ellipse adalah "+elips.Perimeter());
    }
    
}
