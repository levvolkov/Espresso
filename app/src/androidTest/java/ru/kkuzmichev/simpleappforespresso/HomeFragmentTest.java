package ru.kkuzmichev.simpleappforespresso;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import io.qameta.allure.android.runners.AllureAndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AllureAndroidJUnit4.class)
public class HomeFragmentTest {
    private static final String homeFragmentText = "This is home fragment";

//    @Rule
//    public ActivityTestRule<MainActivity> activityTestRule =
//            new ActivityTestRule<>(MainActivity.class);

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testHomeFragmentTextMatches() {
        ViewInteraction mainText = onView(
                withId(R.id.text_home)
        );
        mainText.check(
                matches(
                        withText(homeFragmentText)
                )
        );
    }
}

