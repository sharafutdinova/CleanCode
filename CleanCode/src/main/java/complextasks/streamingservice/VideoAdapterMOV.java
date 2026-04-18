package complextasks.streamingservice;

public class VideoAdapterMOV implements VideoAdapter {
    @Override
    public Video convertToMP4(Video video) {
        System.out.println("Converting from MOV to MP4");
        return new Video(video.getName(), VideoType.MP4);
    }
}
