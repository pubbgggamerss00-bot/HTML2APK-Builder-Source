package b8;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;
import mh.x;
import z.j1;

/* loaded from: classes.dex */
public final class n {
    public static String a(String str) {
        if (x.A(str)) {
            return null;
        }
        String strV = x.V(x.V(str, '#'), '?');
        String strT = x.T(x.T(strV, '/', strV), '.', "");
        if (x.A(strT)) {
            return null;
        }
        String lowerCase = strT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        String str2 = (String) o.f3677a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static final na.h b(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        return new na.h(context, na.h.f18651a, a.d.f5917i, g.a.f5924c);
    }

    public static final j1 c(g2.p pVar) {
        Object objW = pVar.w();
        if (objW instanceof j1) {
            return (j1) objW;
        }
        return null;
    }

    public static final float d(j1 j1Var) {
        return j1Var != null ? j1Var.f34557a : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static final String e(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < CropImageView.DEFAULT_ASPECT_RATIO ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }
}
