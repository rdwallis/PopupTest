package com.wallissoftware.popuptest.client.application.home.topleftpopup;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

public class TopLeftPopupPresenter extends PresenterWidget<TopLeftPopupPresenter.MyView> {
    interface MyView extends PopupView {
    }

    @Inject
    TopLeftPopupPresenter(EventBus eventBus, MyView view) {
        super(eventBus, view);
    }

}
