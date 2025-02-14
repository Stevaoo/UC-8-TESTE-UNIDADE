import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class relacaoAlunoTest {
    private aluno aluno1, aluno2, aluno3, aluno4;

    // Este metodo é executado antes de casa teste. Ele prepara os objetos necessarios para o teste.
    @BeforeEach
    public void setup() {
        System.out.print("Criando novos alunos: ) ...");
        //Criando alunos com diferentes niveis de cansaço
        aluno1 = new aluno("Stevão", 80.0); // Stevão % 80 de Cansaço
        aluno2 = new aluno("Boladin", 10.0);// Boladin % 10 de Cansaço
        aluno3 = new aluno("Teteu", 40.0); // Teteu % 40 de Cansaço
        aluno4 = new aluno("Mattos", 90.0); // Mattos % 90 de Cansaço
    }

    //Teste simples para verificar o descanso do aluno1
    @Test
    public void testDescansoSuficiente() {
        System.out.print("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso((aluno1));
        assertEquals(" Ferias são necessarias!!! O aluno está exausto.", "Esperando descanso de férias é suficiente.", descanso);
    }

    //Teste simples para verificar o descanso do aluno2
    @Test
    public void testDescansoSuficiente() {
         System.out.print("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso((aluno2));
        assertEquals(" Ferias são necessarias!!! O aluno está exausto.", "Esperando descanso de férias é suficiente.", descanso);

    }

    //Teste simples para verificar o descanso do aluno3
    @Test
    public void testDescansoSuficiente() {
         System.out.print("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso((aluno3));
        assertEquals(" Ferias são necessarias!!! O aluno está exausto.", "Esperando descanso de férias é suficiente.", descanso);

    }

    //Teste simples para verificar o descanso do aluno4
    @Test
    public void testDescansoSuficiente() {
         System.out.print("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso((aluno4));
        assertEquals(" Ferias são necessarias!!! O aluno está exausto.", "Esperando descanso de férias é suficiente.", descanso);
    }
}
