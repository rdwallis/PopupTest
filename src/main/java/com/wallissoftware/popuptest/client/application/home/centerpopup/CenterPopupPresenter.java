package com.wallissoftware.popuptest.client.application.home.centerpopup;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
public class CenterPopupPresenter extends PresenterWidget<CenterPopupPresenter.MyView>  {
    interface MyView extends PopupView  {
    }

    @Inject
    CenterPopupPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        
    }
    
    
}