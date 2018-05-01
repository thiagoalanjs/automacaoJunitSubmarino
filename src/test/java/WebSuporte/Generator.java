package WebSuporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String dataHoraDoParaArquivoTeste(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd-MM-YYY HH:mm:ss").format(ts);
    }

    public static String dataHoradoArquivoPPT(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd-MM-YYY HH:mm:ss").format(ts);
    }
}
