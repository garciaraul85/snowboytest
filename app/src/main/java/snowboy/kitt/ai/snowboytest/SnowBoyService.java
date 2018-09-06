package snowboy.kitt.ai.snowboytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SnowBoyService extends Service {
    public SnowBoyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
