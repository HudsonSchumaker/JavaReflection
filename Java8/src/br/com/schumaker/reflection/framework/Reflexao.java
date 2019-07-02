package br.com.schumaker.reflection.framework;

/**
 *
 * @author hudson schumaker
 */
public class Reflexao {

    public ManipuladorClasse refleteClasse(String fqn) {
        Class<?> classe = getClasse(fqn);
        return new ManipuladorClasse(classe);
    }

    public Class<?> getClasse(String fqn) {
        try {
            Class<?> classe = Class.forName(fqn);
            return classe;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
