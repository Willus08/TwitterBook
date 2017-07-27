package posidenpalace.com.twitterbook.view.injection.logIn;

import dagger.Module;
import dagger.Provides;
import posidenpalace.com.twitterbook.view.activities.logIn.LogInPresenter;

@Module
public class LogInModule {
    @Provides
    public LogInPresenter logInPresenter(){
        return new LogInPresenter();
    }
}
