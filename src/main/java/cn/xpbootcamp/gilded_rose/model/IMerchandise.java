package cn.xpbootcamp.gilded_rose.model;

public interface IMerchandise {
  void recalculateForNextDay();
  int getSellIn();
  int getQuality();
  String getName();
}
