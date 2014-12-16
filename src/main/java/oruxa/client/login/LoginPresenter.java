package oruxa.client.login;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import oruxa.client.AppPresenter;

public class LoginPresenter extends Presenter<LoginPresenter.Display,LoginPresenter.Proxy> {


    public interface Display extends View {

    }


    @ProxyStandard
    @NameToken("!login")
    public interface Proxy extends ProxyPlace<LoginPresenter> { }


    @Inject
    public LoginPresenter(EventBus eventBus, Display view, Proxy proxy){
        super(eventBus,view,proxy);
    }

    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, AppPresenter.SLOT_CONTENT, this);
    }
}
