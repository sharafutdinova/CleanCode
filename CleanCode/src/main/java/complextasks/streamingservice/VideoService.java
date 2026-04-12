package complextasks.streamingservice;

import java.util.ArrayList;
import java.util.List;

public class VideoService {
    private List<Video> videoMP4 = new ArrayList<>();
    private VideoAdapterAVI videoAdapterAVI;
    private VideoAdapterMOV videoAdapterMOV;

    public VideoService(VideoAdapterAVI videoAdapterAVI, VideoAdapterMOV videoAdapterMOV) {
        this.videoAdapterAVI = videoAdapterAVI;
        this.videoAdapterMOV = videoAdapterMOV;
    }

    public Video uploadVideo(String path) {
        Video video;
        if (path.toLowerCase().contains("avi"))
            video = videoAdapterAVI.convertToMP4(path);
        else video = videoAdapterMOV.convertToMP4(path);
        video.setId(videoMP4.size());
        videoMP4.add(video);
        return video;
    }

    public void streamVideo(int id) {
        videoMP4.get(id).start();
    }

}
