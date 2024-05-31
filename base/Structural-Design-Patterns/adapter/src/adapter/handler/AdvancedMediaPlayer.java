package adapter.handler;

/**
 *@description: 最新播放器的行为接口
 *@author:     yujunxin
 *@createTime: 2024/5/30 17:48
 *@version:    1.0
 */
public interface AdvancedMediaPlayer {
    /** Vlc播放模式 **/
    public void playVlc(String fileName);

    /** Mp4播放模式 **/
    public void playMp4(String fileName);
}