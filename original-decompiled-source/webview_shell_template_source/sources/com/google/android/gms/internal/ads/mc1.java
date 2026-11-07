package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mc1 {
    public mc1() {
        try {
            rt1.a();
        } catch (GeneralSecurityException e6) {
            zze.zza("Failed to Configure Aead. ".concat(e6.toString()));
            zzv.zzp().h("CryptoUtils.registerAead", e6);
        }
    }

    public static final String a(byte[] bArr, byte[] bArr2, String str, zt0 zt0Var) throws GeneralSecurityException {
        ht1 ht1VarE;
        if (str != null) {
            try {
                try {
                    ht1VarE = sj1.e(new ck1(14, new ByteArrayInputStream(Base64.decode(str, 11))));
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e6) {
                zze.zza("Failed to get keysethandle".concat(e6.toString()));
                zzv.zzp().h("CryptoUtils.getHandle", e6);
                ht1VarE = null;
            }
            if (ht1VarE != null) {
                try {
                    byte[] bArrE = ((ys1) ht1VarE.b(sy1.f9051t)).e(bArr, bArr2);
                    zt0Var.f11575a.put("ds", "1");
                    return new String(bArrE, "UTF-8");
                } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e7) {
                    zze.zza("Failed to decrypt ".concat(e7.toString()));
                    zzv.zzp().h("CryptoUtils.decrypt", e7);
                    zt0Var.f11575a.put("dsf", e7.toString());
                }
            }
        }
        return null;
    }
}
