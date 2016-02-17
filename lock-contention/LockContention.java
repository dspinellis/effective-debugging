import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.util.concurrent.*;

public class LockContention {
    static int NTHREAD = 7;
    static Integer counter = new Integer(0);
    static int numberOfDocuments = 100000;

    static public void main(String args[]) {
        int nThreads = Integer.parseInt(args[0]);
        int nTasks = Integer.parseInt(args[1]);
        Runnable task = () -> {
            File schemaFile = new File("xhtml1-transitional.xsd");
            Source xmlFile = new StreamSource(new File("w3c.xml"));
            SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            try {
                Schema schema = schemaFactory.newSchema(schemaFile);
                Validator validator = schema.newValidator();
                validator.validate(xmlFile);
            } catch (Exception e) {
              System.out.println(xmlFile.getSystemId() + " failed");
              System.out.println("Reason: " + e.getLocalizedMessage());
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nTasks; i++)
            executor.submit(task);
        try {
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Interrupted await: " + e);
        }
    }
}
