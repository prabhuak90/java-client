/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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

package io.appium.java_client.ios;

import static org.junit.Assert.assertEquals;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import org.junit.Test;

public class IOSGesturesTest extends BaseIOSTest {

    @Test public void tapTest() {
        driver.findElementById("IntegerA").sendKeys("2");
        driver.findElementById("IntegerB").sendKeys("4");

        MobileElement e = driver.findElementByAccessibilityId("ComputeSumButton");
        new MultiTouchAction(driver).tap(2, e, 2000).perform();
        assertEquals(driver.findElementByXPath("//*[@name = \"Answer\"]").getText(), "6");
    }

    @Test public void zoomTest() {
        MobileElement e = driver.findElementById("IntegerA");
        new MultiTouchAction(driver).zoom(e).perform();
    }

    @Test public void pinchTest() {
        MobileElement e = driver.findElementById("IntegerA");
        new MultiTouchAction(driver).pinch(e).perform();
    }
}

