package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzzo implements zzzj<KeyFactory> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzj
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
