package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;
import p5.m0;

/* loaded from: classes2.dex */
public final class zzpm {
    private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpm(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzpm zzc() {
        return zza;
    }

    public static zzpm zze(zzpm zzpmVar, zzpm zzpmVar2) {
        int i10 = zzpmVar.zzb + zzpmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzpmVar.zzc, i10);
        System.arraycopy(zzpmVar2.zzc, 0, iArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzpmVar.zzd, i10);
        System.arraycopy(zzpmVar2.zzd, 0, objArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        return new zzpm(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzpm zzf() {
        return new zzpm(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int i10 = this.zzb;
        if (i10 == zzpmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpmVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzpmVar.zzd;
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
        int iZzA;
        int iZzB;
        int iZzA2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzA2 = zzln.zzA(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzle zzleVar = (zzle) this.zzd[i11];
                    int iZzA4 = zzln.zzA(i15);
                    int iZzd = zzleVar.zzd();
                    iZzA3 = zzln.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                } else if (i14 == 3) {
                    int iZzA5 = zzln.zzA(i13 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzpm) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzA2 = zzln.zzA(i13 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzA = zzln.zzA(i16);
                iZzB = zzln.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzle zzleVar = (zzle) this.zzd[i11];
            int iZzA = zzln.zzA(8);
            int iZzA2 = zzln.zzA(i12) + zzln.zzA(16);
            int iZzA3 = zzln.zzA(24);
            int iZzd = zzleVar.zzd();
            iA = m.a.a(iZzA + iZzA, iZzA2, e.a(iZzd, iZzd, iZzA3), iA);
        }
        this.zze = iA;
        return iA;
    }

    public final zzpm zzd(zzpm zzpmVar) {
        if (zzpmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzpmVar.zzb;
        zzm(i10);
        System.arraycopy(zzpmVar.zzc, 0, this.zzc, this.zzb, zzpmVar.zzb);
        System.arraycopy(zzpmVar.zzd, 0, this.zzd, this.zzb, zzpmVar.zzb);
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
            zzok.zzb(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzk(zzpy zzpyVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzpyVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzpy zzpyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzpyVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzpyVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzpyVar.zzd(i13, (zzle) obj);
                } else if (i12 == 3) {
                    zzpyVar.zzF(i13);
                    ((zzpm) obj).zzl(zzpyVar);
                    zzpyVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zznm("Protocol message tag had invalid wire type."));
                    }
                    zzpyVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzpm() {
        this(0, new int[8], new Object[8], true);
    }
}
