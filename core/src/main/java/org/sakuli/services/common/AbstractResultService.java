/*
 * Sakuli - Testing and Monitoring-Tool for Websites and common UIs.
 *
 * Copyright 2013 - 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sakuli.services.common;

import org.sakuli.datamodel.TestSuite;
import org.sakuli.datamodel.helper.TestCaseStepHelper;
import org.sakuli.datamodel.state.TestSuiteState;
import org.sakuli.exceptions.SakuliExceptionHandler;
import org.sakuli.exceptions.SakuliReceiverException;
import org.sakuli.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @author tschneck
 */
public abstract class AbstractResultService implements ResultService {

    @Autowired
    protected SakuliExceptionHandler exceptionHandler;
    @Autowired
    protected TestSuite testSuite;

    @Override
    public void refreshStates() {
        testSuite.refreshState();
    }

    public void writeCachedStepDefinitions() {
        if (!TestSuiteState.ERRORS.equals(testSuite.getState())) {
            try {
                TestCaseStepHelper.writeCachedStepDefinitions(testSuite);
            } catch (IOException e) {
                exceptionHandler.handleException(
                        new SakuliReceiverException(e, "Can't create cache file(s) for test case steps!"), true);
            }
        }
    }
}