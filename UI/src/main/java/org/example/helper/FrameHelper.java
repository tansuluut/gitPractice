package org.example.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {
    WebDriver driver;

    public FrameHelper(WebDriver driver) {
        this.driver = driver;
    }

    public FrameHelper switchToFrame(String frameId) {
        driver.switchTo().frame(frameId);
        return this;
    }

    public FrameHelper switchToFrame(WebElement frameElement) {
        driver.switchTo().frame(frameElement);
        return this;
    }

    public FrameHelper switchToIndexFrame(int frameIndex) {
        driver.switchTo().frame(frameIndex);
        return this;
    }

    public FrameHelper switchToParentFrame() {
        driver.switchTo().parentFrame();
        return this;
    }
        public FrameHelper switchToChildFrame(int index) {
        driver.switchTo().frame(index);
        return this;
    }


    public FrameHelper switchToDefaultContent() {
        driver.switchTo().defaultContent();
        return this;
    }



}
