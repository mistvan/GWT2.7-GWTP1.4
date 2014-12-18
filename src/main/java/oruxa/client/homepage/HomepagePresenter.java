package oruxa.client.homepage;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import oruxa.client.AppPresenter;

public class HomepagePresenter extends Presenter<HomepagePresenter.Display,HomepagePresenter.Proxy> {


    public interface Display extends View {

    }


    @ProxyCodeSplit()
    @NameToken("!home")
    public interface Proxy extends ProxyPlace<HomepagePresenter> { }


    @Inject
    public HomepagePresenter(EventBus eventBus, Display view, Proxy proxy){
        super(eventBus,view,proxy);
    }

    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, AppPresenter.SLOT_CONTENT, this);
    }
}
