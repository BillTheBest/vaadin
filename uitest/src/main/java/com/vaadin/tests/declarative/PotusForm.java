/*
 * Copyright 2000-2016 Vaadin Ltd.
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
package com.vaadin.tests.declarative;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import com.vaadin.v7.data.fieldgroup.PropertyId;
import com.vaadin.v7.ui.ComboBox;
import com.vaadin.v7.ui.TextField;

@DesignRoot
public class PotusForm extends VerticalLayout {

    @PropertyId("firstName")
    public TextField firstName;
    @PropertyId("lastName")
    public TextField lastName;
    @PropertyId("party")
    public ComboBox party;
    @PropertyId("tookOffice")
    public DateField tookOffice;
    @PropertyId("leftOffice")
    public DateField leftOffice;

    public Button save;
    public Button revert;
    public Button delete;

    public PotusForm() {
        Design.read(this);
        party.addItems("Democratic Party");
        party.addItems("Republican Party");
        party.addItems("Independent");
    }
}
