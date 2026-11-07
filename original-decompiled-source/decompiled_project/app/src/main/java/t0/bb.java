package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class bb implements b2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f25541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f25542b;

    public bb(hb hbVar, eh.l lVar) {
        v.t0 t0Var = v.t0.f30083a;
        this.f25541a = hbVar;
        this.f25542b = lVar;
    }

    @Override // b2.a
    public final Object e0(long j10, tg.e<? super f3.w> eVar) {
        v.t0 t0Var = v.t0.f30083a;
        float fC = f3.w.c(j10);
        hb hbVar = this.f25541a;
        float fG = hbVar.f26015b.g();
        float fA = hbVar.f26015b.e().a();
        if (fC >= CropImageView.DEFAULT_ASPECT_RATIO || fG <= fA) {
            j10 = 0;
        } else {
            this.f25542b.invoke(new Float(fC));
        }
        return new f3.w(j10);
    }

    @Override // b2.a
    public final long n1(long j10, long j11, int i10) {
        if (i10 != 1) {
            return 0L;
        }
        u0.a0<ib> a0Var = this.f25541a.f26015b;
        v.t0 t0Var = v.t0.f30083a;
        return p1.d.a(CropImageView.DEFAULT_ASPECT_RATIO, a0Var.d(p1.c.e(j11)));
    }

    @Override // b2.a
    public final long v0(int i10, long j10) {
        v.t0 t0Var = v.t0.f30083a;
        float fE = p1.c.e(j10);
        if (fE >= CropImageView.DEFAULT_ASPECT_RATIO || i10 != 1) {
            return 0L;
        }
        return p1.d.a(CropImageView.DEFAULT_ASPECT_RATIO, this.f25541a.f26015b.d(fE));
    }

    @Override // b2.a
    public final Object x1(long j10, long j11, tg.e<? super f3.w> eVar) {
        v.t0 t0Var = v.t0.f30083a;
        this.f25542b.invoke(new Float(f3.w.c(j11)));
        return new f3.w(j11);
    }
}
