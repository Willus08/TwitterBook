package posidenpalace.com.twitterbook.model;

import android.app.Application;

import com.twitter.sdk.android.core.Twitter;

/**
 * Created by Android on 7/26/2017.
 */

public class Startup extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Twitter.initialize(this);
    }
}
