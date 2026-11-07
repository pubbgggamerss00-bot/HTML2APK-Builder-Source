package l7;

import android.webkit.MimeTypeMap;
import g7.h0;
import g7.t;
import hi.b0;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.r;
import l7.k;
import mh.x;

/* loaded from: classes.dex */
public final class n implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16757a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16758b;

    public static final class a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            if (r.a(h0Var.f11506c, "jar:file")) {
                return new n(h0Var, mVar);
            }
            return null;
        }
    }

    public n(h0 h0Var, w7.m mVar) {
        this.f16757a = h0Var;
        this.f16758b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) throws IOException {
        h0 h0Var = this.f16757a;
        String str = h0Var.f11508e;
        if (str == null) {
            str = "";
        }
        int iX = x.x(str, '!', 0, 6);
        if (iX == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + h0Var).toString());
        }
        String str2 = b0.f13033b;
        String strSubstring = str.substring(0, iX);
        r.d(strSubstring, "substring(...)");
        b0 b0VarA = b0.a.a(strSubstring);
        String strSubstring2 = str.substring(iX + 1, str.length());
        r.d(strSubstring2, "substring(...)");
        b0 b0VarA2 = b0.a.a(strSubstring2);
        hi.n nVar = this.f16758b.f31406f;
        r.e(nVar, "<this>");
        String mimeTypeFromExtension = null;
        j7.p pVarA = j7.r.a(b0VarA2, ii.m.c(b0VarA, nVar, new ii.i()), null, null, 28);
        String strT = x.T(b0VarA2.b(), '.', "");
        if (!x.A(strT)) {
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
