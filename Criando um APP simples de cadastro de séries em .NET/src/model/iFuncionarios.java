package model;

/**
 *
 * @author Alex Rogério
 */
public interface iFuncionarios {
    
    public abstract void mudarNumeroTelefone(String numero);
    public abstract boolean tirarFerias();
    public abstract void baterPonto();
    public abstract void trabalhar();

}
