package com.company.classwork.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

  List<ChessItem> items = new ArrayList<>();

  public void addItem(ChessItem item) {
    items.add(item);
  }

  public void drawBoard() {
    for (ChessItem item: items) {
      item.draw();
    }
  }

}
