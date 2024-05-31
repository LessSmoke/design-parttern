package adapter.adapter;

/**
 *@description: 媒体播放器类实现媒体播放器接口,假设原本内置的仅支持mp3的播放形式
 *@author:     yujunxin
 *@createTime: 2024/5/30 17:56
 *@version:    1.0
 */
public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter;
 
   @Override
   public void play(String audioType, String fileName) {    
 
      //播放 mp3 音乐文件的内置支持
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("播放mp3: "+ fileName);
      } 
      //mediaAdapter 提供了播放其他文件格式的支持
      else if(audioType.equalsIgnoreCase("vlc") 
         || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println("无效的媒体文件: "+
            audioType + " 文件格式不支持");
      }
   }   
}