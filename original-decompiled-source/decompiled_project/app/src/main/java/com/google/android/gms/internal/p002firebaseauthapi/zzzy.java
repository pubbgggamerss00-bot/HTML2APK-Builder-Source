package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
final class zzzy extends ThreadLocal<Mac> {
    private final /* synthetic */ zzzv zza;

    public zzzy(zzzv zzzvVar) {
        this.zza = zzzvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac macZza = zzzd.zzb.zza(this.zza.zzc);
            macZza.init(this.zza.zzd);
            return macZza;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
