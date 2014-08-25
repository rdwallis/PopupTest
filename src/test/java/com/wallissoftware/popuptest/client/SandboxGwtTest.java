package com.wallissoftware.popuptest.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.wallissoftware.popuptest.PopupTest";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}