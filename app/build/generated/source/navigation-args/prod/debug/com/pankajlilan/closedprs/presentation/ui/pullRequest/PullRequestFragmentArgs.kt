package com.pankajlilan.closedprs.presentation.ui.pullRequest

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PullRequestFragmentArgs(
  public val gitUsername: String,
  public val gitRepo: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("git_username", this.gitUsername)
    result.putString("git_repo", this.gitRepo)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("git_username", this.gitUsername)
    result.set("git_repo", this.gitRepo)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PullRequestFragmentArgs {
      bundle.setClassLoader(PullRequestFragmentArgs::class.java.classLoader)
      val __gitUsername : String?
      if (bundle.containsKey("git_username")) {
        __gitUsername = bundle.getString("git_username")
        if (__gitUsername == null) {
          throw IllegalArgumentException("Argument \"git_username\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_username\" is missing and does not have an android:defaultValue")
      }
      val __gitRepo : String?
      if (bundle.containsKey("git_repo")) {
        __gitRepo = bundle.getString("git_repo")
        if (__gitRepo == null) {
          throw IllegalArgumentException("Argument \"git_repo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_repo\" is missing and does not have an android:defaultValue")
      }
      return PullRequestFragmentArgs(__gitUsername, __gitRepo)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PullRequestFragmentArgs {
      val __gitUsername : String?
      if (savedStateHandle.contains("git_username")) {
        __gitUsername = savedStateHandle["git_username"]
        if (__gitUsername == null) {
          throw IllegalArgumentException("Argument \"git_username\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_username\" is missing and does not have an android:defaultValue")
      }
      val __gitRepo : String?
      if (savedStateHandle.contains("git_repo")) {
        __gitRepo = savedStateHandle["git_repo"]
        if (__gitRepo == null) {
          throw IllegalArgumentException("Argument \"git_repo\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"git_repo\" is missing and does not have an android:defaultValue")
      }
      return PullRequestFragmentArgs(__gitUsername, __gitRepo)
    }
  }
}
