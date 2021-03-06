<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.UzuamkiChaitanya.hack">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.AppCompat.Light.NoActionBar">

        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="@string/google_maps_key" />

        <activity android:name=".LoginActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />

                <action android:name="android.intent.action.SEARCH" />
            </intent-filter>

            <meta-data android:name="android.app.searchable"
                android:resource="@xml/searchable"/>

        </activity>



        <activity android:name=".ProfileActivity" />
        <activity android:name=".SignUpActivity" />

        <!-- <activity android:name=".ProfileActivity"></activity> -->
        <activity android:name=".Settings" />
        <activity
            android:name=".PostExpanded"
            android:label="@string/title_activity_post_expanded"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar" />
    </application>

</manifest>
