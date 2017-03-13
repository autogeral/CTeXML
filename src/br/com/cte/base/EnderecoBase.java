package br.com.cte.base;


/**
 * 13/03/2017 17:13:38
 * @author murilo
 * @param <T>
 */
public interface EnderecoBase <T extends UFBase> {

    public String getCEP();
    public String getCMun();
    public String getFone();
    public String getNro();
    public String getXBairro();
    public String getXCpl();
    public String getXLgr();
    public String getXMun();
    public T getUF();

}
