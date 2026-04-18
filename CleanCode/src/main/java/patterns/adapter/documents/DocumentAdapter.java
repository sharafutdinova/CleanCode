package patterns.adapter.documents;

public class DocumentAdapter {
    private DocumentProcessor documentProcessor;

    public DocumentAdapter(DocumentProcessor documentProcessor) {
        this.documentProcessor = documentProcessor;
    }

    public void processDocument() {
        if (documentProcessor.getClass() == PDFProcessor.class) {
            System.out.println("Конвертация PDF в Doc");
        }
        documentProcessor.process();
    }
}
