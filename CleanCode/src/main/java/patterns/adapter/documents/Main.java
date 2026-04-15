package patterns.adapter.documents;

public class Main {
    //    Описание
//    У нас есть два типа файлов:
//    PDF-файл, который должен обрабатываться системой, но она работает только с DOC.
//    Необходимо создать адаптер, который позволит работать с файлами обоих форматов, конвертируя их при необходимости.
//    Задача — создать интерфейс, который будет принимать файлы с расширением PDF или DOC,
//    а также адаптер, который будет конвертировать один формат в другой.
    static void main(String[] args) {
        PDFProcessor pdfProcessor = new PDFProcessor();
        DocumentAdapter documentAdapter1 = new DocumentAdapter(pdfProcessor);
        documentAdapter1.processDocument();
        DOCProcessor docProcessor = new DOCProcessor();
        DocumentAdapter documentAdapter2 = new DocumentAdapter(docProcessor);
        documentAdapter2.processDocument();
    }
}
