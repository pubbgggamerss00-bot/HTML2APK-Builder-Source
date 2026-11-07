package i0;

import i0.d2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f13619a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.x2 f13620b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.c0 f13621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13622d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13623e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.p3 f13624f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.v f13625g;

    /* renamed from: h, reason: collision with root package name */
    public final y4 f13626h;

    /* renamed from: i, reason: collision with root package name */
    public final s1 f13627i;

    /* renamed from: j, reason: collision with root package name */
    public final d2.a f13628j;

    /* renamed from: k, reason: collision with root package name */
    public final eh.l<y2.c0, pg.f0> f13629k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13630l;

    public u3() {
        throw null;
    }

    public u3(i2 i2Var, m0.x2 x2Var, y2.c0 c0Var, boolean z10, boolean z11, m0.p3 p3Var, y2.v vVar, y4 y4Var, s1 s1Var, eh.l lVar, int i10) {
        this.f13619a = i2Var;
        this.f13620b = x2Var;
        this.f13621c = c0Var;
        this.f13622d = z10;
        this.f13623e = z11;
        this.f13624f = p3Var;
        this.f13625g = vVar;
        this.f13626h = y4Var;
        this.f13627i = s1Var;
        this.f13628j = d2.f13253a;
        this.f13629k = lVar;
        this.f13630l = i10;
    }

    public final void a(List<? extends y2.i> list) {
        y2.j jVar = this.f13619a.f13340d;
        ArrayList arrayListE0 = qg.x.e0(list);
        arrayListE0.add(0, new y2.l());
        this.f13629k.invoke(jVar.a(arrayListE0));
    }
}
