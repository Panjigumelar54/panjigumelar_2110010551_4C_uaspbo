package pbo1;

import java.util.Scanner;

public class MerekBeraksi {
     public static void main(String[] args) {
//        objek

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        MerekDetail[] mrk = new MerekDetail[2];
        for(int i=0; i<mrk.length; i++) {
                System.out.print("Masukkan Jenis Baju  "+(i+1)+" : ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Kode  "+(i+1)+" : ");
                String kode = scanner.nextLine();

        //        objek
                mrk[i] = new MerekDetail (jenis, kode);
    }

        for(MerekDetail data: mrk) {
            System.out.println("==================");
            System.out.println("Data Mahasiswa: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format NPM: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}
