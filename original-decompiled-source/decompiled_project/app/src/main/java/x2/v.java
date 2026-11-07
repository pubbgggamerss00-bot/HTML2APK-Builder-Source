package x2;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class v {
    public static Typeface a(String str, p pVar, int i10) {
        if (i10 == 0 && kotlin.jvm.internal.r.a(pVar, p.f32030c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), pVar.f32037a, i10 == 1);
    }
}
