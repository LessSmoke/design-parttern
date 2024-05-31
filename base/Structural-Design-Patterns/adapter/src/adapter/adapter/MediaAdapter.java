package adapter.adapter;

import adapter.handler.AdvancedMediaPlayer;
import adapter.handler.impl.Mp4Player;
import adapter.handler.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;

   /**
    *@description: 构造方法根据待播放的文件种类的名字创建不同的适配器类
    *@author:     yujunxin
    *@createTime: 2024/5/30 17:58
    *@version:    1.0
    */
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}