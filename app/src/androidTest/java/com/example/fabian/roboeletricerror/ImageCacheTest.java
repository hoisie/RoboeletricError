package com.example.fabian.roboeletricerror;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static junit.framework.Assert.assertNotNull;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(RobolectricTestRunner.class)
public class ImageCacheTest {

    static Bitmap bmp;

    @BeforeClass
    public static void setUp() {
        bmp = BitmapFactory.decodeResource(RuntimeEnvironment.application.getResources(), R.mipmap.ic_launcher);
    }

    @Test
    public void notNull() {
        assertNotNull(bmp);
    }

}