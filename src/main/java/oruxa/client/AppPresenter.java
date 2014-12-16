package oruxa.client;


import com.google.gwt.event.shared.GwtEvent;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class AppPresenter extends Presenter<AppPresenter.Display,AppPresenter.MyProxy> {


    public interface Display extends View {

    }


    @ProxyStandard
    public interface MyProxy extends Proxy<AppPresenter> { }

    @ContentSlot
    public static final GwtEvent.Type<RevealContentHandler<?>> SLOT_CONTENT = new GwtEvent.Type<RevealContentHandler<?>>();

    @Inject
    public AppPresenter(EventBus eventBus, Display view, MyProxy proxy){
        super(eventBus,view,proxy,RevealType.Root);
    }
}
