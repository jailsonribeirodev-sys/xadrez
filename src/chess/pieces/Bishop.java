package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// nw
		p.setRow(position.getRow() - 1);
		p.setColunn(position.getColunn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColunn(p.getColunn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// ne
		p.setRow(position.getRow() - 1);
		p.setColunn(position.getColunn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColunn(p.getColunn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// se
		p.setRow(position.getRow() + 1);
		p.setColunn(position.getColunn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() + 1);
			p.setColunn(p.getColunn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// sw
		p.setRow(position.getRow() + 1);
		p.setColunn(position.getColunn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() + 1);
			p.setColunn(p.getColunn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		return mat;
	}
}
