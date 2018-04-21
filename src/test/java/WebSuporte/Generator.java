package WebSuporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String dataHoraDoParaArquivoTeste(){
        Timestamp ts =  new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd_MM_yyyy-HH-mm-ss").format(ts);
    }
}
