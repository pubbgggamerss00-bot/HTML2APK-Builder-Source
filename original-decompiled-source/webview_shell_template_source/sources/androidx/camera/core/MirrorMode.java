package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MirrorMode {
    public static final int MIRROR_MODE_OFF = 0;
    public static final int MIRROR_MODE_ON = 1;
    public static final int MIRROR_MODE_ON_FRONT_ONLY = 2;
    public static final int MIRROR_MODE_UNSPECIFIED = -1;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mirror {
    }

    private MirrorMode() {
    }
}
