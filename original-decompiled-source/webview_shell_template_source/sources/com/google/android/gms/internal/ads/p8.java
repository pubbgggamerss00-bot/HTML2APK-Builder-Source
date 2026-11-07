package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p8 implements x6 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7989a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7990b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7991c;

    public p8(ArrayList arrayList) {
        this.f7989a = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f7990b = new long[size + size];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            g8 g8Var = (g8) arrayList.get(i6);
            long[] jArr = this.f7990b;
            int i7 = i6 + i6;
            jArr[i7] = g8Var.f4933b;
            jArr[i7 + 1] = g8Var.f4934c;
        }
        long[] jArr2 = this.f7990b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f7991c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final ArrayList a(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        while (true) {
            List list = this.f7989a;
            if (i6 >= list.size()) {
                break;
            }
            int i7 = i6 + i6;
            long[] jArr = this.f7990b;
            if (jArr[i7] <= j6 && j6 < jArr[i7 + 1]) {
                g8 g8Var = (g8) list.get(i6);
                xg0 xg0Var = g8Var.f4932a;
                if (xg0Var.f10574e == -3.4028235E38f) {
                    arrayList2.add(g8Var);
                } else {
                    arrayList.add(xg0Var);
                }
            }
            i6++;
        }
        Collections.sort(arrayList2, new o8(0));
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            xg0 xg0Var2 = ((g8) arrayList2.get(i8)).f4932a;
            arrayList.add(new xg0(xg0Var2.f10570a, xg0Var2.f10571b, xg0Var2.f10572c, xg0Var2.f10573d, (-1) - i8, 1, xg0Var2.f10576g, xg0Var2.h, xg0Var2.f10577i, xg0Var2.f10580l, xg0Var2.f10581m, xg0Var2.f10578j, xg0Var2.f10579k, xg0Var2.f10582n, xg0Var2.f10583o));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final int zza() {
        return this.f7991c.length;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final long zzb(int i6) {
        y5.n(i6 >= 0);
        long[] jArr = this.f7991c;
        y5.n(i6 < jArr.length);
        return jArr[i6];
    }
}
