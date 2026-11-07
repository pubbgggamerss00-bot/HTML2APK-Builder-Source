package v;

import java.util.concurrent.CancellationException;
import v.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<f.a> f29787a = new z0.b<>(new f.a[16]);

    public final void a(CancellationException cancellationException) {
        z0.b<f.a> bVar = this.f29787a;
        int i10 = bVar.f34702c;
        ph.k[] kVarArr = new ph.k[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            kVarArr[i11] = bVar.f34700a[i11].f29837b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            kVarArr[i12].cancel(cancellationException);
        }
        if (bVar.f34702c == 0) {
            return;
        }
        y.c.c("uncancelled requests present");
    }

    public final void b() {
        z0.b<f.a> bVar = this.f29787a;
        jh.g gVarQ = jh.j.q(0, bVar.f34702c);
        int i10 = gVarQ.f15744a;
        int i11 = gVarQ.f15745b;
        if (i10 <= i11) {
            while (true) {
                bVar.f34700a[i10].f29837b.resumeWith(pg.f0.f21461a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        bVar.g();
    }
}
