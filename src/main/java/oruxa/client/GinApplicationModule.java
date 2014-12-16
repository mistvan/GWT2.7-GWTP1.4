package oruxa.client;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import oruxa.client.homepage.HomepagePresenter;
import oruxa.client.homepage.HomepageView;

public class GinApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {

        bindPresenter(HomepagePresenter.class, HomepagePresenter.Display.class, HomepageView.class,
                HomepagePresenter.Proxy.class);
    }
}