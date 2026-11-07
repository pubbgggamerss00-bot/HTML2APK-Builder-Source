package com.google.android.recaptcha.internal;

import c0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.r;
import qg.o;
import qg.p;
import qg.z;

/* loaded from: classes2.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z10 = obj instanceof byte[];
        z zVar = z.f22752a;
        int i10 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                return zVar;
            }
            if (length == 1) {
                return g0.c(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                return zVar;
            }
            if (length3 == 1) {
                return g0.c(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i10 < length4) {
                arrayList2.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            r.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                return z.f22752a;
            }
            if (length5 == 1) {
                return g0.c(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList3.add(Integer.valueOf(i11));
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return o.A((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            r.e(fArr, "<this>");
            int length6 = fArr.length;
            if (length6 == 0) {
                return z.f22752a;
            }
            if (length6 == 1) {
                return g0.c(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList4.add(Float.valueOf(f10));
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        int length7 = dArr.length;
        if (length7 == 0) {
            return zVar;
        }
        if (length7 == 1) {
            return g0.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length8 = dArr.length;
        while (i10 < length8) {
            arrayList5.add(Double.valueOf(dArr[i10]));
            i10++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i10, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(p.h(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(p.h(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) listZzc.get(i10)).doubleValue(), ((Number) listZzc2.get(i10)).doubleValue()));
        }
        return dArr;
    }
}
