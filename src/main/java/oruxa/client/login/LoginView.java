package oruxa.client.login;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * Created by navid on 12/12/14.
 */
public class LoginView extends ViewImpl implements LoginPresenter.Display, View {

    HTMLPanel widget;
    public LoginView() {
        widget = new HTMLPanel("Login");

    }

    @Override
    public void addToSlot(Object slot, IsWidget content) {
        Window.alert("add");
    }

    @Override
    public void removeFromSlot(Object slot, IsWidget content) {

    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {

    }

    @Override
    public Widget asWidget() {
        return widget;
    }
}
