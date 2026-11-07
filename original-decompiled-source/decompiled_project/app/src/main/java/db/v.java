package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzh;
import db.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v extends qa.a {
    public static final Parcelable.Creator<v> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final z f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7808b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7809c;

    static {
        zzcf.zzm(zzh.zza, zzh.zzb);
        CREATOR = new x0();
    }

    public v(String str, byte[] bArr, ArrayList arrayList) {
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.f(str);
        try {
            this.f7807a = z.a(str);
            com.google.android.gms.common.internal.p.f(zzgxVarZzl);
            this.f7808b = zzgxVarZzl;
            this.f7809c = arrayList;
        } catch (z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static v d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String string = jSONObject.getString("type");
        byte[] bArrDecode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports") && (jSONArray = jSONObject.getJSONArray("transports")) != null) {
            HashSet hashSet = new HashSet(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string2 = jSONArray.getString(i10);
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        hashSet.add(Transport.a(string2));
                    } catch (Transport.a unused) {
                        Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        return new v(string, bArrDecode, arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list = vVar.f7809c;
        if (!this.f7807a.equals(vVar.f7807a) || !com.google.android.gms.common.internal.o.a(this.f7808b, vVar.f7808b)) {
            return false;
        }
        List list2 = this.f7809c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7807a, this.f7808b, this.f7809c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7807a);
        String strC = p9.d.c(this.f7808b.zzm());
        return b.o.a(androidx.room.y0.a("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strC, ", \n transports="), String.valueOf(this.f7809c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        this.f7807a.getClass();
        androidx.lifecycle.c1.m(parcel, 2, "public-key", false);
        androidx.lifecycle.c1.f(parcel, 3, this.f7808b.zzm(), false);
        androidx.lifecycle.c1.p(parcel, 4, this.f7809c, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
