package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzann {
    private static final zzann zza = new zzann(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzann() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzann zzc() {
        return zza;
    }

    public static zzann zzd() {
        return new zzann();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzann)) {
            return false;
        }
        zzann zzannVar = (zzann) obj;
        int i10 = this.zzb;
        if (i10 == zzannVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzannVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzannVar.zzd;
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
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZza = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iZze = zzakg.zze(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 1) {
                iZze = zzakg.zza(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 2) {
                iZze = zzakg.zza(i13, (zzajp) this.zzd[i11]);
            } else if (i14 == 3) {
                iZza = ((zzann) this.zzd[i11]).zza() + (zzakg.zzi(i13) << 1) + iZza;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(zzalf.zza());
                }
                iZze = zzakg.zzc(i13, ((Integer) this.zzd[i11]).intValue());
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzb = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            iZzb += zzakg.zzb(this.zzc[i11] >>> 3, (zzajp) this.zzd[i11]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzann(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public final void zzb(zzaof zzaofVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzaofVar.zza() == 1) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzaofVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzaofVar);
        }
    }

    public final zzann zza(zzann zzannVar) {
        if (zzannVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzannVar.zzb;
        zza(i10);
        System.arraycopy(zzannVar.zzc, 0, this.zzc, this.zzb, zzannVar.zzb);
        System.arraycopy(zzannVar.zzd, 0, this.zzd, this.zzb, zzannVar.zzb);
        this.zzb = i10;
        return this;
    }

    public static zzann zza(zzann zzannVar, zzann zzannVar2) {
        int i10 = zzannVar.zzb + zzannVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzannVar.zzc, i10);
        System.arraycopy(zzannVar2.zzc, 0, iArrCopyOf, zzannVar.zzb, zzannVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzannVar.zzd, i10);
        System.arraycopy(zzannVar2.zzd, 0, objArrCopyOf, zzannVar.zzb, zzannVar2.zzb);
        return new zzann(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i10) {
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

    public final void zza(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzamh.zza(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zza(zzaof zzaofVar) throws IOException {
        if (zzaofVar.zza() == 2) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzaofVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzaofVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    private static void zza(int i10, Object obj, zzaof zzaofVar) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzaofVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzaofVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzaofVar.zza(i11, (zzajp) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zzaofVar.zzb(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzalf.zza());
        }
        if (zzaofVar.zza() == 1) {
            zzaofVar.zzb(i11);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zza(i11);
        } else {
            zzaofVar.zza(i11);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zzb(i11);
        }
    }
}
