# Can't process queries with space 
adb shell am start -a com.google.android.gms.actions.SEARCH_ACTION -e query "$1" com.gianlucaparadise.voicesearchdemo