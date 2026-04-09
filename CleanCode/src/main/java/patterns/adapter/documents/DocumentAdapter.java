package patterns.adapter.documents;

public class DocumentAdapter {
    public static DOCProcessor convertPDFToDoc(PDFProcessor pdfProcessor) {
        System.out.println("Конвертация PDF в Doc");
        return new DOCProcessor();
    }
}
