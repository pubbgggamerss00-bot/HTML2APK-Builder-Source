package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import qg.o;
import qg.x;

/* loaded from: classes2.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strI;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i11 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                i12++;
                if (i12 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i13));
                i11++;
            }
            sb.append((CharSequence) "]");
            strI = sb.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, mh.a.f18238b);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i14 = 0;
                while (i11 < length2) {
                    long j10 = jArr[i11];
                    i14++;
                    if (i14 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j10));
                    i11++;
                }
                sb2.append((CharSequence) "]");
                strI = sb2.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i15 = 0;
                while (i11 < length3) {
                    short s10 = sArr[i11];
                    i15++;
                    if (i15 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s10));
                    i11++;
                }
                sb3.append((CharSequence) "]");
                strI = sb3.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i16 = 0;
                while (i11 < length4) {
                    float f10 = fArr[i11];
                    i16++;
                    if (i16 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f10));
                    i11++;
                }
                sb4.append((CharSequence) "]");
                strI = sb4.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i17 = 0;
                while (i11 < length5) {
                    double d10 = dArr[i11];
                    i17++;
                    if (i17 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d10));
                    i11++;
                }
                sb5.append((CharSequence) "]");
                strI = sb5.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strI = o.x(56, (Object[]) objZza);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strI = x.I((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strI = str;
        }
        zzgdVar.zzc().zze(i10, strI);
    }
}
