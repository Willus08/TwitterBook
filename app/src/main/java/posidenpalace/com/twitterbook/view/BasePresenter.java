package posidenpalace.com.twitterbook.view;



public interface BasePresenter<V extends BaseView> {
    public void addView(V view);
    public void removeView();
}
