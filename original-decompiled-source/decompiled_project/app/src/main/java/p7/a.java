package p7;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import b8.t;
import g7.h0;
import kotlin.jvm.internal.r;
import w7.m;

/* loaded from: classes.dex */
public final class a implements c<h0> {
    @Override // p7.c
    public final String a(h0 h0Var, m mVar) {
        h0 h0Var2 = h0Var;
        if (!r.a(h0Var2.f11506c, "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h0Var2);
        sb.append(':');
        Configuration configuration = mVar.f31401a.getResources().getConfiguration();
        Bitmap.Config[] configArr = t.f3682a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
