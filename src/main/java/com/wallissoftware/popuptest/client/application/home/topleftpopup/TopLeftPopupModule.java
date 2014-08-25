package com.wallissoftware.popuptest.client.application.home.topleftpopup;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TopLeftPopupModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(TopLeftPopupPresenter.class, TopLeftPopupPresenter.MyView.class, TopLeftPopupView.class);
    }
}