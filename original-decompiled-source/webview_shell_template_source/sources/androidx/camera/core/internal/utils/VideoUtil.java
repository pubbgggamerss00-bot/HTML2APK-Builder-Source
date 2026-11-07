package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        Cursor cursorQuery = null;
        try {
            try {
                uri2 = uri;
                try {
                    cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, null, null, null);
                    cursorQuery.getClass();
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    cursorQuery.close();
                    return string;
                } catch (RuntimeException e6) {
                    e = e6;
                    RuntimeException runtimeException = e;
                    Logger.e(TAG, "Failed in getting absolute path for Uri " + uri2.toString() + " with Exception " + runtimeException.toString());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } finally {
            }
        } catch (RuntimeException e7) {
            e = e7;
            uri2 = uri;
        }
    }
}
