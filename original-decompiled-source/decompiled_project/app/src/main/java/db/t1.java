package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t1 extends qa.a {
    public static final Parcelable.Creator<t1> CREATOR = new u1();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7783a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f7784b;

    public t1(boolean z10, zzgx zzgxVar) {
        this.f7783a = z10;
        this.f7784b = zzgxVar;
    }

    public final JSONObject d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f7783a) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.f7784b;
            byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
            if (bArrZzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrZzm, 32), 11));
                if (bArrZzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrZzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f7783a == t1Var.f7783a && com.google.android.gms.common.internal.o.a(this.f7784b, t1Var.f7784b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f7783a), this.f7784b});
    }

    public final String toString() {
        return i8.n.d("AuthenticationExtensionsPrfOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.s(parcel, 1, 4);
        parcel.writeInt(this.f7783a ? 1 : 0);
        zzgx zzgxVar = this.f7784b;
        androidx.lifecycle.c1.f(parcel, 2, zzgxVar == null ? null : zzgxVar.zzm(), false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
