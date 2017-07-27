package posidenpalace.com.twitterbook.view.injection.twitter;

import dagger.Component;
import posidenpalace.com.twitterbook.view.activities.twitter.Twitter;

@Component(modules = TwitterModule.class)
public interface TwttierComponent {
    void inject(Twitter twitter);
}
