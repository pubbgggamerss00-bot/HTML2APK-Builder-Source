package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;
import p5.m0;

/* loaded from: classes2.dex */
public final class zzhi {
    private static final zzhi zza = new zzhi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhi(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhi zzc() {
        return zza;
    }

    public static zzhi zze(zzhi zzhiVar, zzhi zzhiVar2) {
        int i10 = zzhiVar.zzb + zzhiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhiVar.zzc, i10);
        System.arraycopy(zzhiVar2.zzc, 0, iArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhiVar.zzd, i10);
        System.arraycopy(zzhiVar2.zzd, 0, objArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        return new zzhi(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhi zzf() {
        return new zzhi(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhi)) {
            return false;
        }
        zzhi zzhiVar = (zzhi) obj;
        int i10 = this.zzb;
        if (i10 == zzhiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhiVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhiVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int iA = m0.a(i11, 31, i12, 31);
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return iA + iHashCode;
    }

    public final int zza() {
        int iZzC;
        int iZzD;
        int iZzC2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzC3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzC2 = zzep.zzC(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzei zzeiVar = (zzei) this.zzd[i11];
                    int iZzC4 = zzep.zzC(i15);
                    int iZzd = zzeiVar.zzd();
                    iZzC3 = zzep.zzC(iZzd) + iZzd + iZzC4 + iZzC3;
                } else if (i14 == 3) {
                    int iZzC5 = zzep.zzC(i13 << 3);
                    iZzC = iZzC5 + iZzC5;
                    iZzD = ((zzhi) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzfp("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzC2 = zzep.zzC(i13 << 3) + 4;
                }
                iZzC3 = iZzC2 + iZzC3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzC = zzep.zzC(i16);
                iZzD = zzep.zzD(jLongValue);
            }
            iZzC3 = iZzD + iZzC + iZzC3;
        }
        this.zze = iZzC3;
        return iZzC3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzei zzeiVar = (zzei) this.zzd[i11];
            int iZzC = zzep.zzC(8);
            int iZzC2 = zzep.zzC(i12) + zzep.zzC(16);
            int iZzC3 = zzep.zzC(24);
            int iZzd = zzeiVar.zzd();
            iA = m.a.a(iZzC + iZzC, iZzC2, b6.a.a(iZzd, iZzd, iZzC3), iA);
        }
        this.zze = iA;
        return iA;
    }

    public final zzhi zzd(zzhi zzhiVar) {
        if (zzhiVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzhiVar.zzb;
        zzm(i10);
        System.arraycopy(zzhiVar.zzc, 0, this.zzc, this.zzb, zzhiVar.zzb);
        System.arraycopy(zzhiVar.zzd, 0, this.zzd, this.zzb, zzhiVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzgn.zzb(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzhu zzhuVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhuVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzhu zzhuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzhuVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzhuVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzhuVar.zzd(i13, (zzei) obj);
                } else if (i12 == 3) {
                    zzhuVar.zzF(i13);
                    ((zzhi) obj).zzl(zzhuVar);
                    zzhuVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzfp("Protocol message tag had invalid wire type."));
                    }
                    zzhuVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzhi() {
        this(0, new int[8], new Object[8], true);
    }
}
