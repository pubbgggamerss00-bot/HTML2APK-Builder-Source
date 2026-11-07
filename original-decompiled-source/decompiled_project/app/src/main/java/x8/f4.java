package x8;

import android.content.Context;
import androidx.compose.ui.d;
import x8.j6;

/* loaded from: classes.dex */
public final class f4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6.b f32615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f32617c;

    public f4(Context context, j6.b bVar, j6 j6Var) {
        this.f32615a = bVar;
        this.f32616b = j6Var;
        this.f32617c = context;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25770p, jVar2, 0), null, null, f1.c.b(-1871768464, new e4(this.f32617c, this.f32615a, this.f32616b), jVar2), jVar2, 196614, 24);
        }
        return pg.f0.f21461a;
    }
}
