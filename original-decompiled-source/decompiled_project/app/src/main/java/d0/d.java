package d0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class d implements g2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f7079b;

    /* renamed from: c, reason: collision with root package name */
    public ph.m f7080c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vg.c cVar) {
        c cVar2;
        ph.m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f7069d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f7069d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(this, cVar);
            }
        }
        Object obj = cVar2.f7067b;
        ug.a aVar = ug.a.f29706a;
        int i11 = cVar2.f7069d;
        if (i11 == 0) {
            pg.q.b(obj);
            if (!this.f7079b) {
                ph.m mVar2 = this.f7080c;
                cVar2.f7066a = mVar2;
                cVar2.f7069d = 1;
                ph.m mVar3 = new ph.m(1, ah.p.c(cVar2));
                mVar3.p();
                this.f7080c = mVar3;
                if (mVar3.o() == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            }
            return pg.f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = cVar2.f7066a;
        pg.q.b(obj);
        if (mVar != null) {
            mVar.resumeWith(pg.f0.f21461a);
        }
        return pg.f0.f21461a;
    }

    @Override // g2.x0
    public final void x() {
        if (this.f7079b) {
            return;
        }
        this.f7079b = true;
        ph.m mVar = this.f7080c;
        if (mVar != null) {
            mVar.resumeWith(pg.f0.f21461a);
        }
        this.f7080c = null;
    }
}
