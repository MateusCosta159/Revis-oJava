package Revisao;

public class Main {
    public static void main(String[] args) {
        LivroFisico l1 ;
        l1 = new LivroFisico("L1", "Java como programar", "DEITEL & DEITEL", 8, 2000);
        
        Revista R1 ;
        R1 = new Revista("L1", "Java como programar", "DEITEL & DEITEL", 8, 2000);
        
        l1.getAutores();
        
        Emprestavel[] biblioteca = new Emprestavel[5];
        
        biblioteca[0] = l1;
        biblioteca[1] = R1;
    }
            
}
