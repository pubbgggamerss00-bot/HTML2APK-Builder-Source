package n4;

import android.graphics.PorterDuff;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13994a;

        /* renamed from: b, reason: collision with root package name */
        public int f13995b;

        /* renamed from: c, reason: collision with root package name */
        public int f13996c;
    }

    public static PorterDuff.Mode a(int i6, PorterDuff.Mode mode) {
        if (i6 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
