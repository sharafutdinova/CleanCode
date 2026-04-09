package lessons.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        // в момент создания прокси изображение не загружается
        ImageProxy imageProxy = new ImageProxy("path/to/high/res/image");

        /*
        много времени
         */

        // отображения изображение
        imageProxy.show();

        /*
         много времени
         */

        // отображение не загрузится повторно
        imageProxy.show();
    }
}
