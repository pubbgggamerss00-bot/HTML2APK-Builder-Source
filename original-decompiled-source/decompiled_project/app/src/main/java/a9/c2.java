package a9;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.c;
import ph.g2;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f175a = 0;

    public static final Object a(ph.p0[] p0VarArr, vg.i iVar) throws Throwable {
        if (p0VarArr.length == 0) {
            return qg.z.f22752a;
        }
        ph.c cVar = new ph.c(p0VarArr);
        ph.m mVar = new ph.m(1, ah.p.c(iVar));
        mVar.p();
        int length = p0VarArr.length;
        c.a[] aVarArr = new c.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            ph.p0 p0Var = p0VarArr[i10];
            p0Var.start();
            c.a aVar = new c.a(mVar);
            aVar.f21509f = ph.v1.g(p0Var, aVar);
            pg.f0 f0Var = pg.f0.f21461a;
            aVarArr[i10] = aVar;
        }
        c.b bVar = new c.b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c.a aVar2 = aVarArr[i11];
            aVar2.getClass();
            c.a.f21507h.set(aVar2, bVar);
        }
        if (ph.m.f21564g.get(mVar) instanceof g2) {
            mVar.t(bVar);
        } else {
            bVar.a();
        }
        Object objO = mVar.o();
        ug.a aVar3 = ug.a.f29706a;
        return objO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(List list, vg.c cVar) {
        ph.e eVar;
        Iterator it;
        if (cVar instanceof ph.e) {
            eVar = (ph.e) cVar;
            int i10 = eVar.f21524c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f21524c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new ph.e(cVar);
            }
        }
        Object obj = eVar.f21523b;
        ug.a aVar = ug.a.f29706a;
        int i11 = eVar.f21524c;
        if (i11 == 0) {
            pg.q.b(obj);
            it = list.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = eVar.f21522a;
            pg.q.b(obj);
        }
        while (it.hasNext()) {
            ph.s1 s1Var = (ph.s1) it.next();
            eVar.f21522a = it;
            eVar.f21524c = 1;
            if (s1Var.join(eVar) == aVar) {
                return aVar;
            }
        }
        return pg.f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ph.s1[] s1VarArr, vg.c cVar) {
        ph.d dVar;
        int i10;
        ph.s1[] s1VarArr2;
        int length;
        if (cVar instanceof ph.d) {
            dVar = (ph.d) cVar;
            int i11 = dVar.f21520e;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f21520e = i11 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new ph.d(cVar);
            }
        }
        Object obj = dVar.f21519d;
        ug.a aVar = ug.a.f29706a;
        int i12 = dVar.f21520e;
        if (i12 == 0) {
            pg.q.b(obj);
            i10 = 0;
            s1VarArr2 = s1VarArr;
            length = s1VarArr.length;
            if (i10 < length) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = dVar.f21518c;
            i10 = dVar.f21517b;
            ph.s1[] s1VarArr3 = (ph.s1[]) dVar.f21516a;
            pg.q.b(obj);
            s1VarArr2 = s1VarArr3;
            i10++;
            if (i10 < length) {
                ph.s1 s1Var = s1VarArr2[i10];
                dVar.f21516a = s1VarArr2;
                dVar.f21517b = i10;
                dVar.f21518c = length;
                dVar.f21520e = 1;
                if (s1Var.join(dVar) == aVar) {
                    return aVar;
                }
                i10++;
                if (i10 < length) {
                    return pg.f0.f21461a;
                }
            }
        }
    }
}
