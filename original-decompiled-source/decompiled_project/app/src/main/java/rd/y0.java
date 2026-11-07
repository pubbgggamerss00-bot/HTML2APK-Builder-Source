package rd;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbh;
import com.google.android.gms.internal.p002firebaseauthapi.zzbx;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkv;
import com.google.android.gms.internal.p002firebaseauthapi.zzlg;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: c, reason: collision with root package name */
    public static y0 f23438c;

    /* renamed from: a, reason: collision with root package name */
    public final String f23439a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f23440b;

    public y0(Context context, String str) {
        zzmy zzmyVarZza;
        this.f23439a = str;
        try {
            zzks.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlg.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmyVarZza = null;
        }
        this.f23440b = zzmyVarZza;
    }

    public static y0 c(Context context, String str) {
        y0 y0Var = f23438c;
        if (y0Var == null || !zzp.zza(y0Var.f23439a, str)) {
            f23438c = new y0(context, str);
        }
        return f23438c;
    }

    public final String a() {
        if (this.f23440b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbx zzbxVarZza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.f23440b) {
                this.f23440b.zza().zzb().zza(zzbxVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f23440b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbh) this.f23440b.zza().zza(zzkv.zza(), zzbh.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
