package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;
import jh.f;
import jh.g;
import jh.j;
import qg.p;
import qg.x;

/* loaded from: classes2.dex */
public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) throws ArithmeticException, zzce {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(mh.a.f18238b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(x.Y(arrayList), mh.a.f18238b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                return x.b0(arrayList2);
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z16 = obj instanceof byte[];
        if (z16 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof short[];
        if (z17 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z18 = obj instanceof int[];
        if (z18 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i10 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                i10++;
            }
            return x.b0(arrayList11);
        }
        boolean z19 = obj instanceof long[];
        if (z19 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j11 : jArr2) {
                arrayList12.add(Long.valueOf(j11 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z20 = obj instanceof float[];
        if (z20 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f11 : fArr2) {
                arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z21 = obj instanceof double[];
        if (z21 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d11 : dArr2) {
                arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z16 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            g gVarQ = j.q(0, length4);
            ArrayList arrayList15 = new ArrayList(p.h(gVarQ, 10));
            f it = gVarQ.iterator();
            while (it.f15749c) {
                int iNextInt = it.nextInt();
                arrayList15.add(Integer.valueOf(bArr3[iNextInt] % bArr4[iNextInt]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            g gVarQ2 = j.q(0, length5);
            ArrayList arrayList16 = new ArrayList(p.h(gVarQ2, 10));
            f it2 = gVarQ2.iterator();
            while (it2.f15749c) {
                int iNextInt2 = it2.nextInt();
                arrayList16.add(Integer.valueOf(sArr3[iNextInt2] % sArr4[iNextInt2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            g gVarQ3 = j.q(0, length6);
            ArrayList arrayList17 = new ArrayList(p.h(gVarQ3, 10));
            f it3 = gVarQ3.iterator();
            while (it3.f15749c) {
                int iNextInt3 = it3.nextInt();
                arrayList17.add(Integer.valueOf(iArr3[iNextInt3] % iArr4[iNextInt3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z19 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            g gVarQ4 = j.q(0, length7);
            ArrayList arrayList18 = new ArrayList(p.h(gVarQ4, 10));
            f it4 = gVarQ4.iterator();
            while (it4.f15749c) {
                int iNextInt4 = it4.nextInt();
                arrayList18.add(Long.valueOf(jArr3[iNextInt4] % jArr4[iNextInt4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z20 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            g gVarQ5 = j.q(0, length8);
            ArrayList arrayList19 = new ArrayList(p.h(gVarQ5, 10));
            f it5 = gVarQ5.iterator();
            while (it5.f15749c) {
                int iNextInt5 = it5.nextInt();
                arrayList19.add(Float.valueOf(fArr3[iNextInt5] % fArr4[iNextInt5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z21 || !(obj2 instanceof double[])) {
            throw new zzce(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        g gVarQ6 = j.q(0, length9);
        ArrayList arrayList20 = new ArrayList(p.h(gVarQ6, 10));
        f it6 = gVarQ6.iterator();
        while (it6.f15749c) {
            int iNextInt6 = it6.nextInt();
            arrayList20.add(Double.valueOf(dArr3[iNextInt6] % dArr4[iNextInt6]));
        }
        return arrayList20.toArray(new Double[0]);
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
        try {
            zzgdVar.zzc().zze(i10, zzb(objZza, objZza2));
        } catch (ArithmeticException e10) {
            throw new zzce(4, 6, e10);
        }
    }
}
