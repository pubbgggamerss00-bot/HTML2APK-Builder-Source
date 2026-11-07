package nf;

import cf.d;
import cf.l;
import cf.t;
import df.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.h;

/* loaded from: classes2.dex */
public class c implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f18804a;

    public c(t tVar, l lVar) {
        this.f18804a = new h(tVar);
        tVar.R0(l.f5532w2, l.G2.f5545b);
        tVar.R0(l.f5509q2, lVar.f5545b);
    }

    public static c a(d dVar) throws IOException {
        List arrayList;
        if (!(dVar instanceof t)) {
            throw new IOException("Unexpected object type: ".concat(dVar.getClass().getName()));
        }
        t tVar = (t) dVar;
        String strJ0 = tVar.J0(l.f5509q2);
        l lVar = l.f5448a1;
        if (!lVar.f5545b.equals(strJ0)) {
            if (l.P0.f5545b.equals(strJ0)) {
                d dVarL0 = tVar.l0(l.Q0);
                return (dVarL0 == null || !l.f5528v2.equals(dVarL0.q0(l.f5459d2))) ? new qf.a(tVar) : new qf.b(tVar);
            }
            l lVar2 = l.S1;
            if (lVar2.f5545b.equals(strJ0)) {
                return new b(tVar, lVar2);
            }
            throw new IOException(m3.a.a("Invalid XObject Subtype: ", strJ0));
        }
        rf.a aVar = new rf.a(new h(tVar), lVar);
        l lVar3 = l.B0;
        cf.b bVarV0 = tVar.v0(lVar3);
        cf.h hVarU0 = null;
        if (bVarV0 instanceof l) {
            l lVar4 = (l) bVarV0;
            arrayList = new jf.a(lVar4, lVar4, tVar, lVar3);
        } else {
            arrayList = bVarV0 instanceof cf.a ? new ArrayList(((cf.a) bVarV0).f5416b) : null;
        }
        if (arrayList != null && !arrayList.isEmpty() && l.f5466f1.equals(arrayList.get(arrayList.size() - 1))) {
            Iterator it = Arrays.asList(l.E2, l.T0, l.T).iterator();
            while (it.hasNext()) {
                if (!tVar.f5423b.containsKey((l) it.next())) {
                    try {
                        hVarU0 = tVar.U0();
                        List<j> list = hVarU0.f5439a;
                        tVar.g0((list.isEmpty() ? j.f7967b : list.get(list.size() - 1)).f7968a);
                        return aVar;
                    } finally {
                        ef.a.b(hVarU0);
                    }
                }
            }
        }
        return aVar;
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f18804a.f15719a;
    }

    public c(h hVar, l lVar) {
        this.f18804a = hVar;
        t tVar = hVar.f15719a;
        tVar.R0(l.f5532w2, l.G2.f5545b);
        tVar.R0(l.f5509q2, lVar.f5545b);
    }
}
