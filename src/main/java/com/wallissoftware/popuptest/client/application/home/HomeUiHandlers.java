package com.wallissoftware.popuptest.client.application.home;

import com.google.gwt.user.client.ui.IsWidget;
import com.gwtplatform.mvp.client.UiHandlers;

interface HomeUiHandlers extends UiHandlers {

    void showRelativePopup(IsWidget widget);

    void showTopLeftPopup();

    void showCenteredPopup();
}