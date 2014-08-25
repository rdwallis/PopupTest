package com.wallissoftware.popuptest.client.application.home.relativepopup;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.view.RelativeToWidgetPopupPositioner;

public class RelativePopupPresenter extends PresenterWidget<RelativePopupPresenter.MyView> {
    interface MyView extends PopupView {

    }

    @Inject
    RelativePopupPresenter(EventBus eventBus, MyView view) {
        super(eventBus, view);

    }

    public void setRelativeTo(IsWidget widget) {
        getView().setPopupPositioner(new RelativeToWidgetPopupPositioner(widget));

    }

}
