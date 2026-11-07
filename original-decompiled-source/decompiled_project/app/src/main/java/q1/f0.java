package q1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class f0 {
    public static final Bitmap a(n1 n1Var) {
        if (n1Var instanceof e0) {
            return ((e0) n1Var).f21686a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i10) {
        return i10 == 0 ? Bitmap.Config.ARGB_8888 : i10 == 1 ? Bitmap.Config.ALPHA_8 : i10 == 2 ? Bitmap.Config.RGB_565 : i10 == 3 ? Bitmap.Config.RGBA_F16 : i10 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
