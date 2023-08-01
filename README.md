# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek, dan memberikan output berupa informasi detail dari getjenis,getkode,getproduk,getukuran

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Merek`, `MerekDetail`, dan `MerekBeraksi` adalah contoh dari class.

```bash
public class Merek {
    ...
}

public class MerekDetail extends Merek {
    ...
}

public class MerekBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MerekDetail(jenis, kode);` adalah contoh pembuatan object.

```bash
mhs[i] = new MerekDetail(jenis, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `jenis` dan `kode` adalah contoh atribut.

```bash
String jenis;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Merek` dan `MerekDetail`.

```bash
public Merek(String jenis, String kode) {
    this.jenis = jenis;
    this.kode = kode;
}

public MerekDetail(String jenis, String kode) {
    super(jenis, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setjenis` dan `setkode` adalah contoh method mutator.

```bash
 public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getjenis`, `getkode`, `getProduk`, dan `getukuran` adalah contoh method accessor.

```bash
    public String getJenis() {
        return jenis;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo(){
       return "Nama: "+getJenis()+
              "\nKode: "+getKode(); 
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `jenis` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String jenis;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MerekDetail` mewarisi `Merek` dengan sintaks `extends`.

```bash
public class MerekDetail extends Merek {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Merek` merupakan overloading method `displayInfo` dan `displayInfo` di `MerekDetail` merupakan override dari method `displayInfo` di `Merek`.

```bash
 public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }  
}

@Override
  public String displayInfo(){
        return super.displayInfo() +
                "\nMerk Produk: "+getProduk()+
                "\nUkuran: "+getUkuran()+
                "\nTahun Produksi: "+getProduksi();
        
    }
}
    

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getproduk` dan seleksi `switch` dalam method `getukuran`.

```bash
 public String getProduk(){
        String kodeProduk = getKode().substring(0, 1);
//        seleksi switch
        switch (kodeProduk){
            case "G":
                return "Gucci";
            case "C":
                return "Chanel";
            case "P":
                return "Prada";
            default:
                return "Produk Lain";
        }
    }
    
    public String getUkuran(){
        String kodeProduk = getKode().substring(1, 2);
//        seleksi switch
        switch (kodeProduk){
            case "M":
                return "LD 47";
            case "L":
                return "LD 49";
            case "XL":
                return "LD 51";
            default:
                return "TIDAK ADA UKURAN LAIN";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<mrk.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
  Scanner scanner = new Scanner (System.in);
  System.out.print("Masukkan Jenis Baju  "+(i+1)+" : ");
  String jenis = scanner.nextLine();
  System.out.print("Masukkan Kode  "+(i+1)+" : ");
  String kode = scanner.nextLine();

        for(MerekDetail data: mrk) {
            System.out.println("==================");
            System.out.println("Data Mahasiswa: ");
            System.out.println(data.displayInfo());
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MerekDetail[] mahasiswas = new MerekDetail[2];` adalah contoh penggunaan array.

```bash
MerekDetail[] mrk = new MerekDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
  catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format NPM: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Panji Gumelar
NPM: 2110010551
