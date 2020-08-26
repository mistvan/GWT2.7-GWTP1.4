package oruxa.client.homepage;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * Created by navid on 12/12/14.
 */
public class HomepageView extends ViewImpl implements HomepagePresenter.Display, View {

    HTMLPanel widget;
    public HomepageView() {
        widget = new HTMLPanel("GWT Test 2");

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
