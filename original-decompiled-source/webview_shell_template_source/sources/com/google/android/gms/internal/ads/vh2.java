package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vh2 implements nh2, mh2 {
    public final nh2[] s;

    /* renamed from: t, reason: collision with root package name */
    public final IdentityHashMap f9870t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f9871u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f9872v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public mh2 f9873w;

    /* renamed from: x, reason: collision with root package name */
    public ui2 f9874x;

    /* renamed from: y, reason: collision with root package name */
    public nh2[] f9875y;

    /* renamed from: z, reason: collision with root package name */
    public bh2 f9876z;

    public vh2(long[] jArr, nh2... nh2VarArr) {
        this.s = nh2VarArr;
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        this.f9876z = new bh2(cp1Var, cp1Var);
        this.f9870t = new IdentityHashMap();
        this.f9875y = new nh2[0];
        for (int i6 = 0; i6 < nh2VarArr.length; i6++) {
            long j6 = jArr[i6];
            if (j6 != 0) {
                this.s[i6] = new si2(nh2VarArr[i6], j6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long a(long j6) {
        long jA = this.f9875y[0].a(j6);
        int i6 = 1;
        while (true) {
            nh2[] nh2VarArr = this.f9875y;
            if (i6 >= nh2VarArr.length) {
                return jA;
            }
            if (nh2VarArr[i6].a(jA) != jA) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final void b(long j6) {
        this.f9876z.b(j6);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void c(long j6) {
        for (nh2 nh2Var : this.f9875y) {
            nh2Var.c(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final /* bridge */ /* synthetic */ void d(ni2 ni2Var) {
        mh2 mh2Var = this.f9873w;
        mh2Var.getClass();
        mh2Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long e(long j6, tc2 tc2Var) {
        nh2[] nh2VarArr = this.f9875y;
        return (nh2VarArr.length > 0 ? nh2VarArr[0] : this.s[0]).e(j6, tc2Var);
    }

    @Override // com.google.android.gms.internal.ads.mh2
    public final void f(nh2 nh2Var) {
        nh2[] nh2VarArr;
        ArrayList arrayList = this.f9871u;
        arrayList.remove(nh2Var);
        if (arrayList.isEmpty()) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                nh2VarArr = this.s;
                if (i6 >= nh2VarArr.length) {
                    break;
                }
                i7 += nh2VarArr[i6].zzh().f9567a;
                i6++;
            }
            a00[] a00VarArr = new a00[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < nh2VarArr.length; i9++) {
                ui2 ui2VarZzh = nh2VarArr[i9].zzh();
                int i10 = ui2VarZzh.f9567a;
                int i11 = 0;
                while (i11 < i10) {
                    a00 a00VarA = ui2VarZzh.a(i11);
                    int i12 = a00VarA.f2531a;
                    w[] wVarArr = new w[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        w wVar = a00VarA.f2534d[i13];
                        wVar.getClass();
                        tk2 tk2Var = new tk2(wVar);
                        String str = wVar.f9967a;
                        if (str == null) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        tk2Var.f9320a = i9 + ":" + str;
                        wVarArr[i13] = new w(tk2Var);
                    }
                    a00 a00Var = new a00(i9 + ":" + a00VarA.f2532b, wVarArr);
                    this.f9872v.put(a00Var, a00VarA);
                    a00VarArr[i8] = a00Var;
                    i11++;
                    i8++;
                }
            }
            this.f9874x = new ui2(a00VarArr);
            mh2 mh2Var = this.f9873w;
            mh2Var.getClass();
            mh2Var.f(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long h(ak2[] ak2VarArr, boolean[] zArr, mi2[] mi2VarArr, boolean[] zArr2, long j6) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = ak2VarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length = ak2VarArr.length;
            identityHashMap = this.f9870t;
            if (i7 >= length) {
                break;
            }
            mi2 mi2Var = mi2VarArr[i7];
            Integer num = mi2Var == null ? null : (Integer) identityHashMap.get(mi2Var);
            iArr3[i7] = num == null ? -1 : num.intValue();
            ak2 ak2Var = ak2VarArr[i7];
            if (ak2Var != null) {
                String str = ak2Var.zzg().f2532b;
                iArr4[i7] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i7] = -1;
            }
            i7++;
        }
        identityHashMap.clear();
        mi2[] mi2VarArr2 = new mi2[length];
        mi2[] mi2VarArr3 = new mi2[length];
        ak2[] ak2VarArr2 = new ak2[length];
        nh2[] nh2VarArr = this.s;
        ArrayList arrayList = new ArrayList(nh2VarArr.length);
        long j7 = j6;
        int i8 = 0;
        while (i8 < nh2VarArr.length) {
            int i9 = i6;
            while (i9 < ak2VarArr.length) {
                mi2VarArr3[i9] = iArr3[i9] == i8 ? mi2VarArr[i9] : null;
                if (iArr4[i9] == i8) {
                    ak2 ak2Var2 = ak2VarArr[i9];
                    ak2Var2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    a00 a00Var = (a00) this.f9872v.get(ak2Var2.zzg());
                    a00Var.getClass();
                    ak2VarArr2[i9] = new uh2(ak2Var2, a00Var);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    ak2VarArr2[i9] = null;
                }
                i9++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            nh2[] nh2VarArr2 = nh2VarArr;
            int i10 = i8;
            long jH = nh2VarArr[i8].h(ak2VarArr2, zArr, mi2VarArr3, zArr2, j7);
            if (i10 == 0) {
                j7 = jH;
            } else if (jH != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i11 = 0; i11 < ak2VarArr.length; i11++) {
                if (iArr5[i11] == i10) {
                    mi2 mi2Var2 = mi2VarArr3[i11];
                    mi2Var2.getClass();
                    mi2VarArr2[i11] = mi2Var2;
                    identityHashMap.put(mi2Var2, Integer.valueOf(i10));
                    z6 = true;
                } else if (iArr6[i11] == i10) {
                    y5.r(mi2VarArr3[i11] == null);
                }
            }
            if (z6) {
                arrayList2.add(nh2VarArr2[i10]);
            }
            i8 = i10 + 1;
            arrayList = arrayList2;
            nh2VarArr = nh2VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i6 = 0;
        }
        int i12 = i6;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(mi2VarArr2, i12, mi2VarArr, i12, length);
        this.f9875y = (nh2[]) arrayList3.toArray(new nh2[i12]);
        this.f9876z = new bh2(arrayList3, ed0.n(arrayList3, new pa1(1)));
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void i(mh2 mh2Var, long j6) {
        this.f9873w = mh2Var;
        ArrayList arrayList = this.f9871u;
        nh2[] nh2VarArr = this.s;
        Collections.addAll(arrayList, nh2VarArr);
        for (nh2 nh2Var : nh2VarArr) {
            nh2Var.i(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean j(tb2 tb2Var) {
        ArrayList arrayList = this.f9871u;
        if (arrayList.isEmpty()) {
            return this.f9876z.j(tb2Var);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((nh2) arrayList.get(i6)).j(tb2Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzb() {
        return this.f9876z.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final long zzc() {
        return this.f9876z.zzc();
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final long zzd() {
        long j6 = -9223372036854775807L;
        for (nh2 nh2Var : this.f9875y) {
            long jZzd = nh2Var.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j6 != -9223372036854775807L && nh2Var.a(j6) != j6) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j6 == -9223372036854775807L) {
                for (nh2 nh2Var2 : this.f9875y) {
                    if (nh2Var2 == nh2Var) {
                        break;
                    }
                    if (nh2Var2.a(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j6 = jZzd;
            } else if (jZzd != j6) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final ui2 zzh() {
        ui2 ui2Var = this.f9874x;
        ui2Var.getClass();
        return ui2Var;
    }

    @Override // com.google.android.gms.internal.ads.nh2
    public final void zzk() {
        int i6 = 0;
        while (true) {
            nh2[] nh2VarArr = this.s;
            if (i6 >= nh2VarArr.length) {
                return;
            }
            nh2VarArr[i6].zzk();
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final boolean zzp() {
        return this.f9876z.zzp();
    }
}
