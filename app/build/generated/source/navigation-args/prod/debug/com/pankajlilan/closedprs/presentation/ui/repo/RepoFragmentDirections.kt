package com.pankajlilan.closedprs.presentation.ui.repo

import android.os.Bundle
import androidx.navigation.NavDirections
import com.pankajlilan.closedprs.R
import kotlin.Int
import kotlin.String

public class RepoFragmentDirections private constructor() {
  private data class NavigateToPullRequestFragment(
    public val gitUsername: String,
    public val gitRepo: String
  ) : NavDirections {
    public override val actionId: Int = R.id.navigate_to_pullRequestFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("git_username", this.gitUsername)
        result.putString("git_repo", this.gitRepo)
        return result
      }
  }

  public companion object {
    public fun navigateToPullRequestFragment(gitUsername: String, gitRepo: String): NavDirections =
        NavigateToPullRequestFragment(gitUsername, gitRepo)
  }
}
