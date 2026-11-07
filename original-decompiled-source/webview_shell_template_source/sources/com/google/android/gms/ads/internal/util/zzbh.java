package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbh(zzbf zzbfVar, zzbg zzbgVar) {
        int size = zzbfVar.zzb.size();
        this.zza = (String[]) zzbfVar.zza.toArray(new String[size]);
        this.zzb = zzc(zzbfVar.zzb);
        this.zzc = zzc(zzbfVar.zzc);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i6 = 0; i6 < size; i6++) {
            dArr[i6] = ((Double) list.get(i6)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i6 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i6 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i6];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d7 = dArr[i6];
            double d8 = dArr2[i6];
            int i7 = iArr[i6];
            arrayList.add(new zzbe(str, d7, d8, i7 / this.zze, i7));
            i6++;
        }
    }

    public final void zzb(double d7) {
        this.zze++;
        int i6 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i6 >= dArr.length) {
                return;
            }
            double d8 = dArr[i6];
            if (d8 <= d7 && d7 < this.zzb[i6]) {
                int[] iArr = this.zzd;
                iArr[i6] = iArr[i6] + 1;
            }
            if (d7 < d8) {
                return;
            } else {
                i6++;
            }
        }
    }
}
