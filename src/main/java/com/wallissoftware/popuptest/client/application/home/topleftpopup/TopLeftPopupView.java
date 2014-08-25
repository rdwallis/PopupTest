package com.wallissoftware.popuptest.client.application.home.topleftpopup;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;
import com.gwtplatform.mvp.client.view.TopLeftPopupPositioner;

class TopLeftPopupView extends PopupViewImpl implements TopLeftPopupPresenter.MyView {
    interface Binder extends UiBinder<Widget, TopLeftPopupView> {
    }


    @Inject
    TopLeftPopupView(EventBus eventBus, Binder uiBinder) {
        super(eventBus, new TopLeftPopupPositioner(200, 200));

        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("closeButton")
    void onCloseButtonClick(ClickEvent event) {
        hide();
    }

}