package rd;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzbe;
import com.google.android.gms.internal.p002firebaseauthapi.zzcn;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f23422a;

    /* renamed from: b, reason: collision with root package name */
    public String f23423b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f23424c;

    /* renamed from: d, reason: collision with root package name */
    public sa.a f23425d;

    public final String a(String str) {
        String str2;
        String string = this.f23424c.getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        o0 o0VarA = o0.a(this.f23422a, this.f23423b);
        String strSubstring = string.substring(10);
        o0VarA.getClass();
        com.google.android.gms.common.internal.p.f(strSubstring);
        zzmy zzmyVar = o0VarA.f23412b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbe) o0VarA.f23412b.zza().zza(zzcn.zza(), zzbe.class)).zza(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e10) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }

    public final g b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        i iVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(d.d(jSONArray3.getString(i10)));
            }
            g gVar = new g(id.e.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                gVar.n(zzahn.zzb(string));
            }
            if (!z10) {
                gVar.f23372h = Boolean.FALSE;
            }
            gVar.f23371g = str;
            if (jSONObject.has("userMetadata") && (iVarA = i.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                gVar.f23373j = iVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? qd.b0.f(jSONObject2) : Objects.equals(strOptString, "totp") ? qd.e0.f(jSONObject2) : null);
                }
                gVar.r(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(qd.n0.e(new JSONObject(jSONArray.getString(i12))));
                }
                gVar.f23377n = arrayList3;
            }
            return gVar;
        } catch (zzaag e10) {
            e = e10;
            Log.wtf(this.f23425d.f24792a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            Log.wtf(this.f23425d.f24792a, e);
            return null;
        } catch (IllegalArgumentException e12) {
            e = e12;
            Log.wtf(this.f23425d.f24792a, e);
            return null;
        } catch (JSONException e13) {
            e = e13;
            Log.wtf(this.f23425d.f24792a, e);
            return null;
        }
    }

    public final void c(String str, String str2) {
        String strEncodeToString;
        o0 o0VarA = o0.a(this.f23422a, this.f23423b);
        o0VarA.getClass();
        com.google.android.gms.common.internal.p.f(str2);
        zzmy zzmyVar = o0VarA.f23412b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    strEncodeToString = Base64.encodeToString(((zzbe) o0VarA.f23412b.zza().zza(zzcn.zza(), zzbe.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e10) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e10.getMessage());
            }
        }
        if (str3 != null) {
            this.f23424c.edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }
}
