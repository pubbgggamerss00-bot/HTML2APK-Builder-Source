package l7;

import android.graphics.Bitmap;
import g7.h0;
import g7.i0;
import g7.t;
import kotlin.jvm.internal.r;
import l7.k;
import qg.x;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16736a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16737b;

    /* renamed from: l7.a$a, reason: collision with other inner class name */
    public static final class C0167a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            Bitmap.Config[] configArr = b8.t.f3682a;
            if (r.a(h0Var.f11506c, "file") && r.a(x.D(i0.d(h0Var)), "android_asset")) {
                return new a(h0Var, mVar);
            }
            return null;
        }
    }

    public a(h0 h0Var, w7.m mVar) {
        this.f16736a = h0Var;
        this.f16737b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        String strI = x.I(x.y(1, i0.d(this.f16736a)), "/", null, null, null, 62);
        w7.m mVar = this.f16737b;
        return new p(new j7.t(hi.x.b(hi.x.h(mVar.f31401a.getAssets().open(strI))), mVar.f31406f, new j7.a(strI)), b8.n.a(strI), j7.f.f15222c);
    }
}
