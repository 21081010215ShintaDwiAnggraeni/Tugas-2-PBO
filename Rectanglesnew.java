package rectanglesnew;
import java.util.Scanner;

public class Rectanglesnew {
    public int panjang, lebar ;
    
        public int Area(){
            int Area;
            Area = this.panjang * this.lebar;
            return Area;
        }
        
        public int Perimeter(){
            int Perimeter;
            Perimeter = 2*(this.panjang + this.lebar);
            return Perimeter;
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectanglesnew persegi_panjang = new Rectanglesnew();
        System.out.print("Masukkan panjang: ");
        persegi_panjang.panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        persegi_panjang.lebar = input.nextInt();
        System.out.println("Luas Persegi panjang adalah "+persegi_panjang.Area());
        System.out.println("Keliling Persegi panjang adalah "+persegi_panjang.Perimeter());
    }
    
}
