package com.google.android.gms.internal.p002firebaseauthapi;

import j2.y;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzjy implements zzbi {
    private final zzbi zza;
    private final zzxu zzb;
    private final byte[] zzc;

    private zzjy(zzbi zzbiVar, zzxu zzxuVar, byte[] bArr) {
        this.zza = zzbiVar;
        this.zzb = zzxuVar;
        this.zzc = bArr;
    }

    public static zzbi zza(zzoe zzoeVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqe zzqeVarZza = zzoeVar.zza(zzbj.zza());
        zzbi zzbiVar = (zzbi) zznt.zza().zza(zzqeVarZza.zzf(), zzbi.class).zzb(zzqeVarZza.zzd());
        zzxu zzxuVarZzc = zzqeVarZza.zzc();
        int i10 = zzjx.zza[zzxuVarZzc.ordinal()];
        if (i10 == 1) {
            bArrZzb = zzpd.zza.zzb();
        } else if (i10 == 2 || i10 == 3) {
            bArrZzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException(y.a(zzxuVarZzc.zza(), "unknown output prefix type "));
            }
            bArrZzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
        }
        return new zzjy(zzbiVar, zzxuVarZzc, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzxu.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
