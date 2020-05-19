package com.bignerdranch.android.beatbox;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class BeatBoxActivityTest {

//    @Rule
//    public ActivityTestRule<BeatBoxActivity> mActivityTestRule =
//            new ActivityTestRule<>(BeatBoxActivity.class);

    @Test
    public void showsFirstFileName() {
        onView(withText("65_cjipie"))
                .check(matches(anything()));

        onView(withText("65_cjipie"))
                .perform(click());
    }

}