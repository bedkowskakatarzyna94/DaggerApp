package com.example.android.dagger

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.android.dagger.main.MainActivity
import org.junit.Test

class ApplicationTest {

    @Test
    fun runApp() {
        ActivityScenario.launch(MainActivity::class.java)

        onView(withText("Register to Dagger World!")).check(matches(isDisplayed()))
        onView(withId(R.id.username)).perform(typeText("username"), closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard())
        onView(withId(R.id.next)).perform(click())

        onView(withText("Terms and Conditions")).check(matches(isDisplayed()))
        onView(withText("REGISTER")).perform(click())

        onView(withText("Hello username!")).check(matches(isDisplayed()))
        onView(withText("SETTINGS")).perform(click())

        onView(withText("REFRESH NOTIFICATIONS")).check(matches(isDisplayed()))
        onView(withText("LOGOUT")).perform(click())

        onView(withText("Welcome to Dagger World!")).check(matches(isDisplayed()))
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard())
        onView(withText("LOGIN")).perform(click())

        onView(withText("Hello username!")).check(matches(isDisplayed()))
        onView(withText("SETTINGS")).perform(click())

        onView(withText("REFRESH NOTIFICATIONS")).check(matches(isDisplayed()))
        onView(withText("LOGOUT")).perform(click())

        onView(withText("Welcome to Dagger World!")).check(matches(isDisplayed()))
        onView(withId(R.id.unregister)).perform(click())

        onView(withText("Register to Dagger World!")).check(matches(isDisplayed()))
    }
}
