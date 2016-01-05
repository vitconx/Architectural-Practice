package com.pycogroup;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by HieuVP on 1/4/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 16, application = ApplicationStub.class)
public abstract class ApplicationTestCase {
}
