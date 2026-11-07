package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    public static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int iZzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzna) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int iHashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        boolean zZzO;
        zzpl zzplVar = this.zzb;
        Object objZza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzovVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzplVar.zzk(objZza, zzovVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zznc zzncVarZza = null;
                    zzle zzleVarZzp = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzovVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzovVar.zzj();
                            zzncVarZza = zzmoVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzncVarZza != null) {
                                throw null;
                            }
                            zzleVarZzp = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVarZzp == null) {
                        continue;
                    } else {
                        if (zzncVarZza != null) {
                            throw null;
                        }
                        zzplVar.zzg(objZza, iZzj, zzleVarZzp);
                    }
                }
            } finally {
                zzplVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6.zzj((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkt zzktVar) throws IOException {
        int iZzi;
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVarZzf = zzndVar.zzc;
        if (zzpmVarZzf == zzpm.zzc()) {
            zzpmVarZzf = zzpm.zzf();
            zzndVar.zzc = zzpmVarZzf;
        }
        zzpm zzpmVar = zzpmVarZzf;
        ((zzna) obj).zzi();
        zznc zzncVarZza = null;
        while (i10 < i11) {
            int iZzi2 = zzku.zzi(bArr, i10, zzktVar);
            int i12 = zzktVar.zza;
            if (i12 == 11) {
                byte[] bArr2 = bArr;
                int i13 = i11;
                zzkt zzktVar2 = zzktVar;
                int i14 = 0;
                zzle zzleVar = null;
                while (true) {
                    if (iZzi2 >= i13) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zzku.zzi(bArr2, iZzi2, zzktVar2);
                    int i15 = zzktVar2.zza;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 != 2) {
                        if (i16 == 3) {
                            if (zzncVarZza != null) {
                                int i18 = zzos.zza;
                                throw null;
                            }
                            if (i17 == 2) {
                                iZzi2 = zzku.zza(bArr2, iZzi, zzktVar2);
                                zzleVar = (zzle) zzktVar2.zzc;
                            }
                        }
                        if (i15 != 12) {
                            break;
                        } else {
                            iZzi2 = zzku.zzo(i15, bArr2, iZzi, i13, zzktVar2);
                        }
                    } else if (i17 == 0) {
                        iZzi2 = zzku.zzi(bArr2, iZzi, zzktVar2);
                        i14 = zzktVar2.zza;
                        zzncVarZza = zzktVar2.zzd.zza(this.zza, i14);
                    } else if (i15 != 12) {
                    }
                }
            } else if ((i12 & 7) == 2) {
                zzncVarZza = zzktVar.zzd.zza(this.zza, i12 >>> 3);
                if (zzncVarZza != null) {
                    int i19 = zzos.zza;
                    throw null;
                }
                i10 = zzku.zzh(i12, bArr, iZzi2, i11, zzpmVar, zzktVar);
            } else {
                i10 = zzku.zzo(i12, bArr, iZzi2, i11, zzktVar);
            }
        }
        if (i10 != i11) {
            throw new zznn("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Iterator itZzf = ((zzna) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
