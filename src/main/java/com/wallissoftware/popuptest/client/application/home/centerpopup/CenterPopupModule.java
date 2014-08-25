package com.wallissoftware.popuptest.client.application.home.centerpopup;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CenterPopupModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(CenterPopupPresenter.class, CenterPopupPresenter.MyView.class, CenterPopupView.class);
    }
}