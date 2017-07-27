package posidenpalace.com.twitterbook.view.injection.logIn;

import dagger.Component;
import posidenpalace.com.twitterbook.view.activities.logIn.LogIn;

@Component(modules = LogInModule.class)
public interface LogInComponent {
    void inject(LogIn logIn);
}
