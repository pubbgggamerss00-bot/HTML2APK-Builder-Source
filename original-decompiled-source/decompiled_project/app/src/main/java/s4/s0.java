package s4;

import java.io.FileOutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s0<T> extends k0<T> implements p1<T> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s4.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, vg.c cVar) {
        r0 r0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i10 = r0Var.f24389e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                r0Var.f24389e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                r0Var = new r0(this, cVar);
            }
        }
        Object obj2 = r0Var.f24387c;
        ug.a aVar = ug.a.f29706a;
        int i11 = r0Var.f24389e;
        if (i11 == 0) {
            pg.q.b(obj2);
            if (this.f24286c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f24284a);
            try {
                b1<T> b1Var = this.f24285b;
                m1 m1Var = new m1(fileOutputStream3);
                r0Var.f24385a = fileOutputStream3;
                r0Var.f24386b = fileOutputStream3;
                r0Var.f24389e = 1;
                if (b1Var.b(obj, m1Var) == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = r0Var.f24386b;
            fileOutputStream = r0Var.f24385a;
            try {
                pg.q.b(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ah.c.a(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        pg.f0 f0Var = pg.f0.f21461a;
        ah.c.a(fileOutputStream, null);
        return pg.f0.f21461a;
    }
}
