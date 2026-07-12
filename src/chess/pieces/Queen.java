package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setRow(position.getRow() - 1);
		p.setColunn(position.getColunn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// left
		p.setRow(position.getRow());
		p.setColunn(position.getColunn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setColunn(p.getColunn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// right
		p.setRow(position.getRow());
		p.setColunn(position.getColunn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setColunn(p.getColunn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

		// below
		p.setRow(position.getRow() + 1);
		p.setColunn(position.getColunn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunn()] = true;
		}

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
