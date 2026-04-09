package patterns.adapter.documents;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public void process() {
        System.out.println("Обработка DOC файла");
    }
}
