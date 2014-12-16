package oruxa.client;


import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import oruxa.client.homepage.HomepagePresenter;

@SuppressWarnings("UnusedDeclaration")
@GinModules({GinApplicationModule.class})
public interface ClientGinjector extends Ginjector {
    EventBus getEventBus();

    PlaceManager getPlaceManager();
    Provider<HomepagePresenter> getHomepagePresenterProvider();
}
