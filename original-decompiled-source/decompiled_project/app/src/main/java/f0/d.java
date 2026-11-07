package f0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<e> f8755a = new z0.b<>(new e[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    @Override // f0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p1.e eVar, vg.c cVar) {
        b bVar;
        p1.e eVar2;
        int i10;
        Object[] objArr;
        int i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f8752g;
            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f8752g = i12 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, cVar);
            }
        }
        Object obj = bVar.f8750e;
        ug.a aVar = ug.a.f29706a;
        int i13 = bVar.f8752g;
        if (i13 == 0) {
            q.b(obj);
            z0.b<e> bVar2 = this.f8755a;
            e[] eVarArr = bVar2.f34700a;
            int i14 = bVar2.f34702c;
            eVar2 = eVar;
            i10 = i14;
            objArr = eVarArr;
            i11 = 0;
            if (i11 < i10) {
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = bVar.f8749d;
            i11 = bVar.f8748c;
            objArr = bVar.f8747b;
            p1.e eVar3 = bVar.f8746a;
            q.b(obj);
            eVar2 = eVar3;
            i11++;
            if (i11 < i10) {
                e eVar4 = (e) objArr[i11];
                c cVar2 = new c(eVar2, 0);
                bVar.f8746a = eVar2;
                bVar.f8747b = objArr;
                bVar.f8748c = i11;
                bVar.f8749d = i10;
                bVar.f8752g = 1;
                if (n2.c.a(eVar4, cVar2, bVar) == aVar) {
                    return aVar;
                }
                i11++;
                if (i11 < i10) {
                    return f0.f21461a;
                }
            }
        }
    }
}
