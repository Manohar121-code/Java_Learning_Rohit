package oops.composition;

public class Heart {
	int size;
	int numOfRooms;
	String quality;

	public Heart(int size, int numOfRooms, String quality) {
		super();
		this.size = size;
		this.numOfRooms = numOfRooms;
		this.quality = quality;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Heart [size=" + size + ", numOfRooms=" + numOfRooms + ", quality=" + quality + "]";
	}

}
