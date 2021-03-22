package com.brentvatne.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import android.util.Log;

public class VideoDownloadModule extends ReactContextBaseJavaModule {
    VideoDownloadModule(ReactApplicationContext context) {
        super(context);
    };

    @Override
    public String getName() {
       return "VideoDownloadModule";
    };

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void downloadFile(String assetId) {
       Log.d("VIDEO_DOWNLOAD", "download clicked for asset $assetId");
    };

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void deleteFile(String assetId) {
       Log.d("VIDEO_DOWNLOAD", "delete clicked for asset $assetId");
    };

    @ReactMethod(isBlockingSynchronousMethod = true)
    public static ReadableArray getDownloadedList(Promise promise) {
       List<String> list = new ArrayList<String>();
       list.add("fcb965ad-687d-44d4-90c4-9a4a7cc23d1c");
       list.add("a3abb4e4-191d-44c1-aab9-b25e2037090e");
       return promise.resolve(list);
    };
}
