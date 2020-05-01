package cn.xpbootcamp.gilded_rose.model;

public interface IMerchandise {
  int MIN_QUALITY = 0;
  int MAX_QUALITY = 50;

  void recalculateForNextDay();
  int getSellIn();
  int getQuality();
  String getName();
}
