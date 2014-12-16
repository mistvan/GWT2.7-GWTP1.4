package oruxa.client.gin;

import com.gwtplatform.common.client.CommonGinModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class GinClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new CommonGinModule());
        install(new DefaultModule());


        bindConstant().annotatedWith(DefaultPlace.class).to("!home");
        bindConstant().annotatedWith(ErrorPlace.class).to("!error");
        bindConstant().annotatedWith(UnauthorizedPlace.class).to("!error");

        install(new GinApplicationModule());
    }
}