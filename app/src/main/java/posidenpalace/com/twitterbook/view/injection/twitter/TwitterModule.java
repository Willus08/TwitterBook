package posidenpalace.com.twitterbook.view.injection.twitter;

import dagger.Module;
import dagger.Provides;
import posidenpalace.com.twitterbook.view.activities.twitter.TwitterPresenter;

@Module
public class TwitterModule {
    @Provides
    public TwitterPresenter twitterPresenter(){
        return new TwitterPresenter();
    }
}
