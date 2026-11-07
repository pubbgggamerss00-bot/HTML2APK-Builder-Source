package i2;

import g2.g1;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 implements g2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<g2.a, Integer> f13950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<g1.a, pg.f0> f13951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f13952e;

    public m0(int i10, int i11, Map map, eh.l lVar, l0 l0Var) {
        this.f13948a = i10;
        this.f13949b = i11;
        this.f13950c = map;
        this.f13951d = lVar;
        this.f13952e = l0Var;
    }

    @Override // g2.m0
    public final int a() {
        return this.f13948a;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f13949b;
    }

    @Override // g2.m0
    public final Map<g2.a, Integer> r() {
        return this.f13950c;
    }

    @Override // g2.m0
    public final void s() {
        this.f13951d.invoke(this.f13952e.f13939j);
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return null;
    }
}
