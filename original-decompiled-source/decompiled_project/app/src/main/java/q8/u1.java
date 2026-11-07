package q8;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class u1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f22403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22404c;

    public u1(eh.a<pg.f0> aVar, x0.l1 l1Var, eh.a<pg.f0> aVar2) {
        this.f22402a = aVar;
        this.f22403b = l1Var;
        this.f22404c = aVar2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), h0.f.a(16), t0.z0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25770p, jVar2, 0), null, null, f1.c.b(1275995969, new t1(this.f22402a, this.f22403b, this.f22404c), jVar2), jVar2, 196614, 24);
        }
        return pg.f0.f21461a;
    }
}
