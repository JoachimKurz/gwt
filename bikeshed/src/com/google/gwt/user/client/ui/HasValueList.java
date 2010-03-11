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

import java.util.List;

/**
 * Alternative to ListHandler that stays away from complexities of event
 * handling, better parallel to {@link HasValue} being a passive receiver of
 * data changes.
 * 
 * @param <V> value type
 */
public interface HasValueList<V> {
  void editValueList(boolean replace, int index, List<V> newValues);

  void setValueList(List<V> newValues);
  
  void setValueListSize(int size, boolean exact); // @jlabanca: What does exact
  // mean?
}