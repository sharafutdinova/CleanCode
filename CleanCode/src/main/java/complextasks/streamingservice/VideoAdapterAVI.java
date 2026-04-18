package complextasks.streamingservice;

public class VideoAdapterAVI implements VideoAdapter {
    @Override
    public Video convertToMP4(Video video) {
        System.out.println("Converting from AVI to MP4");
        return new Video(video.getName(), VideoType.MP4);
    }
}
