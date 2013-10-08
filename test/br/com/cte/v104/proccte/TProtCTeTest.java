/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cte.v104.proccte;

import br.com.cte.v104.proccte.TProtCTe.InfProt;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Murilo
 */
public class TProtCTeTest {
    private static JAXBContext context;
    private static Unmarshaller unmarshaller;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        try {
            context = JAXBContext.newInstance("br.com.cte.v104.proccte");
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null, ex);
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInfProt method, of class TProtCTe.
     */
    @Test
    public void test() throws IOException, UnsupportedEncodingException, JAXBException {
        File f = new File("doc");
        File[] fs = f.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return (name.toLowerCase().endsWith(".xml"));
            }
        });
        
        for (File file : fs) {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String xml = "";
            String buf = null;
            while ((buf = br.readLine()) != null) {
                xml += buf;
            }
            br.close();
            fis.close();
            
            processa(xml);
        }
    }
    
    private void processa(String xml) throws UnsupportedEncodingException, JAXBException, IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes("UTF-8"));
        CteProc cteProc = unmarshaller.unmarshal(new StreamSource(bais), CteProc.class).getValue();
        bais.close();
        
        if (cteProc == null) {
            fail("Nao conseguiu fazer o parse");
        } else {
            TCTe cte = cteProc.getCTe();
            String id = cte.getInfCte().getId().toLowerCase().replace("cte", "");
            System.out.println("ID : " + id + " length():" + id.length());
            String cnpj = cte.getInfCte().getDest().getCNPJ();
            assertEquals("05437537000137", cnpj);
        }
    }
}
