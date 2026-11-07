package com.google.android.recaptcha.internal;

import ah.l;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) throws GeneralSecurityException, IOException {
        return l.j(file);
    }

    public static final void zzb(File file, byte[] bArr) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        l.q(file, bArr);
    }
}
