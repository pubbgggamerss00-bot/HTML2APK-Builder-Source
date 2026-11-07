package uh;

/* loaded from: classes2.dex */
public class r<T> extends ph.a<T> implements vg.d {

    /* renamed from: d, reason: collision with root package name */
    public final tg.e<T> f29766d;

    public r(tg.e eVar, tg.h hVar) {
        super(hVar, true);
        this.f29766d = eVar;
    }

    @Override // ph.y1
    public final boolean H() {
        return true;
    }

    public void c0() {
    }

    @Override // vg.d
    public final vg.d getCallerFrame() {
        tg.e<T> eVar = this.f29766d;
        if (eVar instanceof vg.d) {
            return (vg.d) eVar;
        }
        return null;
    }

    @Override // ph.y1
    public void i(Object obj) {
        g.a(f1.m.g(obj), ah.p.c(this.f29766d));
    }

    @Override // ph.y1
    public void j(Object obj) {
        this.f29766d.resumeWith(f1.m.g(obj));
    }
}
