package pbo1;

public class MerekDetail extends Merek {
     //    overriding
    public MerekDetail(String jenis, String kode) {
        super(jenis, kode);
    }
    
    public int getProduksi() {
        return Integer.parseInt(getKode().substring(2, 4)) + 2000;
    }
    
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
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nMerk Produk: "+getProduk()+
                "\nUkuran: "+getUkuran()+
                "\nTahun Produksi: "+getProduksi();
        
    }
}
