package Revisao;

public class Revista extends MaterialBibliografico {

    
    public Revista(String localizacao, String titulo, String autores, int edicao, int ano, int quantidade) {
        super(localizacao, titulo, autores, edicao, ano, 5);
    }

    @Override
    public boolean devolver() {
    if(getQuantidade() < 5){
        setQuantidade(getQuantidade() + 1);
        return true;
    }
    return false;
   }
    
    
    
    
    
    
    
}
