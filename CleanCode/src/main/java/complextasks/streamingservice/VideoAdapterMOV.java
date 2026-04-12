package complextasks.streamingservice;

public class VideoAdapterMOV implements VideoAdapter {
    @Override
    public Video convertToMP4(String path) {
        System.out.println("Converting from MOV to MP4");
        String[] paths = path.split("/");
        return new Video(paths[paths.length - 1], "MP4");
    }
}
