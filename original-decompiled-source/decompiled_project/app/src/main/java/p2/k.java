package p2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f21177a;

    /* renamed from: b, reason: collision with root package name */
    public final f f21178b;

    /* renamed from: c, reason: collision with root package name */
    public float f21179c;

    public k(int i10, f fVar) {
        this.f21177a = i10;
        this.f21178b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f10, vg.c cVar) {
        j jVar;
        k kVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f21176d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f21176d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, cVar);
            }
        }
        Object objInvoke = jVar.f21174b;
        ug.a aVar = ug.a.f29706a;
        int i11 = jVar.f21176d;
        if (i11 == 0) {
            pg.q.b(objInvoke);
            Float f11 = new Float(f10);
            jVar.f21173a = this;
            jVar.f21176d = 1;
            objInvoke = this.f21178b.invoke(f11, jVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            kVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = jVar.f21173a;
            pg.q.b(objInvoke);
        }
        kVar.f21179c += ((Number) objInvoke).floatValue();
        return f0.f21461a;
    }
}
