package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t0 extends qa.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7781b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f7782a;

    public t0(byte[][] bArr) {
        com.google.android.gms.common.internal.p.b(bArr != null);
        com.google.android.gms.common.internal.p.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            com.google.android.gms.common.internal.p.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            com.google.android.gms.common.internal.p.b(bArr[i11] != null);
            int length = bArr[i11].length;
            com.google.android.gms.common.internal.p.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.f7782a = bArr;
    }

    public static t0 d(JSONObject jSONObject, boolean z10) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(g(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(p9.d.b(next));
                    if (z10) {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(g(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new t0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject e(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] f(JSONObject jSONObject) throws JSONException {
        byte[] bArrB = p9.d.b(jSONObject.getString("first"));
        if (bArrB.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrB;
        }
        byte[] bArrB2 = p9.d.b(jSONObject.getString("second"));
        if (bArrB2.length == 32) {
            return zzgj.zza(bArrB, bArrB2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] g(JSONObject jSONObject) throws JSONException {
        byte[] bArrB = p9.d.b(jSONObject.getString("first"));
        zzfv zzfvVarZza = zzfx.zza().zza();
        byte[] bArr = f7781b;
        zzfvVarZza.zza(bArr);
        zzfvVarZza.zza(bArrB);
        byte[] bArrZzd = zzfvVarZza.zzc().zzd();
        if (!jSONObject.has("second")) {
            return bArrZzd;
        }
        byte[] bArrB2 = p9.d.b(jSONObject.getString("second"));
        zzfv zzfvVarZza2 = zzfx.zza().zza();
        zzfvVarZza2.zza(bArr);
        zzfvVarZza2.zza(bArrB2);
        return zzgj.zza(bArrZzd, zzfvVarZza2.zzc().zzd());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return Arrays.deepEquals(this.f7782a, ((t0) obj).f7782a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f7782a) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        byte[][] bArr = this.f7782a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", e(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(p9.d.c(bArr[i10]), e(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e10) {
            return i8.n.d("PrfExtension{Exception:", e10.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        byte[][] bArr = this.f7782a;
        if (bArr != null) {
            int iQ2 = androidx.lifecycle.c1.q(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            androidx.lifecycle.c1.r(iQ2, parcel);
        }
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
