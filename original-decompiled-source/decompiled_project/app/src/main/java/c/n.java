package c;

import b.w;
import pg.f0;
import ph.i0;

/* loaded from: classes.dex */
public final class n extends w {

    /* renamed from: d, reason: collision with root package name */
    public i0 f4322d;

    /* renamed from: e, reason: collision with root package name */
    public eh.p<? super sh.f<b.c>, ? super tg.e<? super f0>, ? extends Object> f4323e;

    /* renamed from: f, reason: collision with root package name */
    public m f4324f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4325g;

    public n() {
        throw null;
    }

    @Override // b.w
    public final void a() {
        m mVar = this.f4324f;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.f4324f;
        if (mVar2 != null) {
            mVar2.f4319a = false;
        }
        this.f4325g = false;
    }

    @Override // b.w
    public final void b() {
        m mVar = this.f4324f;
        if (mVar != null && !mVar.f4319a) {
            mVar.a();
            this.f4324f = null;
        }
        if (this.f4324f == null) {
            this.f4324f = new m(this.f4322d, false, this.f4323e, this);
        }
        m mVar2 = this.f4324f;
        if (mVar2 != null) {
            mVar2.f4320b.m(null);
        }
        m mVar3 = this.f4324f;
        if (mVar3 != null) {
            mVar3.f4319a = false;
        }
        this.f4325g = false;
    }

    @Override // b.w
    public final void c(b.c cVar) {
        super.c(cVar);
        m mVar = this.f4324f;
        if (mVar != null) {
            mVar.f4320b.g(cVar);
        }
    }

    @Override // b.w
    public final void d(b.c cVar) {
        super.d(cVar);
        m mVar = this.f4324f;
        if (mVar != null) {
            mVar.a();
        }
        if (this.f3277a) {
            this.f4324f = new m(this.f4322d, true, this.f4323e, this);
        }
        this.f4325g = true;
    }
}
