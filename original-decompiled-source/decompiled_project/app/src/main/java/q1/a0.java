package q1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public final class a0 {
    public static final BlendMode a(int i10) {
        return i10 == 0 ? BlendMode.CLEAR : i10 == 1 ? BlendMode.SRC : i10 == 2 ? BlendMode.DST : i10 == 3 ? BlendMode.SRC_OVER : i10 == 4 ? BlendMode.DST_OVER : i10 == 5 ? BlendMode.SRC_IN : i10 == 6 ? BlendMode.DST_IN : i10 == 7 ? BlendMode.SRC_OUT : i10 == 8 ? BlendMode.DST_OUT : i10 == 9 ? BlendMode.SRC_ATOP : i10 == 10 ? BlendMode.DST_ATOP : i10 == 11 ? BlendMode.XOR : i10 == 12 ? BlendMode.PLUS : i10 == 13 ? BlendMode.MODULATE : i10 == 14 ? BlendMode.SCREEN : i10 == 15 ? BlendMode.OVERLAY : i10 == 16 ? BlendMode.DARKEN : i10 == 17 ? BlendMode.LIGHTEN : i10 == 18 ? BlendMode.COLOR_DODGE : i10 == 19 ? BlendMode.COLOR_BURN : i10 == 20 ? BlendMode.HARD_LIGHT : i10 == 21 ? BlendMode.SOFT_LIGHT : i10 == 22 ? BlendMode.DIFFERENCE : i10 == 23 ? BlendMode.EXCLUSION : i10 == 24 ? BlendMode.MULTIPLY : i10 == 25 ? BlendMode.HUE : i10 == 26 ? BlendMode.SATURATION : i10 == 27 ? BlendMode.COLOR : i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        return i10 == 0 ? PorterDuff.Mode.CLEAR : i10 == 1 ? PorterDuff.Mode.SRC : i10 == 2 ? PorterDuff.Mode.DST : i10 == 3 ? PorterDuff.Mode.SRC_OVER : i10 == 4 ? PorterDuff.Mode.DST_OVER : i10 == 5 ? PorterDuff.Mode.SRC_IN : i10 == 6 ? PorterDuff.Mode.DST_IN : i10 == 7 ? PorterDuff.Mode.SRC_OUT : i10 == 8 ? PorterDuff.Mode.DST_OUT : i10 == 9 ? PorterDuff.Mode.SRC_ATOP : i10 == 10 ? PorterDuff.Mode.DST_ATOP : i10 == 11 ? PorterDuff.Mode.XOR : i10 == 12 ? PorterDuff.Mode.ADD : i10 == 14 ? PorterDuff.Mode.SCREEN : i10 == 15 ? PorterDuff.Mode.OVERLAY : i10 == 16 ? PorterDuff.Mode.DARKEN : i10 == 17 ? PorterDuff.Mode.LIGHTEN : i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
