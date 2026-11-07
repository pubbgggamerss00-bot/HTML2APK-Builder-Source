package qg;

import android.os.LocaleList;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.e2;
import t.b1;
import v.l1;
import v.y0;
import v.z0;

/* loaded from: classes2.dex */
public final class n0 {
    public static rg.g a(rg.g gVar) {
        rg.c<E, ?> cVar = gVar.f23575a;
        cVar.e();
        return cVar.f23559j > 0 ? gVar : rg.g.f23574b;
    }

    public static LinkedHashSet b(Set set, Object obj) {
        kotlin.jvm.internal.r.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.a(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.r.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set c(Set set, Iterable iterable) {
        kotlin.jvm.internal.r.e(set, "<this>");
        Collection<?> collectionC0 = iterable instanceof Collection ? (Collection) iterable : x.c0(iterable);
        if (collectionC0.isEmpty()) {
            return x.h0(set);
        }
        if (!(collectionC0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionC0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet d(Set set, Object obj) {
        kotlin.jvm.internal.r.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t2.l0 e(t2.l0 l0Var, f3.r rVar) {
        e3.a aVar;
        e3.l lVar;
        long j10;
        x2.p pVar;
        long j11;
        e3.n nVar;
        int i10;
        int i11;
        e3.o oVar;
        t2.b0 b0Var = l0Var.f27852a;
        e3.l lVar2 = t2.d0.f27796d;
        e3.l lVarM = b0Var.f27775a.m(t2.c0.f27791a);
        long j12 = b0Var.f27776b;
        f3.v[] vVarArr = f3.t.f8832b;
        if ((j12 & 1095216660480L) == 0) {
            j12 = t2.d0.f27793a;
        }
        long j13 = j12;
        x2.p pVar2 = b0Var.f27777c;
        if (pVar2 == null) {
            pVar2 = x2.p.f32030c;
        }
        x2.p pVar3 = pVar2;
        x2.n nVar2 = b0Var.f27778d;
        x2.n nVar3 = new x2.n(nVar2 != null ? nVar2.f32027a : 0);
        x2.o oVar2 = b0Var.f27779e;
        x2.o oVar3 = new x2.o(oVar2 != null ? oVar2.f32028a : 65535);
        x2.f fVar = b0Var.f27780f;
        if (fVar == null) {
            fVar = x2.f.f32014a;
        }
        x2.f fVar2 = fVar;
        String str = b0Var.f27781g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j14 = b0Var.f27782h;
        if ((j14 & 1095216660480L) == 0) {
            j14 = t2.d0.f27794b;
        }
        e3.a aVar2 = b0Var.f27783i;
        e3.a aVar3 = new e3.a(aVar2 != null ? aVar2.f8345a : CropImageView.DEFAULT_ASPECT_RATIO);
        e3.m mVar = b0Var.f27784j;
        if (mVar == null) {
            mVar = e3.m.f8372c;
        }
        e3.m mVar2 = mVar;
        a3.c cVar = b0Var.f27785k;
        if (cVar == null) {
            a3.c cVar2 = a3.c.f24c;
            a3.a aVar4 = a3.d.f27a;
            aVar4.getClass();
            LocaleList localeList = LocaleList.getDefault();
            aVar = aVar3;
            synchronized (aVar4.f22c) {
                lVar = lVarM;
                a3.c cVar3 = aVar4.f21b;
                if (cVar3 == null || localeList != aVar4.f20a) {
                    int size = localeList.size();
                    j10 = j13;
                    ArrayList arrayList = new ArrayList(size);
                    int i12 = 0;
                    while (i12 < size) {
                        arrayList.add(new a3.b(localeList.get(i12)));
                        i12++;
                        size = size;
                        pVar3 = pVar3;
                    }
                    pVar = pVar3;
                    a3.c cVar4 = new a3.c(arrayList);
                    aVar4.f20a = localeList;
                    aVar4.f21b = cVar4;
                    cVar = cVar4;
                } else {
                    pVar = pVar3;
                    cVar = cVar3;
                    j10 = j13;
                }
            }
        } else {
            aVar = aVar3;
            lVar = lVarM;
            j10 = j13;
            pVar = pVar3;
        }
        long j15 = b0Var.f27786l;
        if (j15 == 16) {
            j15 = t2.d0.f27795c;
        }
        e3.i iVar = b0Var.f27787m;
        if (iVar == null) {
            iVar = e3.i.f8364b;
        }
        e2 e2Var = b0Var.f27788n;
        if (e2Var == null) {
            e2Var = e2.f21687d;
        }
        t2.w wVar = b0Var.f27789o;
        s1.f fVar3 = b0Var.f27790p;
        if (fVar3 == null) {
            fVar3 = s1.h.f24186a;
        }
        e3.i iVar2 = iVar;
        t2.b0 b0Var2 = new t2.b0(lVar, j10, pVar, nVar3, oVar3, fVar2, str2, j14, aVar, mVar2, cVar, j15, iVar2, e2Var, wVar, fVar3);
        t2.s sVar = l0Var.f27853b;
        int i13 = t2.t.f27885b;
        int i14 = sVar.f27875a;
        int i15 = 5;
        if (i14 == Integer.MIN_VALUE) {
            i14 = 5;
        }
        int i16 = sVar.f27876b;
        if (i16 != 3) {
            if (i16 == Integer.MIN_VALUE) {
                int iOrdinal = rVar.ordinal();
                if (iOrdinal == 0) {
                    i16 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new pg.l();
                    }
                    i15 = 2;
                }
            }
            j11 = sVar.f27877c;
            if ((j11 & 1095216660480L) == 0) {
                j11 = t2.t.f27884a;
            }
            nVar = sVar.f27878d;
            if (nVar == null) {
                nVar = e3.n.f8375c;
            }
            long j16 = j11;
            t2.v vVar = sVar.f27879e;
            e3.f fVar4 = sVar.f27880f;
            i10 = sVar.f27881g;
            if (i10 == 0) {
                i10 = e3.e.f8350b;
            }
            i11 = sVar.f27882h;
            if (i11 == Integer.MIN_VALUE) {
                i11 = 1;
            }
            oVar = sVar.f27883i;
            if (oVar == null) {
                oVar = e3.o.f8378c;
            }
            return new t2.l0(b0Var2, new t2.s(i14, i16, j16, nVar, vVar, fVar4, i10, i11, oVar), l0Var.f27854c);
        }
        int iOrdinal2 = rVar.ordinal();
        if (iOrdinal2 == 0) {
            i15 = 4;
        } else if (iOrdinal2 != 1) {
            throw new pg.l();
        }
        i16 = i15;
        j11 = sVar.f27877c;
        if ((j11 & 1095216660480L) == 0) {
        }
        nVar = sVar.f27878d;
        if (nVar == null) {
        }
        long j162 = j11;
        t2.v vVar2 = sVar.f27879e;
        e3.f fVar42 = sVar.f27880f;
        i10 = sVar.f27881g;
        if (i10 == 0) {
        }
        i11 = sVar.f27882h;
        if (i11 == Integer.MIN_VALUE) {
        }
        oVar = sVar.f27883i;
        if (oVar == null) {
        }
        return new t2.l0(b0Var2, new t2.s(i14, i16, j162, nVar, vVar2, fVar42, i10, i11, oVar), l0Var.f27854c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(l1 l1Var, float f10, vg.c cVar) {
        y0 y0Var;
        kotlin.jvm.internal.d0 d0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i10 = y0Var.f30124c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                y0Var.f30124c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                y0Var = new y0(cVar);
            }
        }
        Object obj = y0Var.f30123b;
        Object obj2 = ug.a.f29706a;
        int i11 = y0Var.f30124c;
        if (i11 == 0) {
            pg.q.b(obj);
            kotlin.jvm.internal.d0 d0Var2 = new kotlin.jvm.internal.d0();
            eh.p z0Var = new z0(d0Var2, f10, null);
            y0Var.f30122a = d0Var2;
            y0Var.f30124c = 1;
            if (l1Var.c(b1.f25167a, z0Var, y0Var) == obj2) {
                return obj2;
            }
            d0Var = d0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = y0Var.f30122a;
            pg.q.b(obj);
        }
        return new Float(d0Var.f16322a);
    }

    public static Set g(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.r.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
