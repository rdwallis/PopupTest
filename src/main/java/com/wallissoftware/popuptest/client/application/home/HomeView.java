package com.wallissoftware.popuptest.client.application.home;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {
    interface Binder extends UiBinder<Widget, HomeView> {
    }

    @UiField IsWidget relativeButton;

    @Inject
    HomeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("centeredButton")
    void onCenterButtonClick(ClickEvent event) {
        getUiHandlers().showCenteredPopup();
    }

    @UiHandler("relativeButton")
    void onRelativeButtonClick(ClickEvent event) {
        getUiHandlers().showRelativePopup(relativeButton);
    }

    @UiHandler("topLeftButton")
    void onTopLeftButtonClick(ClickEvent event) {
        getUiHandlers().showTopLeftPopup();
    }

}