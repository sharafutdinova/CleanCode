package patterns.adapter.documents;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public void process() {
        System.out.println("Обработка PDF файла");
    }
}
