package complextasks.streamingservice;

//Цель: Создать библиотеку, которая обеспечивает функции загрузки и просмотра видео в форматах: AVI, MOV, WMV.
// Система должна поддерживать загрузку видео в различных форматах и конвертировать их в единый внутренний формат MP4 для упрощения стриминга.
//
//Паттерны проектирования:
//Adapter: Для преобразования загружаемых видео форматов (AVI, MOV, WMV) в внутренний формат MP4.
//Facade: Для предоставления упрощенного интерфейса к сложным операциям обработки видео, включая загрузку, конвертацию и стриминг.
//
//Архитектура библиотеки:
//VideoService: Класс, использующий паттерн Facade, предоставляет методы uploadVideo и streamVideo, упрощая клиентский доступ к функционалу сервиса.
//VideoAdapter: Интерфейс и его реализации для каждого поддерживаемого формата видео, преобразующие видео в формат MP4.
public class Main {
    static void main(String[] args) {
        VideoService videoService = new VideoService(new VideoAdapterAVI(), new VideoAdapterMOV());
        String videoAVIPath = "/test/path/video1.avi";
        Video videoAVI = videoService.uploadVideo(videoAVIPath);
        videoService.streamVideo(videoAVI.getId());

        String videoMOVPath = "/test/path/video1.mov";
        Video video = videoService.uploadVideo(videoMOVPath);
        videoService.streamVideo(video.getId());

    }
}
