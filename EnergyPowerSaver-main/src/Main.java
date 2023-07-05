import br.edu.ifpb.BlocoAcademico;
import br.edu.ifpb.Docente;

public class Main {

    public static void main(String[] args) {
        BlocoAcademico bloco = BlocoAcademico.getInstance();

        Docente docente1 = new Docente("docente1");
        Docente docente2 = new Docente("docente2");
        Docente docente3 = new Docente("docente3");

        docente1.addObserver(bloco);
        docente2.addObserver(bloco);
        docente3.addObserver(bloco);

        docente1.entrar();
        docente2.entrar();
        docente1.sair();
        docente2.sair();
        docente3.entrar();
        docente3.sair();
       // docente2.sair();

        // Para fins de teste, podemos adicionar equipamentos diretamente no bloco:
//        bloco.adicionarEquipamento(new ArCondicionado());
//        bloco.adicionarEquipamento(new Luz());
    }


}