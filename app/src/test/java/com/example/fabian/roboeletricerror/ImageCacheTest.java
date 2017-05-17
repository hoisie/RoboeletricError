package com.example.fabian.roboeletricerror;

import static junit.framework.Assert.assertNotNull;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ImageCacheTest {

    static Bitmap bmp;

    @Before
    public void setUp() {
        bmp = BitmapFactory.decodeResource(RuntimeEnvironment.application.getResources(), R.mipmap.ic_launcher);
    }

    @Test
    public void notNull() {
        assertNotNull(bmp);
    }

}