package com.Utils;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUsingAshot {
	WebDriver driver ;
	public void takeScreenshot() throws IOException{
	     AShot as=new AShot();
		 Screenshot screen=as.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		 ImageIO.write(screen.getImage(), "png", new File(System.getProperty("user.dir")+"\\Screenshot\\maven1.png"));
		
	}
}
