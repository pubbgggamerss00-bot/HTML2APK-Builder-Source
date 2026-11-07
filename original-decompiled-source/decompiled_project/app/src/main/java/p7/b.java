package p7;

import android.graphics.Bitmap;
import b8.t;
import g7.h0;
import g7.i0;
import g7.k;
import hi.b0;
import hi.n;
import kotlin.jvm.internal.r;
import qg.x;
import w7.g;
import w7.m;

/* loaded from: classes.dex */
public final class b implements c<h0> {
    @Override // p7.c
    public final String a(h0 h0Var, m mVar) {
        String strC;
        h0 h0Var2 = h0Var;
        String str = h0Var2.f11506c;
        if ((str != null && !str.equals("file")) || h0Var2.f11508e == null) {
            return null;
        }
        Bitmap.Config[] configArr = t.f3682a;
        if ((r.a(h0Var2.f11506c, "file") && r.a(x.D(i0.d(h0Var2)), "android_asset")) || !((Boolean) k.b(mVar, g.f31389c)).booleanValue() || (strC = i0.c(h0Var2)) == null) {
            return null;
        }
        n nVar = mVar.f31406f;
        String str2 = b0.f13033b;
        Long l10 = nVar.Z(b0.a.a(strC)).f13091f;
        StringBuilder sb = new StringBuilder();
        sb.append(h0Var2);
        sb.append('-');
        sb.append(l10);
        return sb.toString();
    }
}
