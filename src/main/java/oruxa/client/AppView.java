package oruxa.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.ViewImpl;


public class AppView extends ViewImpl implements AppPresenter.Display, View {

    HTMLPanel widget;
    public AppView() {
        widget=new HTMLPanel("");

    }

    @Override
    public void addToSlot(Object slot, IsWidget content) {

    }

    @Override
    public void removeFromSlot(Object slot, IsWidget content) {

    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        widget.clear();
        widget.add(content);
    }

    @Override
    public Widget asWidget() {
        return widget;
    }
}
