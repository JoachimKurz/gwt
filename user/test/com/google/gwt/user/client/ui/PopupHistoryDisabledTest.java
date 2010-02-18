/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.user.client.ui;

import com.google.gwt.junit.DoNotRunWith;
import com.google.gwt.junit.Platform;
import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for {@link PopupPanel} when history is disabled.
 */
@DoNotRunWith(Platform.HtmlUnit)
public class PopupHistoryDisabledTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "com.google.gwt.user.HistoryDisabledTest";
  }

  /**
   * Issue 4584: Make sure that we do not throw an NPE when history is disabled.
   */
  public void testShowHide() {
    PopupPanel p = new PopupPanel(true, false);
    p.show();
    p.hide();
  }
}