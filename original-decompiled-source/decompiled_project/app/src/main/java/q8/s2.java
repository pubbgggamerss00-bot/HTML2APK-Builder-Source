package q8;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22382a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22384c;

    public /* synthetic */ s2(d1 d1Var, eh.a aVar, int i10) {
        this.f22383b = d1Var;
        this.f22384c = aVar;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        k8.i iVar;
        Object next;
        long j10;
        Object next2;
        int i10;
        Object next3;
        switch (this.f22382a) {
            case 0:
                ((Integer) obj2).getClass();
                t2.a((d1) this.f22383b, (eh.a) this.f22384c, (x0.j) obj, f3.i.n(1));
                break;
            default:
                u8.d1 d1Var = (u8.d1) this.f22383b;
                h1.u uVar = (h1.u) this.f22384c;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                k8.h hVar = d1Var.f29418b;
                sh.z0 z0Var = hVar.f16106m;
                sh.z0 z0Var2 = hVar.f16096c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object obj3 = null;
                if (jCurrentTimeMillis > hVar.f16117x) {
                    z0Var.getClass();
                    z0Var.j(null, 0);
                }
                int i11 = 1;
                int iIntValue = ((Number) z0Var.getValue()).intValue() + 1;
                if (iIntValue > 50) {
                    iIntValue = 50;
                }
                z0Var.j(null, Integer.valueOf(iIntValue));
                long j11 = 4000;
                for (Map.Entry<String, Integer> entry : ((k8.i) z0Var2.getValue()).f16133n.entrySet()) {
                    String key = entry.getKey();
                    int iIntValue2 = entry.getValue().intValue();
                    Iterator<T> it = k8.e.f16084c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next3 = it.next();
                            i10 = i11;
                            if (!((k8.a) next3).f16056a.equals(key)) {
                                i11 = i10;
                            }
                        } else {
                            i10 = i11;
                            next3 = obj3;
                        }
                    }
                    k8.a aVar = (k8.a) next3;
                    if (aVar != null && iIntValue2 > 0) {
                        j11 += (long) (aVar.f16064i * iIntValue2 * 1000.0d);
                    }
                    i11 = i10;
                    obj3 = null;
                }
                int i12 = i11;
                if (j11 > 9000) {
                    j11 = 9000;
                }
                hVar.f16117x = jCurrentTimeMillis + j11;
                sh.z0 z0Var3 = hVar.f16108o;
                Integer numValueOf = Integer.valueOf((int) (j11 / 1000));
                z0Var3.getClass();
                z0Var3.j(null, numValueOf);
                long jD = hVar.d((k8.i) z0Var2.getValue());
                double dG = hh.c.f13027a.g();
                k8.i iVar2 = (k8.i) z0Var2.getValue();
                double d10 = 0.03d;
                for (Map.Entry<String, Integer> entry2 : iVar2.f16133n.entrySet()) {
                    String key2 = entry2.getKey();
                    sh.z0 z0Var4 = z0Var;
                    int iIntValue3 = entry2.getValue().intValue();
                    Iterator<T> it2 = k8.e.f16084c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            j10 = jD;
                            if (!((k8.a) next2).f16056a.equals(key2)) {
                                jD = j10;
                            }
                        } else {
                            j10 = jD;
                            next2 = null;
                        }
                    }
                    k8.a aVar2 = (k8.a) next2;
                    if (aVar2 != null && iIntValue3 > 0) {
                        d10 = (iIntValue3 * aVar2.f16063h) + d10;
                    }
                    z0Var = z0Var4;
                    jD = j10;
                }
                sh.z0 z0Var5 = z0Var;
                long j12 = jD;
                for (Map.Entry<String, Integer> entry3 : iVar2.f16132m.entrySet()) {
                    String key3 = entry3.getKey();
                    int iIntValue4 = entry3.getValue().intValue();
                    Iterator<T> it3 = k8.e.f16083b.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((k8.m) next).f16158a.equals(key3)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    k8.m mVar = (k8.m) next;
                    if (mVar != null && iIntValue4 > 0) {
                        d10 = (mVar.f16164g * iIntValue4) + d10;
                    }
                }
                if (d10 > 0.5d) {
                    d10 = 0.5d;
                }
                long jLongValue = dG < d10 ? (((Number) z0Var5.getValue()).longValue() / 10) + 1 : 0L;
                do {
                    value = z0Var2.getValue();
                    iVar = (k8.i) value;
                } while (!z0Var2.a(value, k8.i.a(iVar, iVar.f16120a + j12, iVar.f16121b + jLongValue, 0, iVar.f16123d + j12, iVar.f16124e + 1, iVar.f16125f + jLongValue, 0, 0, 0L, null, null, null, null, null, 65476)));
                hVar.b(i12);
                uVar.add(new u8.g1(System.nanoTime(), fFloatValue, fFloatValue2, i8.n.d("+", u8.y.m(j12), " 🐾")));
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ s2(u8.d1 d1Var, h1.u uVar) {
        this.f22383b = d1Var;
        this.f22384c = uVar;
    }
}
