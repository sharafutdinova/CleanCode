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
        VideoService videoService = new VideoService();
        videoService.addVideoAdapter(VideoType.AVI, new VideoAdapterAVI());
        videoService.addVideoAdapter(VideoType.MOV, new VideoAdapterMOV());

        Video videoAVI = new Video("Funny video", VideoType.AVI);
        videoAVI = videoService.uploadVideo(videoAVI);
        videoService.streamVideo(videoAVI.getId());

        Video video = new Video("MP4 video", VideoType.MP4);
        video = videoService.uploadVideo(video);
        videoService.streamVideo(video.getId());

    }
}
