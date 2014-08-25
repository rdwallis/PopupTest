package com.wallissoftware.popuptest.client.application.home.relativepopup;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class RelativePopupModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(RelativePopupPresenter.class, RelativePopupPresenter.MyView.class, RelativePopupView.class);
    }
}