package b4;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.os.VibratorManager;
import android.view.ContentInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ NetworkEvent.Builder a() {
        return new NetworkEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder c(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo f(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj) {
        return obj instanceof VibratorManager;
    }
}
