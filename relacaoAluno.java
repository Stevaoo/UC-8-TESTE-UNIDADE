public class relacaoAluno {
    // Metodo que calcula o tipo de descanso que o aluno precisa, com base no cansaco dele

    public static String calcularDescanso(aluno aluno) {
        //Verifica o cansaço do aluno e decidindo

        if (aluno.getCansaco() <= 20) {
            return " Descanso diário suficiente: O aluno está tranquilo, sem Stress!";
        } else if (aluno.getCansaco() <= 50) {
            return " Descanso nos fins de semana é suficiente: O aluno está moderalmente cansado.";
        } else if (aluno.getCansaco() <= 80) {
            return " Ferias são necessarias!!! O aluno está exausto.";
        } else {
            return "Alerta! O aluno está completamente exausto!!!";
        }
    }
}
