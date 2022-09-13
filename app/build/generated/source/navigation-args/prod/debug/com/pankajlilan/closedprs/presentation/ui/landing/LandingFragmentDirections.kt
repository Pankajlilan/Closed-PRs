package com.pankajlilan.closedprs.presentation.ui.landing

import android.os.Bundle
import androidx.navigation.NavDirections
import com.pankajlilan.closedprs.R
import kotlin.Int
import kotlin.String

public class LandingFragmentDirections private constructor() {
  private data class NavigateToRepoFragment(
    public val gitUsername: String
  ) : NavDirections {
    public override val actionId: Int = R.id.navigate_to_repoFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("git_username", this.gitUsername)
        return result
      }
  }

  public companion object {
    public fun navigateToRepoFragment(gitUsername: String): NavDirections =
        NavigateToRepoFragment(gitUsername)
  }
}
