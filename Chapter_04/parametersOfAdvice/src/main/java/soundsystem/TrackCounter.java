package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts =
            new HashMap<Integer, Integer>();

    @Pointcut(
            "execution(* soundsystem.CompactDisc.playTrack(int)) " +
                    "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {}//将切点表达式换成trackPlayed()方法

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber) : 0;//如果当前磁道有值,返回该磁道目前播放次数，若无值，返回0
    }
}
