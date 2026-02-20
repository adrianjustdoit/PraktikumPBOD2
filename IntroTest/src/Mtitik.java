

/* NIM/Nama 	: 24060123130093/Arib Taufiqurrohman*/
/* Tanggal 		: 18 Februari 2025*/



public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(-5, 6);
        Titik T3 = new Titik(0, -7);
        
        System.out.println("=== Informasi Titik ===");
        T1.printTitik();
        T2.printTitik();
        T3.printTitik();
        
        System.out.println("\n=== Uji Refleksi ===");
        T1.getRefleksiX().printTitik();
        T2.getRefleksiY().printTitik();
        
        System.out.println("\n=== Uji Geser ===");
        T1.geser(2, -3);
        T1.printTitik();
        
        System.out.println("\n=== Uji Kuadran ===");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        
        System.out.println("\n=== Uji Jarak ===");
        System.out.println("Jarak dari pusat ke T1: " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        
        System.out.println("\n=== Jumlah Objek Titik ===");
        System.out.println("Jumlah objek titik: " + Titik.getCounterTitik());
    }
}