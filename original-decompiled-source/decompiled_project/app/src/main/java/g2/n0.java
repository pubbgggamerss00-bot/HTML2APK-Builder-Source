package g2;

import g2.g1;
import java.util.Map;

/* loaded from: classes.dex */
public final class n0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11410b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<a, Integer> f11411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f11413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<g1.a, pg.f0> f11414f;

    public n0(int i10, int i11, Map map, o0 o0Var, eh.l lVar) {
        this.f11412d = i10;
        this.f11413e = o0Var;
        this.f11414f = lVar;
        this.f11409a = i10;
        this.f11410b = i11;
        this.f11411c = map;
    }

    @Override // g2.m0
    public final int a() {
        return this.f11409a;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f11410b;
    }

    @Override // g2.m0
    public final Map<a, Integer> r() {
        return this.f11411c;
    }

    @Override // g2.m0
    public final void s() {
        o0 o0Var = this.f11413e;
        boolean z10 = o0Var instanceof i2.l0;
        eh.l<g1.a, pg.f0> lVar = this.f11414f;
        if (z10) {
            lVar.invoke(((i2.l0) o0Var).f13939j);
        } else {
            lVar.invoke(new o1(this.f11412d, o0Var.getLayoutDirection()));
        }
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return null;
    }
}
