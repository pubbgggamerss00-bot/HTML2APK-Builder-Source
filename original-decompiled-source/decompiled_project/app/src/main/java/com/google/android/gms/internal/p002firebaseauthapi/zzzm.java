package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzzm implements zzzj<Cipher> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzj
    public final /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
