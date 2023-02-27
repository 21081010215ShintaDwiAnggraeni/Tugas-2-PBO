package squarenew;
import java.util.Scanner;

public class Squarenew {
    public int sisi;
    
        public int Area(){
            int Area;
            Area = this.sisi * this.sisi; //atribut milik kelas (this)
            return Area;
        }
        
        public int Perimeter(){
            int Perimeter;
            Perimeter = 4 * this.sisi;
            return Perimeter;
        }
    
    public static void main(String[] args) {
        Squarenew persegi = new Squarenew();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        persegi.sisi = input.nextInt();
        System.out.println("Luas persegi adalah "+persegi.Area());
        System.out.println("Keliling persegi adalah "+persegi.Perimeter());
   
    }
    
}
