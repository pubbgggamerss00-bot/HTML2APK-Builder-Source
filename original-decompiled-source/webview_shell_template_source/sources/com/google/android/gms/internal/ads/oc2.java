package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oc2 extends zy {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f7705k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f7706b;

    /* renamed from: c, reason: collision with root package name */
    public final oi2 f7707c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7708d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7709e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f7710f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7711g;
    public final zy[] h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f7712i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f7713j;

    /* JADX WARN: Illegal instructions before constructor call */
    public oc2(List list, oi2 oi2Var) {
        zy[] zyVarArr = new zy[list.size()];
        Iterator it = list.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            zyVarArr[i7] = ((yb2) it.next()).zza();
            i7++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i6] = ((yb2) it2.next()).zzb();
            i6++;
        }
        this(zyVarArr, objArr, oi2Var);
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int a(Object obj) {
        int iA;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f7713j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iA = this.h[iIntValue].a(obj3)) != -1) {
                return this.f7710f[iIntValue] + iA;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int b() {
        return this.f7709e;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int c() {
        return this.f7708d;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final jx d(int i6, jx jxVar, boolean z6) {
        int[] iArr = this.f7710f;
        int i7 = j31.i(iArr, i6 + 1, false, false);
        int i8 = this.f7711g[i7];
        this.h[i7].d(i6 - iArr[i7], jxVar, z6);
        jxVar.f6182c += i8;
        if (z6) {
            Object obj = this.f7712i[i7];
            Object obj2 = jxVar.f6181b;
            obj2.getClass();
            jxVar.f6181b = Pair.create(obj, obj2);
        }
        return jxVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final cy e(int i6, cy cyVar, long j6) {
        int[] iArr = this.f7711g;
        int i7 = j31.i(iArr, i6 + 1, false, false);
        int i8 = iArr[i7];
        int i9 = this.f7710f[i7];
        this.h[i7].e(i6 - i8, cyVar, j6);
        Object objCreate = this.f7712i[i7];
        if (!cy.f3686m.equals(cyVar.f3688a)) {
            objCreate = Pair.create(objCreate, cyVar.f3688a);
        }
        cyVar.f3688a = objCreate;
        cyVar.f3697k += i9;
        cyVar.f3698l += i9;
        return cyVar;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final Object f(int i6) {
        int[] iArr = this.f7710f;
        int i7 = j31.i(iArr, i6 + 1, false, false);
        return Pair.create(this.f7712i[i7], this.h[i7].f(i6 - iArr[i7]));
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int g(boolean z6) {
        if (this.f7706b != 0) {
            int iP = 0;
            if (z6) {
                int[] iArr = this.f7707c.f7781b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                zy[] zyVarArr = this.h;
                if (!zyVarArr[iP].o()) {
                    return zyVarArr[iP].g(z6) + this.f7711g[iP];
                }
                iP = p(iP, z6);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int h(boolean z6) {
        int iQ;
        int i6 = this.f7706b;
        if (i6 != 0) {
            if (z6) {
                int[] iArr = this.f7707c.f7781b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i6 - 1;
            }
            do {
                zy[] zyVarArr = this.h;
                if (!zyVarArr[iQ].o()) {
                    return zyVarArr[iQ].h(z6) + this.f7711g[iQ];
                }
                iQ = q(iQ, z6);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int j(int i6, int i7, boolean z6) {
        int[] iArr = this.f7711g;
        int i8 = j31.i(iArr, i6 + 1, false, false);
        int i9 = iArr[i8];
        zy[] zyVarArr = this.h;
        int iJ = zyVarArr[i8].j(i6 - i9, i7 != 2 ? i7 : 0, z6);
        if (iJ != -1) {
            return i9 + iJ;
        }
        int iP = p(i8, z6);
        while (iP != -1 && zyVarArr[iP].o()) {
            iP = p(iP, z6);
        }
        if (iP != -1) {
            return zyVarArr[iP].g(z6) + iArr[iP];
        }
        if (i7 == 2) {
            return g(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final int k(int i6) {
        int[] iArr = this.f7711g;
        int i7 = j31.i(iArr, i6 + 1, false, false);
        int i8 = iArr[i7];
        zy[] zyVarArr = this.h;
        int iK = zyVarArr[i7].k(i6 - i8);
        if (iK != -1) {
            return i8 + iK;
        }
        int iQ = q(i7, false);
        while (iQ != -1 && zyVarArr[iQ].o()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return zyVarArr[iQ].h(false) + iArr[iQ];
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final jx n(Object obj, jx jxVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f7713j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i6 = this.f7711g[iIntValue];
        this.h[iIntValue].n(obj3, jxVar);
        jxVar.f6182c += i6;
        jxVar.f6181b = obj;
        return jxVar;
    }

    public final int p(int i6, boolean z6) {
        if (!z6) {
            if (i6 >= this.f7706b - 1) {
                return -1;
            }
            return i6 + 1;
        }
        oi2 oi2Var = this.f7707c;
        int i7 = oi2Var.f7782c[i6] + 1;
        int[] iArr = oi2Var.f7781b;
        if (i7 < iArr.length) {
            return iArr[i7];
        }
        return -1;
    }

    public final int q(int i6, boolean z6) {
        if (!z6) {
            if (i6 <= 0) {
                return -1;
            }
            return i6 - 1;
        }
        oi2 oi2Var = this.f7707c;
        int i7 = oi2Var.f7782c[i6] - 1;
        if (i7 >= 0) {
            return oi2Var.f7781b[i7];
        }
        return -1;
    }

    public oc2(zy[] zyVarArr, Object[] objArr, oi2 oi2Var) {
        this.f7707c = oi2Var;
        this.f7706b = oi2Var.f7781b.length;
        this.h = zyVarArr;
        int length = zyVarArr.length;
        this.f7710f = new int[length];
        this.f7711g = new int[length];
        this.f7712i = objArr;
        this.f7713j = new HashMap();
        int i6 = 0;
        int iC = 0;
        int iB = 0;
        int i7 = 0;
        while (i6 < zyVarArr.length) {
            zy zyVar = zyVarArr[i6];
            this.h[i7] = zyVar;
            this.f7711g[i7] = iC;
            this.f7710f[i7] = iB;
            iC += zyVar.c();
            iB += this.h[i7].b();
            this.f7713j.put(objArr[i7], Integer.valueOf(i7));
            i6++;
            i7++;
        }
        this.f7708d = iC;
        this.f7709e = iB;
    }
}
