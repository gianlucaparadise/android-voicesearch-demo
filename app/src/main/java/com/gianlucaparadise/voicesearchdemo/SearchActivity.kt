package com.gianlucaparadise.voicesearchdemo

import android.app.SearchManager
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

        val intent = intent
        Log.d(TAG, "intent: " + intent.action!!)
        if (ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            Log.d(TAG, "query: $query")
            queryText.text = query
        }
    }
}
