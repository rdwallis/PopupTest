package com.wallissoftware.popuptest.client.application.home;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.wallissoftware.popuptest.client.application.home.centerpopup.CenterPopupModule;
import com.wallissoftware.popuptest.client.application.home.relativepopup.RelativePopupModule;
import com.wallissoftware.popuptest.client.application.home.topleftpopup.TopLeftPopupModule;

public class HomeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new TopLeftPopupModule());
        install(new RelativePopupModule());
        install(new CenterPopupModule());
        bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
    }
}