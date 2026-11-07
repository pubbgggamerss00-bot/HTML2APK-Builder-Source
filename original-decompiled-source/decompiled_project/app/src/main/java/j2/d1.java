package j2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class d1 implements y3, ph.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f14694a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.e0 f14695b;

    /* renamed from: c, reason: collision with root package name */
    public final ph.i0 f14696c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f14697d = new AtomicReference(null);

    public d1(View view, y2.e0 e0Var, ph.i0 i0Var) {
        this.f14694a = view;
        this.f14695b = e0Var;
        this.f14696c = i0Var;
    }

    @Override // j2.x3
    public final View a() {
        return this.f14694a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j2.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(k0.p1 p1Var, vg.c cVar) {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i10 = z0Var.f15008c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                z0Var.f15008c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                z0Var = new z0(this, cVar);
            }
        }
        Object obj = z0Var.f15006a;
        ug.a aVar = ug.a.f29706a;
        int i11 = z0Var.f15008c;
        if (i11 == 0) {
            pg.q.b(obj);
            b1 b1Var = new b1(p1Var, this);
            c1 c1Var = new c1(this, null);
            z0Var.f15008c = 1;
            if (ph.j0.c(new j1.k(b1Var, this.f14697d, c1Var, null), z0Var) == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new pg.g();
    }

    @Override // ph.i0
    public final tg.h getCoroutineContext() {
        return this.f14696c.getCoroutineContext();
    }
}
