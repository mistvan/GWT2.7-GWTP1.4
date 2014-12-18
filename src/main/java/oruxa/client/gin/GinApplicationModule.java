package oruxa.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import oruxa.client.AppPresenter;
import oruxa.client.AppView;
import oruxa.client.homepage.HomepagePresenter;
import oruxa.client.homepage.HomepageView;
import oruxa.client.login.LoginPresenter;
import oruxa.client.login.LoginView;

public class GinApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {

        bindPresenter(HomepagePresenter.class, HomepagePresenter.Display.class, HomepageView.class,
                HomepagePresenter.Proxy.class);

        bindPresenter(AppPresenter.class, AppPresenter.Display.class, AppView.class,
                AppPresenter.MyProxy.class);

        bindPresenter(LoginPresenter.class, LoginPresenter.Display.class, LoginView.class,
                LoginPresenter.Proxy.class);

    }
}