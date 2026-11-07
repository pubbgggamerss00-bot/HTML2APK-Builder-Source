package androidx.camera.core.impl.stabilization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class StabilizationMode {
    public static final int OFF = 1;
    public static final int ON = 2;
    public static final int UNSPECIFIED = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private StabilizationMode() {
    }
}
