package com.pankajlilan.closedprs.utils.pagination.factory

import androidx.paging.DataSource
import com.pankajlilan.closedprs.data.models.PullRequest
import com.pankajlilan.closedprs.utils.pagination.datasource.PrDataSource
import com.pankajlilan.closedprs.utils.pagination.datasource.base.OnDataSourceLoading

/**
 * Factory class that handles the creation of DataSources
 */
class PullRequestDataSourceFactory(
    private var loading: OnDataSourceLoading,
    var user: String? = null,
    var repo: String?
) : DataSource.Factory<Int, PullRequest>() {
    private lateinit var source: PrDataSource

    override fun create(): DataSource<Int, PullRequest>? {
        // invalidate the previous data source, if available
        if (::source.isInitialized) source.invalidate()

        // if we have a user, then create a data source
        user?.let { usr ->
            repo?.let {
                source = PrDataSource(usr, it)
                source.onDataSourceLoading = loading
                return source
            }
        }
        return null
    }
}