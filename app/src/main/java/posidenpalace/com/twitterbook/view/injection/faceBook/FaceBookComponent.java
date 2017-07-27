package posidenpalace.com.twitterbook.view.injection.faceBook;


import dagger.Component;
import posidenpalace.com.twitterbook.view.activities.faceBook.FaceBook;

@Component(modules = FaceBookModule.class)
public interface FaceBookComponent {
    void inject(FaceBook faceBook);
}
