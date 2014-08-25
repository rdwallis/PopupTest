package com.wallissoftware.popuptest.client.application.home;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.wallissoftware.popuptest.client.application.ApplicationPresenter;
import com.wallissoftware.popuptest.client.application.home.centerpopup.CenterPopupPresenter;
import com.wallissoftware.popuptest.client.application.home.relativepopup.RelativePopupPresenter;
import com.wallissoftware.popuptest.client.application.home.topleftpopup.TopLeftPopupPresenter;
import com.wallissoftware.popuptest.client.place.NameTokens;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> implements HomeUiHandlers {
    @NameToken(NameTokens.home)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<HomePresenter> {
    }

    interface MyView extends View, HasUiHandlers<HomeUiHandlers> {
    }

    private final RelativePopupPresenter relativePopupPresenter;
    private final PresenterWidget<? extends PopupView> centerPopupPresenter, topLeftPopupPresenter;

    @Inject
    HomePresenter(EventBus eventBus, MyView view, MyProxy proxy, RelativePopupPresenter relativePopupPresenter, CenterPopupPresenter centerPopupPresenter, TopLeftPopupPresenter topLeftPopupPresenter) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);

        getView().setUiHandlers(this);
        this.relativePopupPresenter = relativePopupPresenter;
        this.centerPopupPresenter = centerPopupPresenter;
        this.topLeftPopupPresenter = topLeftPopupPresenter;
    }

    @Override
    public void showCenteredPopup() {
        addToPopupSlot(centerPopupPresenter);
    }

    @Override
    public void showRelativePopup(IsWidget widget) {
        relativePopupPresenter.setRelativeTo(widget);
        addToPopupSlot(relativePopupPresenter);
    }

    @Override
    public void showTopLeftPopup() {
        addToPopupSlot(topLeftPopupPresenter);
    }

}
