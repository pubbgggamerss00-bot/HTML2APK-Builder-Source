package rd;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcy;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: c, reason: collision with root package name */
    public static o0 f23410c;

    /* renamed from: a, reason: collision with root package name */
    public final String f23411a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f23412b;

    public o0(String str, zzmy zzmyVar) {
        this.f23411a = str;
        this.f23412b = zzmyVar;
    }

    public static o0 a(Context context, String str) {
        zzmy zzmyVarZza;
        o0 o0Var = f23410c;
        if (o0Var == null || !zzp.zza(o0Var.f23411a, str)) {
            try {
                zzco.zza();
                zzmyVarZza = new zzmy.zza().zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcy.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
            } catch (IOException | GeneralSecurityException e10) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
                zzmyVarZza = null;
            }
            f23410c = new o0(str, zzmyVarZza);
        }
        return f23410c;
    }
}
