package com.pankajlilan.closedprs.presentation.ui.repo

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RepoFragmentArgs(
  public val gitUsername: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("git_username", this.gitUsername)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("git_username", this.gitUsername)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RepoFragmentArgs {
      bundle.setClassLoader(RepoFragmentArgs::class.java.classLoader)
      val __gitUsername : String?
      if (bundle.containsKey("git_username")) {
        __gitUsername = bundle.getString("git_username")
        if (__gitUsername == null) {
          throw IllegalArgumentException("Argument \"git_username\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_username\" is missing and does not have an android:defaultValue")
      }
      return RepoFragmentArgs(__gitUsername)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RepoFragmentArgs {
      val __gitUsername : String?
      if (savedStateHandle.contains("git_username")) {
        __gitUsername = savedStateHandle["git_username"]
        if (__gitUsername == null) {
          throw IllegalArgumentException("Argument \"git_username\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_username\" is missing and does not have an android:defaultValue")
      }
      return RepoFragmentArgs(__gitUsername)
    }
  }
}
