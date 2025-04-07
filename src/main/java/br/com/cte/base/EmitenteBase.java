package br.com.cte.base;

/**
 * 13/03/2017 17:08:28
 * @author murilo
 */
public interface EmitenteBase<T extends EnderecoBase> {
    
    public String getCNPJ();
    public String getIE();
    public String getXNome();
    public String getXFant();
    public T getEnderEmit();

}
