package boardgame;

public class Position {
private int row;
private int colunn;
public Position(int row, int colunn) {
	super();
	this.row = row;
	this.colunn = colunn;
}
public Position() {
	super();
}
public int getRow() {
	return row;
}
public void setRow(int row) {
	this.row = row;
}
public int getColunn() {
	return colunn;
}
public void setColunn(int colunn) {
	this.colunn = colunn;
}
@Override
public String toString() {
	return  row + ", " + colunn;
}

}
