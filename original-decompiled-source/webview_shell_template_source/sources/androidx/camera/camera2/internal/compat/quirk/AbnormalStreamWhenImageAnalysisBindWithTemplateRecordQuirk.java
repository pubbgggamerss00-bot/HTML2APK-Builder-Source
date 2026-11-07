package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static boolean isSamsungM55() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }

    public static boolean load() {
        return isSamsungM55();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return isSamsungM55();
    }
}
