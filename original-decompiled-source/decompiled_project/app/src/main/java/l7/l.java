package l7;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import g7.h0;
import g7.i0;
import g7.t;
import hi.b0;
import java.util.Locale;
import kotlin.jvm.internal.r;
import l7.k;
import qg.x;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16752a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16753b;

    public static final class a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            String str = h0Var.f11506c;
            if ((str != null && !str.equals("file")) || h0Var.f11508e == null) {
                return null;
            }
            Bitmap.Config[] configArr = b8.t.f3682a;
            if (r.a(h0Var.f11506c, "file") && r.a(x.D(i0.d(h0Var)), "android_asset")) {
                return null;
            }
            return new l(h0Var, mVar);
        }
    }

    public l(h0 h0Var, w7.m mVar) {
        this.f16752a = h0Var;
        this.f16753b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        String str = b0.f13033b;
        String strC = i0.c(this.f16752a);
        if (strC == null) {
            throw new IllegalStateException("filePath == null");
        }
        b0 b0VarA = b0.a.a(strC);
        String mimeTypeFromExtension = null;
        j7.p pVarA = j7.r.a(b0VarA, this.f16753b.f31406f, null, null, 28);
        String strT = mh.x.T(b0VarA.b(), '.', "");
        if (!mh.x.A(strT)) {
            String lowerCase = strT.toLowerCase(Locale.ROOT);
            r.d(lowerCase, "toLowerCase(...)");
            mimeTypeFromExtension = (String) b8.o.f3677a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new p(pVarA, mimeTypeFromExtension, j7.f.f15222c);
    }
}
