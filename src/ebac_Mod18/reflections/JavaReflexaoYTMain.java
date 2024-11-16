package ebac_Mod18.reflections;

public class JavaReflexaoYTMain {
    public static void main(String[] args) {
        AlunoReflexaoYT A = new AlunoReflexaoYT();
        A.setNome("Pedro");
        A.setNumMatricula(33446);
        A.AddNotas(10);
        A.AddNotas(7);
        A.imprimir();

        ReflexaoYT.refletirObjeto(A,AlunoReflexaoYT.class);
    }
}
