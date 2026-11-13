package pucp.lab9.entity;

public class StfPuzzleSv {
    private String stfGameBoard;
    private byte[] image;


    public StfPuzzleSv(){
    }

    public StfPuzzleSv(String stfGameBoard, byte[] image) {
        this.stfGameBoard = stfGameBoard;
        this.image = image;
    }

    public String getStfGameBoard() {
        return stfGameBoard;
    }

    public void setStfGameBoard(String stfGameBoard) {
        this.stfGameBoard = stfGameBoard;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
