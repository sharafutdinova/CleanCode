package complextasks.streamingservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoService {
    private List<Video> videoMP4 = new ArrayList<>();
    private Map<VideoType, VideoAdapter> videoAdapters = new HashMap<>();

    public void addVideoAdapter(VideoType type, VideoAdapter videoAdapter) {
        this.videoAdapters.put(type, videoAdapter);
    }

    public Video uploadVideo(Video video) {
        Video convertedVideo = switch (video.getType()) {
            case MP4 -> video;
            case AVI -> videoAdapters.get(VideoType.AVI).convertToMP4(video);
            case MOV -> videoAdapters.get(VideoType.MOV).convertToMP4(video);
        };
        convertedVideo.setId(videoMP4.size());
        videoMP4.add(convertedVideo);
        return convertedVideo;
    }

    public void streamVideo(int id) {
        videoMP4.get(id).start();
    }

}
