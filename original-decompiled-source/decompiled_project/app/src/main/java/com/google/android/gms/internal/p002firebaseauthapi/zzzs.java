package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes2.dex */
public final class zzzs implements zzzj<Signature> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzj
    public final /* synthetic */ Signature zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
