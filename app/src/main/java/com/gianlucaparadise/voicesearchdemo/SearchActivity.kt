package com.gianlucaparadise.voicesearchdemo

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    private val TAG = "SearchActivity"
    private val ACTION_SEARCH = "com.google.android.gms.actions.SEARCH_ACTION"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_search)

        // This lifecycle callback is called when your app is closed (not in background)
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: ")

        // This lifecycle callback is called when your app is in background
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        if (intent == null) return

        Log.d(TAG, "intent: " + intent.action!!)
        if (ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            Log.d(TAG, "query: $query")
            queryText.text = query
        }
    }
}
