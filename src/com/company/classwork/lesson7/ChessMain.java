package com.company.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessMain {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ChessBoard board = new ChessBoard();

    while(true) {
      System.out.println("Input chess type (queen, king, pawn) or 'stop' to exit:");
      String chessType = reader.readLine();

      if ("stop".equals(chessType)) {
        break;
      }

      switch (chessType.toLowerCase().trim()) {
        case "queen":
          board.addItem(new Queen());
          break;
        case "king":
          board.addItem(new King());
          break;
        case "pawn":
          board.addItem(new Pawn());
          break;
        default:
          System.out.println("Error");
      }
    }

    board.drawBoard();

  }

}
