package adapter.adapter;

/**
 *@description: 媒体播放器功能接口
 *@author:     yujunxin
 *@createTime: 2024/5/30 17:45
 *@version:    1.0
 */
public interface MediaPlayer {

   /** 定义抽象方法播放 **/
   void play(String audioType, String fileName); // 入参为播放文件类型和文件名
}