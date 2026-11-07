package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.fido.zzbl;
import db.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class u extends j {
    public static final Parcelable.Creator<u> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    public final y f7785a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f7786b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7787c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7788d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f7789e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7790f;

    /* renamed from: g, reason: collision with root package name */
    public final k f7791g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f7792h;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f7793j;

    /* renamed from: k, reason: collision with root package name */
    public final c f7794k;

    /* renamed from: l, reason: collision with root package name */
    public final d f7795l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7796m;

    /* renamed from: n, reason: collision with root package name */
    public final ResultReceiver f7797n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f7798a;

        /* renamed from: b, reason: collision with root package name */
        public a0 f7799b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f7800c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f7801d;

        /* renamed from: e, reason: collision with root package name */
        public Double f7802e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f7803f;

        /* renamed from: g, reason: collision with root package name */
        public k f7804g;

        /* renamed from: h, reason: collision with root package name */
        public c f7805h;

        /* renamed from: i, reason: collision with root package name */
        public d f7806i;
    }

    public u() {
        try {
            u uVarD = d(new JSONObject((String) null));
            this.f7785a = uVarD.f7785a;
            this.f7786b = uVarD.f7786b;
            this.f7787c = uVarD.f7787c;
            this.f7788d = uVarD.f7788d;
            this.f7789e = uVarD.f7789e;
            this.f7790f = uVarD.f7790f;
            this.f7791g = uVarD.f7791g;
            this.f7792h = uVarD.f7792h;
            this.f7793j = uVarD.f7793j;
            this.f7794k = uVarD.f7794k;
            this.f7795l = uVarD.f7795l;
            this.f7796m = null;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static u d(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        k kVar;
        c cVarA;
        zzbl zzblVarZzc;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        y yVar = new y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        a0 a0Var = new a0(p9.d.b(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] bArrB = p9.d.b(jSONObject.getString("challenge"));
        com.google.android.gms.common.internal.p.f(bArrB);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                zzblVarZzc = zzbl.zzd(new w(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList2.add(zzblVarZzc.zza());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList3.add(v.d(jSONArray2.getJSONObject(i11)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            kVar = new k(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        } else {
            kVar = null;
        }
        d dVarD = jSONObject.has("extensions") ? d.d(jSONObject.getJSONObject("extensions")) : null;
        if (jSONObject.has("attestation")) {
            try {
                cVarA = c.a(jSONObject.getString("attestation"));
            } catch (c.a e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                cVarA = c.NONE;
            }
        } else {
            cVarA = null;
        }
        return new u(yVar, a0Var, bArrB, arrayList2, dValueOf, arrayList, kVar, null, null, cVarA != null ? cVarA.f7682a : null, dVarD, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        List list2 = uVar.f7788d;
        List list3 = uVar.f7790f;
        if (com.google.android.gms.common.internal.o.a(this.f7785a, uVar.f7785a) && com.google.android.gms.common.internal.o.a(this.f7786b, uVar.f7786b) && Arrays.equals(this.f7787c, uVar.f7787c) && com.google.android.gms.common.internal.o.a(this.f7789e, uVar.f7789e)) {
            List list4 = this.f7788d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f7790f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && com.google.android.gms.common.internal.o.a(this.f7791g, uVar.f7791g) && com.google.android.gms.common.internal.o.a(this.f7792h, uVar.f7792h) && com.google.android.gms.common.internal.o.a(this.f7793j, uVar.f7793j) && com.google.android.gms.common.internal.o.a(this.f7794k, uVar.f7794k) && com.google.android.gms.common.internal.o.a(this.f7795l, uVar.f7795l) && com.google.android.gms.common.internal.o.a(this.f7796m, uVar.f7796m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7785a, this.f7786b, Integer.valueOf(Arrays.hashCode(this.f7787c)), this.f7788d, this.f7789e, this.f7790f, this.f7791g, this.f7792h, this.f7793j, this.f7794k, this.f7795l, this.f7796m});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7785a);
        String strValueOf2 = String.valueOf(this.f7786b);
        String strC = p9.d.c(this.f7787c);
        String strValueOf3 = String.valueOf(this.f7788d);
        String strValueOf4 = String.valueOf(this.f7790f);
        String strValueOf5 = String.valueOf(this.f7791g);
        String strValueOf6 = String.valueOf(this.f7793j);
        String strValueOf7 = String.valueOf(this.f7794k);
        String strValueOf8 = String.valueOf(this.f7795l);
        StringBuilder sbA = androidx.room.y0.a("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        androidx.room.z0.a(sbA, strC, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbA.append(this.f7789e);
        sbA.append(", \n excludeList=");
        sbA.append(strValueOf4);
        sbA.append(", \n authenticatorSelection=");
        sbA.append(strValueOf5);
        sbA.append(", \n requestId=");
        sbA.append(this.f7792h);
        sbA.append(", \n tokenBinding=");
        sbA.append(strValueOf6);
        sbA.append(", \n attestationConveyancePreference=");
        sbA.append(strValueOf7);
        sbA.append(", \n authenticationExtensions=");
        sbA.append(strValueOf8);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 2, this.f7785a, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f7786b, i10, false);
        androidx.lifecycle.c1.f(parcel, 4, this.f7787c, false);
        androidx.lifecycle.c1.p(parcel, 5, this.f7788d, false);
        androidx.lifecycle.c1.g(parcel, 6, this.f7789e);
        androidx.lifecycle.c1.p(parcel, 7, this.f7790f, false);
        androidx.lifecycle.c1.l(parcel, 8, this.f7791g, i10, false);
        androidx.lifecycle.c1.j(parcel, 9, this.f7792h);
        androidx.lifecycle.c1.l(parcel, 10, this.f7793j, i10, false);
        c cVar = this.f7794k;
        androidx.lifecycle.c1.m(parcel, 11, cVar == null ? null : cVar.f7682a, false);
        androidx.lifecycle.c1.l(parcel, 12, this.f7795l, i10, false);
        androidx.lifecycle.c1.m(parcel, 13, this.f7796m, false);
        androidx.lifecycle.c1.l(parcel, 14, this.f7797n, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }

    public u(y yVar, a0 a0Var, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, k kVar, Integer num, d0 d0Var, String str, d dVar, String str2, ResultReceiver resultReceiver) {
        this.f7797n = resultReceiver;
        if (str2 != null) {
            try {
                u uVarD = d(new JSONObject(str2));
                this.f7785a = uVarD.f7785a;
                this.f7786b = uVarD.f7786b;
                this.f7787c = uVarD.f7787c;
                this.f7788d = uVarD.f7788d;
                this.f7789e = uVarD.f7789e;
                this.f7790f = uVarD.f7790f;
                this.f7791g = uVarD.f7791g;
                this.f7792h = uVarD.f7792h;
                this.f7793j = uVarD.f7793j;
                this.f7794k = uVarD.f7794k;
                this.f7795l = uVarD.f7795l;
                this.f7796m = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        com.google.android.gms.common.internal.p.f(yVar);
        this.f7785a = yVar;
        com.google.android.gms.common.internal.p.f(a0Var);
        this.f7786b = a0Var;
        com.google.android.gms.common.internal.p.f(bArr);
        this.f7787c = bArr;
        com.google.android.gms.common.internal.p.f(arrayList);
        this.f7788d = arrayList;
        this.f7789e = d10;
        this.f7790f = arrayList2;
        this.f7791g = kVar;
        this.f7792h = num;
        this.f7793j = d0Var;
        if (str != null) {
            try {
                this.f7794k = c.a(str);
            } catch (c.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f7794k = null;
        }
        this.f7795l = dVar;
        this.f7796m = null;
    }
}
