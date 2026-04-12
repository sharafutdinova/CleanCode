package complextasks.streamingservice;

public class VideoAdapterAVI implements VideoAdapter {
    @Override
    public Video convertToMP4(String path) {
        System.out.println("Converting from AVI to MP4");
        String[] paths = path.split("/");
        return new Video(paths[paths.length - 1], "MP4");
    }
}
