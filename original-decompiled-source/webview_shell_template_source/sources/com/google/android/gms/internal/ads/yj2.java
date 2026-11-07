package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yj2 extends dk2 implements qc2 {

    /* renamed from: j, reason: collision with root package name */
    public static final pn1 f11011j = new pn1(new aj2());

    /* renamed from: c, reason: collision with root package name */
    public final Object f11012c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11013d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11014e;

    /* renamed from: f, reason: collision with root package name */
    public jj2 f11015f;

    /* renamed from: g, reason: collision with root package name */
    public final sj2 f11016g;
    public gy0 h;

    /* renamed from: i, reason: collision with root package name */
    public final iu1 f11017i;

    public yj2(Context context) {
        iu1 iu1Var = new iu1(21);
        int i6 = jj2.f6086u;
        jj2 jj2Var = new jj2(new ij2(context));
        this.f11012c = new Object();
        this.f11013d = context.getApplicationContext();
        this.f11017i = iu1Var;
        this.f11015f = jj2Var;
        this.h = gy0.f5187b;
        boolean zE = j31.e(context);
        this.f11014e = zE;
        if (!zE && j31.f5914a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f11016g = audioManager == null ? null : new sj2(audioManager.getSpatializer());
        }
        boolean z6 = this.f11015f.f6091p;
    }

    public static int h(w wVar, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.f9970d)) {
            return 4;
        }
        String strI = i(str);
        String strI2 = i(wVar.f9970d);
        if (strI2 == null || strI == null) {
            return (z6 && strI2 == null) ? 1 : 0;
        }
        if (strI2.startsWith(strI) || strI.startsWith(strI2)) {
            return 3;
        }
        int i6 = j31.f5914a;
        return strI2.split("-", 2)[0].equals(strI.split("-", 2)[0]) ? 2 : 0;
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final Pair k(int i6, ck2 ck2Var, int[][][] iArr, uj2 uj2Var, Comparator comparator) {
        RandomAccess randomAccessN;
        ck2 ck2Var2 = ck2Var;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < 2) {
            if (i6 == ck2Var2.f3614a[i7]) {
                ui2 ui2Var = ck2Var2.f3615b[i7];
                for (int i8 = 0; i8 < ui2Var.f9567a; i8++) {
                    a00 a00VarA = ui2Var.a(i8);
                    cp1 cp1VarC = uj2Var.c(i7, a00VarA, iArr[i7][i8]);
                    int i9 = a00VarA.f2531a;
                    boolean[] zArr = new boolean[i9];
                    int i10 = 0;
                    while (i10 < i9) {
                        int i11 = i10 + 1;
                        vj2 vj2Var = (vj2) cp1VarC.get(i10);
                        int iA = vj2Var.a();
                        if (!zArr[i10] && iA != 0) {
                            if (iA == 1) {
                                randomAccessN = bo1.n(vj2Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(vj2Var);
                                for (int i12 = i11; i12 < i9; i12++) {
                                    vj2 vj2Var2 = (vj2) cp1VarC.get(i12);
                                    if (vj2Var2.a() == 2 && vj2Var.b(vj2Var2)) {
                                        arrayList2.add(vj2Var2);
                                        zArr[i12] = true;
                                    }
                                }
                                randomAccessN = arrayList2;
                            }
                            arrayList.add(randomAccessN);
                        }
                        i10 = i11;
                    }
                }
            }
            i7++;
            ck2Var2 = ck2Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((vj2) list.get(i13)).f9887u;
        }
        vj2 vj2Var3 = (vj2) list.get(0);
        return Pair.create(new zj2(vj2Var3.f9886t, iArr2), Integer.valueOf(vj2Var3.s));
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final void b() {
        sj2 sj2Var;
        lj2 lj2Var;
        synchronized (this.f11012c) {
            try {
                if (j31.f5914a >= 32 && (sj2Var = this.f11016g) != null && (lj2Var = sj2Var.f8962d) != null && sj2Var.f8961c != null) {
                    sj2Var.f8959a.removeOnSpatializerStateChangedListener(lj2Var);
                    sj2Var.f8961c.removeCallbacksAndMessages(null);
                    sj2Var.f8961c = null;
                    sj2Var.f8962d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final void c(gy0 gy0Var) {
        boolean zEquals;
        synchronized (this.f11012c) {
            zEquals = this.h.equals(gy0Var);
            this.h = gy0Var;
        }
        if (zEquals) {
            return;
        }
        j();
    }

    @Override // com.google.android.gms.internal.ads.dk2
    public final Pair g(ck2 ck2Var, int[][][] iArr, final int[] iArr2) {
        final jj2 jj2Var;
        int i6;
        final boolean z6;
        String str;
        Pair pairK;
        int i7;
        int i8;
        int[] iArr3;
        int length;
        ak2 bk2Var;
        int i9;
        int i10;
        int i11;
        sj2 sj2Var;
        int[][][] iArr4 = iArr;
        synchronized (this.f11012c) {
            try {
                jj2Var = this.f11015f;
                if (jj2Var.f6091p && j31.f5914a >= 32 && (sj2Var = this.f11016g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    y5.k(looperMyLooper);
                    if (sj2Var.f8962d == null && sj2Var.f8961c == null) {
                        sj2Var.f8962d = new lj2(this);
                        Handler handler = new Handler(looperMyLooper);
                        sj2Var.f8961c = handler;
                        sj2Var.f8959a.addOnSpatializerStateChangedListener(new pe2(handler, 1), sj2Var.f8962d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i12 = 2;
        zj2[] zj2VarArr = new zj2[2];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i6 = 1;
            if (i14 >= 2) {
                z6 = false;
                break;
            }
            if (ck2Var.f3614a[i14] == 2 && ck2Var.f3615b[i14].f9567a > 0) {
                z6 = true;
                break;
            }
            i14++;
        }
        Pair pairK2 = k(1, ck2Var, iArr4, new uj2() { // from class: com.google.android.gms.internal.ads.cj2
            @Override // com.google.android.gms.internal.ads.uj2
            public final cp1 c(int i15, a00 a00Var, int[] iArr5) {
                ej2 ej2Var = new ej2(this.s);
                int i16 = iArr2[i15];
                yn1 yn1Var = new yn1();
                for (int i17 = 0; i17 < a00Var.f2531a; i17++) {
                    yn1Var.q(new fj2(i15, a00Var, i17, jj2Var, iArr5[i17], z6, ej2Var));
                }
                return yn1Var.t();
            }
        }, new h8(3));
        if (pairK2 != null) {
            zj2VarArr[((Integer) pairK2.second).intValue()] = (zj2) pairK2.first;
        }
        if (pairK2 == null) {
            str = null;
        } else {
            zj2 zj2Var = (zj2) pairK2.first;
            str = zj2Var.f11321a.f2534d[zj2Var.f11322b[0]].f9970d;
        }
        Pair pairK3 = k(2, ck2Var, iArr4, new k00(jj2Var, str, iArr2), new dc(1));
        int i15 = 4;
        if (pairK3 == null) {
            final int i16 = 0;
            pairK = k(4, ck2Var, iArr4, new ej0(23, jj2Var), new Comparator() { // from class: com.google.android.gms.internal.ads.bj2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    switch (i16) {
                        case 0:
                            return Integer.compare(((gj2) list.get(0)).f5079x, ((gj2) list2.get(0)).f5079x);
                        default:
                            return ((tj2) list.get(0)).compareTo((tj2) list2.get(0));
                    }
                }
            });
        } else {
            pairK = null;
        }
        if (pairK != null) {
            zj2VarArr[((Integer) pairK.second).intValue()] = (zj2) pairK.first;
        } else if (pairK3 != null) {
            zj2VarArr[((Integer) pairK3.second).intValue()] = (zj2) pairK3.first;
        }
        ro0 ro0Var = new ro0(jj2Var, str);
        final int i17 = 1;
        Comparator comparator = new Comparator() { // from class: com.google.android.gms.internal.ads.bj2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                switch (i17) {
                    case 0:
                        return Integer.compare(((gj2) list.get(0)).f5079x, ((gj2) list2.get(0)).f5079x);
                    default:
                        return ((tj2) list.get(0)).compareTo((tj2) list2.get(0));
                }
            }
        };
        int i18 = 3;
        Pair pairK4 = k(3, ck2Var, iArr4, ro0Var, comparator);
        if (pairK4 != null) {
            zj2VarArr[((Integer) pairK4.second).intValue()] = (zj2) pairK4.first;
        }
        int i19 = 0;
        while (i19 < i12) {
            int i20 = ck2Var.f3614a[i19];
            if (i20 == i12 || i20 == i6 || i20 == i18 || i20 == i15) {
                i11 = i13;
            } else {
                ui2 ui2Var = ck2Var.f3615b[i19];
                int[][] iArr5 = iArr4[i19];
                int i21 = i13;
                int i22 = i21;
                i11 = i22;
                a00 a00Var = null;
                hj2 hj2Var = null;
                while (i21 < ui2Var.f9567a) {
                    a00 a00VarA = ui2Var.a(i21);
                    int[] iArr6 = iArr5[i21];
                    hj2 hj2Var2 = hj2Var;
                    for (int i23 = i11; i23 < a00VarA.f2531a; i23++) {
                        if (rj1.i(iArr6[i23], jj2Var.f6092q)) {
                            hj2 hj2Var3 = new hj2(a00VarA.f2534d[i23], iArr6[i23]);
                            if (hj2Var2 == null || tn1.f9352a.d(hj2Var3.f5433t, hj2Var2.f5433t).d(hj2Var3.s, hj2Var2.s).a() > 0) {
                                a00Var = a00VarA;
                                i22 = i23;
                                hj2Var2 = hj2Var3;
                            }
                        }
                    }
                    i21++;
                    hj2Var = hj2Var2;
                }
                zj2VarArr[i19] = a00Var == null ? null : new zj2(a00Var, new int[]{i22});
            }
            i19++;
            iArr4 = iArr;
            i13 = i11;
            i12 = 2;
            i6 = 1;
            i15 = 4;
            i18 = 3;
        }
        int i24 = i13;
        HashMap map = new HashMap();
        for (int i25 = i24; i25 < 2; i25++) {
            ui2 ui2Var2 = ck2Var.f3615b[i25];
            for (int i26 = i24; i26 < ui2Var2.f9567a; i26++) {
                if (((t00) jj2Var.f3757j.get(ui2Var2.a(i26))) != null) {
                    throw null;
                }
            }
        }
        ui2 ui2Var3 = ck2Var.f3617d;
        for (int i27 = i24; i27 < ui2Var3.f9567a; i27++) {
            if (((t00) jj2Var.f3757j.get(ui2Var3.a(i27))) != null) {
                throw null;
            }
        }
        int i28 = i24;
        while (true) {
            int i29 = 2;
            if (i28 >= 2) {
                int i30 = i24;
                while (i30 < i29) {
                    ui2 ui2Var4 = ck2Var.f3615b[i30];
                    Map map2 = (Map) jj2Var.s.get(i30);
                    if (map2 != null && map2.containsKey(ui2Var4)) {
                        Map map3 = (Map) jj2Var.s.get(i30);
                        if ((map3 != null ? (kj2) map3.get(ui2Var4) : null) != null) {
                            throw null;
                        }
                        zj2VarArr[i30] = null;
                    }
                    i30++;
                    i29 = 2;
                }
                int i31 = i24;
                while (i31 < i29) {
                    int i32 = ck2Var.f3614a[i31];
                    if (jj2Var.f6094t.get(i31) || jj2Var.f3758k.contains(Integer.valueOf(i32))) {
                        zj2VarArr[i31] = null;
                    }
                    i31++;
                    i29 = 2;
                }
                iu1 iu1Var = this.f11017i;
                y5.k(this.f4718b);
                ArrayList arrayList = new ArrayList();
                int i33 = 0;
                int i34 = 0;
                while (true) {
                    i8 = 1;
                    if (i34 >= 2) {
                        break;
                    }
                    zj2 zj2Var2 = zj2VarArr[i34];
                    if (zj2Var2 == null || zj2Var2.f11322b.length <= 1) {
                        arrayList.add(null);
                    } else {
                        yn1 yn1Var = new yn1();
                        yn1Var.q(new xi2(0L, 0L));
                        arrayList.add(yn1Var);
                    }
                    i34++;
                }
                long[][] jArr = new long[2][];
                int i35 = 0;
                while (i35 < 2) {
                    zj2 zj2Var3 = zj2VarArr[i35];
                    if (zj2Var3 == null) {
                        jArr[i35] = new long[i33];
                        i10 = i33;
                    } else {
                        i10 = i33;
                        int[] iArr7 = zj2Var3.f11322b;
                        jArr[i35] = new long[iArr7.length];
                        for (int i36 = i10; i36 < iArr7.length; i36++) {
                            long j6 = zj2Var3.f11321a.f2534d[iArr7[i36]].f9974i;
                            long[] jArr2 = jArr[i35];
                            if (j6 == -1) {
                                j6 = 0;
                            }
                            jArr2[i36] = j6;
                        }
                        Arrays.sort(jArr[i35]);
                    }
                    i35++;
                    i33 = i10;
                }
                int i37 = i33;
                int[] iArr8 = new int[2];
                long[] jArr3 = new long[2];
                for (int i38 = i37; i38 < 2; i38++) {
                    long[] jArr4 = jArr[i38];
                    jArr3[i38] = jArr4.length == 0 ? 0L : jArr4[i37];
                }
                yi2.c(arrayList, jArr3);
                xo1 xo1Var = new xo1(new TreeMap(zo1.s), new wo1());
                int i39 = i37;
                for (i7 = 2; i39 < i7; i7 = 2) {
                    int length2 = jArr[i39].length;
                    if (length2 <= i8) {
                        i9 = i8;
                    } else {
                        double[] dArr = new double[length2];
                        int i40 = i37;
                        i9 = i8;
                        while (true) {
                            long[] jArr5 = jArr[i39];
                            double dLog = 0.0d;
                            if (i40 >= jArr5.length) {
                                break;
                            }
                            long j7 = jArr5[i40];
                            if (j7 != -1) {
                                dLog = Math.log(j7);
                            }
                            dArr[i40] = dLog;
                            i40++;
                        }
                        int i41 = length2 - 1;
                        double d7 = dArr[i41] - dArr[i37];
                        int i42 = i37;
                        while (i42 < i41) {
                            double d8 = dArr[i42];
                            i42++;
                            Double dValueOf = Double.valueOf(d7 == 0.0d ? 1.0d : (((d8 + dArr[i42]) * 0.5d) - dArr[i37]) / d7);
                            iu1 iu1Var2 = iu1Var;
                            Integer numValueOf = Integer.valueOf(i39);
                            int[] iArr9 = iArr8;
                            Map map4 = xo1Var.f2801v;
                            zj2[] zj2VarArr2 = zj2VarArr;
                            Collection collection = (Collection) map4.get(dValueOf);
                            if (collection == null) {
                                List list = (List) xo1Var.f10653x.mo7zza();
                                if (!list.add(numValueOf)) {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                                xo1Var.f2802w++;
                                map4.put(dValueOf, list);
                            } else if (collection.add(numValueOf)) {
                                xo1Var.f2802w++;
                            }
                            iu1Var = iu1Var2;
                            iArr8 = iArr9;
                            zj2VarArr = zj2VarArr2;
                        }
                    }
                    i39++;
                    i8 = i9;
                    iu1Var = iu1Var;
                    iArr8 = iArr8;
                    zj2VarArr = zj2VarArr;
                }
                iu1 iu1Var3 = iu1Var;
                int[] iArr10 = iArr8;
                zj2[] zj2VarArr3 = zj2VarArr;
                cn1 cn1Var = xo1Var.f3978t;
                if (cn1Var == null) {
                    cn1Var = new cn1(xo1Var);
                    xo1Var.f3978t = cn1Var;
                }
                bo1 bo1VarL = bo1.l(cn1Var);
                for (int i43 = i37; i43 < bo1VarL.size(); i43++) {
                    int iIntValue = ((Integer) bo1VarL.get(i43)).intValue();
                    int i44 = iArr10[iIntValue] + 1;
                    iArr10[iIntValue] = i44;
                    jArr3[iIntValue] = jArr[iIntValue][i44];
                    yi2.c(arrayList, jArr3);
                }
                for (int i45 = i37; i45 < 2; i45++) {
                    if (arrayList.get(i45) != null) {
                        long j8 = jArr3[i45];
                        jArr3[i45] = j8 + j8;
                    }
                }
                yi2.c(arrayList, jArr3);
                yn1 yn1Var2 = new yn1();
                for (int i46 = i37; i46 < arrayList.size(); i46++) {
                    yn1 yn1Var3 = (yn1) arrayList.get(i46);
                    yn1Var2.q(yn1Var3 == null ? cp1.f3636w : yn1Var3.t());
                }
                cp1 cp1VarT = yn1Var2.t();
                int i47 = 2;
                ak2[] ak2VarArr = new ak2[2];
                int i48 = i24;
                while (i48 < i47) {
                    zj2 zj2Var4 = zj2VarArr3[i48];
                    if (zj2Var4 != null && (length = (iArr3 = zj2Var4.f11322b).length) != 0) {
                        if (length == 1) {
                            bk2Var = new bk2(zj2Var4.f11321a, new int[]{iArr3[i24]});
                        } else {
                            a00 a00Var2 = zj2Var4.f11321a;
                            bo1 bo1Var = (bo1) cp1VarT.get(i48);
                            iu1Var3.getClass();
                            yi2 yi2Var = new yi2(a00Var2, iArr3);
                            bo1.l(bo1Var);
                            bk2Var = yi2Var;
                        }
                        ak2VarArr[i48] = bk2Var;
                    }
                    i48++;
                    i47 = 2;
                }
                rc2[] rc2VarArr = new rc2[i47];
                for (int i49 = i24; i49 < i47; i49++) {
                    rc2VarArr[i49] = (jj2Var.f6094t.get(i49) || jj2Var.f3758k.contains(Integer.valueOf(ck2Var.f3614a[i49])) || (ck2Var.f3614a[i49] != -2 && ak2VarArr[i49] == null)) ? null : rc2.f8610a;
                }
                return Pair.create(rc2VarArr, ak2VarArr);
            }
            if (((t00) map.get(Integer.valueOf(ck2Var.f3614a[i28]))) != null) {
                throw null;
            }
            i28++;
        }
    }

    public final void j() {
        boolean z6;
        ob2 ob2Var;
        sj2 sj2Var;
        synchronized (this.f11012c) {
            try {
                z6 = false;
                if (this.f11015f.f6091p && !this.f11014e && j31.f5914a >= 32 && (sj2Var = this.f11016g) != null && sj2Var.f8960b) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6 || (ob2Var = this.f4717a) == null) {
            return;
        }
        ob2Var.f7701z.h(10);
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final qc2 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final void d() {
    }
}
