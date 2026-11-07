package l;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13647a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13648b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 29 || i6 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f13647a);
        } else {
            drawable.setState(f13648b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode b(int i6, PorterDuff.Mode mode) {
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
