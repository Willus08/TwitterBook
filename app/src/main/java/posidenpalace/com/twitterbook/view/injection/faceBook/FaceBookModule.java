package posidenpalace.com.twitterbook.view.injection.faceBook;

import dagger.Module;
import dagger.Provides;
import posidenpalace.com.twitterbook.view.activities.faceBook.FaceBookPresenter;


@Module
public class FaceBookModule {
    @Provides
    public FaceBookPresenter faceBookPresenter(){
        return new FaceBookPresenter();
    }
}
