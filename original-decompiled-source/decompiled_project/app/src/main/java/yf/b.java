package yf;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public interface b {
    void onBitmapLoaded(Bitmap bitmap, zf.c cVar, Uri uri, Uri uri2);

    void onFailure(Exception exc);
}
