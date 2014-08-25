package com.wallissoftware.popuptest.client.application.home.centerpopup;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

class CenterPopupView extends PopupViewImpl implements CenterPopupPresenter.MyView {
    interface Binder extends UiBinder<Widget, CenterPopupView> {
    }

    @Inject
    CenterPopupView(EventBus eventBus, Binder uiBinder) {
        super(eventBus);

        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("closeButton")
    void onCloseButtonClick(ClickEvent event) {
        hide();
    }

}