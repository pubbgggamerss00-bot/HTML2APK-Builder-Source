package g2;

import g2.g1;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11355b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<a, Integer> f11356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<g1.a, pg.f0> f11357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f11358e;

    public e(int i10, int i11, Map map, eh.l lVar, f fVar) {
        this.f11357d = lVar;
        this.f11358e = fVar;
        this.f11354a = i10;
        this.f11355b = i11;
        this.f11356c = map;
    }

    @Override // g2.m0
    public final int a() {
        return this.f11354a;
    }

    @Override // g2.m0
    public final int getHeight() {
        return this.f11355b;
    }

    @Override // g2.m0
    public final Map<a, Integer> r() {
        return this.f11356c;
    }

    @Override // g2.m0
    public final void s() {
        this.f11357d.invoke(this.f11358e.f11365a.f13939j);
    }

    @Override // g2.m0
    public final eh.l<Object, pg.f0> t() {
        return null;
    }
}
