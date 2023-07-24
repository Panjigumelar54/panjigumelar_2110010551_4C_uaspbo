package pbo1;

public class Merek {
  //    atribut dan enkapsulasi
    private String jenis;
    private String kode;
    
//    construktor
    public Merek(String jenis, String kode) {
        this.jenis = jenis;
        this.kode = kode;
    }
    
//    mutator (seter)
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

//    accesor (getter)
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
    
//    polymorphism (overloading)
    public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }  
}
