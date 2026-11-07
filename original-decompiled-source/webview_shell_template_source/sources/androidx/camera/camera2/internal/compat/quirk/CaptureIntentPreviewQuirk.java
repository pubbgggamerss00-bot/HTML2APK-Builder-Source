package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends Quirk {
    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    static boolean workaroundByCaptureIntentPreview(Quirks quirks) {
        Iterator it = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                return true;
            }
        }
        return false;
    }
}
