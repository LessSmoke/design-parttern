package adapter.handler.impl;

import adapter.handler.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("播放vlc文件: "+ fileName);
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}