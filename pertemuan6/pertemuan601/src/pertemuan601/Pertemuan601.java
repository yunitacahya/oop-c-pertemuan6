
package pertemuan601;

/**
 *
 * @author Yunita Cahya
 * TGL 26-04-2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "Hijau";
        apel.SetRasa("Manis");
        
        System.out.printf("Warna Apel diset %s \n", apel.warna);
        System.out.printf("Rasa Apel diset %s \n", apel.getRasa());

        
        buah anggur = new buah();
        anggur.warna = "Hitam";
        anggur.SetRasa("Asem");
        
        System.out.printf("Warna Anggur diset %s \n", anggur.warna);
        System.out.printf("Rasa Anggur diset %s ", anggur.getRasa());
    }
    
}

class buah{
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String getRasa(){
        return this.rasa;
    }
}