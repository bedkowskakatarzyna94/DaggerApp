package com.example.android.dagger.settings

import com.example.android.dagger.user.UserDataRepository
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val userManager: UserManager
) {

    fun refreshNotifications() {
        userDataRepository.refreshUnreadNotifications()
    }

    fun logout() {
        userManager.logout()
    }
}
