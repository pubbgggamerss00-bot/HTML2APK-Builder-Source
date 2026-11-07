package androidx.room;

import androidx.room.c1;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u implements s.t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3091a;

    public u(int i10) {
        this.f3091a = sh.a1.a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(c1.b bVar, vg.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f3087c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f3087c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(this, cVar);
            }
        }
        Object obj = tVar.f3085a;
        ug.a aVar = ug.a.f29706a;
        int i11 = tVar.f3087c;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        sh.z0 z0Var = (sh.z0) this.f3091a;
        tVar.f3087c = 1;
        z0Var.b(bVar, tVar);
    }

    public void b(Set tableIds) {
        Object value;
        int[] iArr;
        kotlin.jvm.internal.r.e(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        sh.z0 z0Var = (sh.z0) this.f3091a;
        do {
            value = z0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!z0Var.a(value, iArr));
    }

    @Override // s.t
    public s.f0 get(int i10) {
        return (s.g0) this.f3091a;
    }

    public u(float f10, float f11) {
        this.f3091a = new s.g0(f10, f11, 0.01f);
    }
}
