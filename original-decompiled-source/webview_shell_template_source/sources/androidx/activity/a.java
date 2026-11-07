package androidx.activity;

import android.window.BackEvent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {
    public static float a(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
