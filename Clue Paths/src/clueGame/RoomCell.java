package clueGame;

public class RoomCell extends BoardCell {
	public enum DoorDirection {UP, DOWN, LEFT, RIGHT, NONE};
	
	private DoorDirection doorDirection;
	private char room;

	public RoomCell(int row, int column, char room, DoorDirection dd) {
		super(row, column);
		this.room = room;
		doorDirection = dd;
		//if (dd != DoorDirection.NONE)
	}

	public boolean isRoom(){
		return true;
	}
	
	public boolean isDoorway(){
		return doorDirection != DoorDirection.NONE;
	}
	
	
	public char getInitial() {
		return room;
	}

	public DoorDirection getDoorDirection() {
		return doorDirection;
	}
	public void draw(){

	}

	@Override
	public String toString() {
		return "RoomCell [doorDirection=" + doorDirection + ", room=" + room
				+ "]";
	}
	
	
}
