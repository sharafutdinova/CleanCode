package patterns.facade.door;

public class DoorFacade {
    private OpenDoor openDoor;
    private CloseDoor closeDoor;
    private BlockDoor blockDoor;

    public DoorFacade(OpenDoor openDoor, CloseDoor closeDoor, BlockDoor blockDoor) {
        this.openDoor = openDoor;
        this.closeDoor = closeDoor;
        this.blockDoor = blockDoor;
    }

    public void doorOperations() {
        openDoor.openDoor();
        closeDoor.closeDoor();
        blockDoor.blockDoor();
    }
}
