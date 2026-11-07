package g2;

import g2.d0;
import g2.g1;
import i2.w;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<a, Integer> f11361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.c f11362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f11363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<g1.a, pg.f0> f11364f;

    public e0(int i10, int i11, Map map, d0.c cVar, d0 d0Var, eh.l lVar) {
        this.f11359a = i10;
        this.f11360b = i11;
        this.f11361c = map;
        this.f11362d = cVar;
        this.f11363e = d0Var;
        this.f11364f = lVar;
    }

    @Override // g2.m0
    public final int a() {
        return this.f11359a;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f11360b;
    }

    @Override // g2.m0
    public final Map<a, Integer> r() {
        return this.f11361c;
    }

    @Override // g2.m0
    public final void s() {
        w.a aVar;
        i2.e0 e0Var = this.f11363e.f11324a;
        boolean zI0 = this.f11362d.I0();
        eh.l<g1.a, pg.f0> lVar = this.f11364f;
        if (!zI0 || (aVar = e0Var.I.f13790b.W) == null) {
            lVar.invoke(e0Var.I.f13790b.f13939j);
        } else {
            lVar.invoke(aVar.f13939j);
        }
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return null;
    }
}
