package model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

abstract public class AbstractDao {
    public static boolean objetosRecuperados = false;

    final public void commit() {
        try {
			FileOutputStream arquivo = new FileOutputStream("C:/Temp/Objetos.bin");
			ObjectOutputStream oos = new ObjectOutputStream(arquivo);
			
			// DaoPessoa daoPessoa = new DaoPessoa();
			// oos.writeObject( daoPessoa.consultarTodos() );

			// DaoAluno daoAluno = new DaoAluno();
			// oos.writeObject( daoAluno.consultarTodos() );
			
			// DaoCurso daoCurso = new DaoCurso();
			// oos.writeObject( daoCurso.consultarTodos() );
			
			oos.close();
		}
        catch(Exception erro) {
            System.out.println("Erro ao serializar objetos: " + erro.getMessage());
        }
    }

    public static void recuperarObjetos() {
        if (objetosRecuperados == false) {
            try {
                FileInputStream arquivo = new FileInputStream("C:/Temp/Objetos.bin");
                // ObjectInputStream ois = new ObjectInputStream(arquivo);
                
                // DaoPessoa daoPessoa = new DaoPessoa();
                // daoPessoa.setListaPessoas( (ArrayList<Pessoa>) ois.readObject() );
                
                // DaoAluno daoAluno = new DaoAluno();
                // daoAluno.setListaAlunos( (ArrayList<Aluno>) ois.readObject() );
                
                // DaoCurso daoCurso = new DaoCurso();
                // daoCurso.setListaCursos( (ArrayList<Curso>) ois.readObject() );
                
                // ois.close();
                
                objetosRecuperados = true;
            }
            catch(Exception erro) {
                System.out.println("Erro ao deserializar objetos: " + erro.getMessage());
            }
        }
    }
}
