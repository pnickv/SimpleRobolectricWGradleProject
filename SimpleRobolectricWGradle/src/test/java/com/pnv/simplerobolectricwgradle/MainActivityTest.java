package com.pnv.simplerobolectricwgradle;


import com.pnv.simplerobolectricwgradle.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    @Test
    @Config(reportSdk = 18)
    public void testShouldBePassed() {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull(activity);
    }
}
