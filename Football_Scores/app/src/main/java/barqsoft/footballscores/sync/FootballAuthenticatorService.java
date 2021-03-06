package barqsoft.footballscores.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by alonsotagle on 14.01.16.
 */
public class FootballAuthenticatorService extends Service {
    private FootballAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        mAuthenticator = new FootballAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
