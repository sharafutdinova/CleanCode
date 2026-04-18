package complextasks.streamingservice;

public class Video {
    private String name;
    private VideoType type;
    private int id;

    public Video(String name, VideoType type) {
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoType getType() {
        return type;
    }

    public void setType(VideoType type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Video " + name + " is started");
    }
}
