package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    public static int getCameraSelectorLensFacing(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 2;
        }
        throw new IllegalArgumentException(s0.a(i6, "The given lens facing integer: ", " can not be recognized."));
    }

    public static int getLensFacingInt(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 2;
        }
        throw new IllegalArgumentException(s0.a(i6, "The given lens facing: ", " can not be recognized."));
    }
}
