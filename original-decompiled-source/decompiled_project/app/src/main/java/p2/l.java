package p2;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ ScrollCaptureTarget a(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }
}
