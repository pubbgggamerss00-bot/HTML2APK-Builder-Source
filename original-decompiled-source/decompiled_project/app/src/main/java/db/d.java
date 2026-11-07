package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new p1();

    /* renamed from: a, reason: collision with root package name */
    public final r f7690a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f7691b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f7692c;

    /* renamed from: d, reason: collision with root package name */
    public final k2 f7693d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f7694e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f7695f;

    /* renamed from: g, reason: collision with root package name */
    public final g2 f7696g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f7697h;

    /* renamed from: j, reason: collision with root package name */
    public final s f7698j;

    /* renamed from: k, reason: collision with root package name */
    public final t0 f7699k;

    /* renamed from: l, reason: collision with root package name */
    public final e1 f7700l;

    /* renamed from: m, reason: collision with root package name */
    public final r0 f7701m;

    public d(r rVar, e2 e2Var, e0 e0Var, k2 k2Var, k0 k0Var, m0 m0Var, g2 g2Var, p0 p0Var, s sVar, t0 t0Var, e1 e1Var, r0 r0Var) {
        this.f7690a = rVar;
        this.f7692c = e0Var;
        this.f7691b = e2Var;
        this.f7693d = k2Var;
        this.f7694e = k0Var;
        this.f7695f = m0Var;
        this.f7696g = g2Var;
        this.f7697h = p0Var;
        this.f7698j = sVar;
        this.f7699k = t0Var;
        this.f7700l = e1Var;
        this.f7701m = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d d(JSONObject jSONObject) throws JSONException {
        t0 t0Var;
        t0 t0VarD;
        e2 e2Var;
        g2 g2Var;
        r rVar = jSONObject.has("fidoAppIdExtension") ? new r(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
        if (jSONObject.has("appid")) {
            rVar = new r(jSONObject.getString("appid"));
        }
        r rVar2 = rVar;
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            t0VarD = t0.d(jSONObject.getJSONObject("prf"), false);
        } else {
            if (!jSONObject.has("prfAlreadyHashed")) {
                t0Var = null;
                if (jSONObject.has("cableAuthenticationExtension")) {
                    e2Var = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        arrayList.add(new c2(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
                    }
                    e2Var = new e2(arrayList);
                }
                e0 e0Var = !jSONObject.has("userVerificationMethodExtension") ? new e0(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                k2 k2Var = !jSONObject.has("google_multiAssertionExtension") ? new k2(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                k0 k0Var = !jSONObject.has("google_sessionIdExtension") ? new k0(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                m0 m0Var = !jSONObject.has("google_silentVerificationExtension") ? new m0(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                if (jSONObject.has("devicePublicKeyExtension")) {
                    g2Var = null;
                } else {
                    jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    g2Var = new g2();
                }
                return new d(rVar2, e2Var, e0Var, k2Var, k0Var, m0Var, g2Var, !jSONObject.has("google_tunnelServerIdExtension") ? new p0(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new s(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, t0Var, jSONObject.has("txAuthSimple") ? new e1(jSONObject.getString("txAuthSimple")) : null, null);
            }
            t0VarD = t0.d(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        t0Var = t0VarD;
        if (jSONObject.has("cableAuthenticationExtension")) {
        }
        if (!jSONObject.has("userVerificationMethodExtension")) {
        }
        if (!jSONObject.has("google_multiAssertionExtension")) {
        }
        if (!jSONObject.has("google_sessionIdExtension")) {
        }
        if (!jSONObject.has("google_silentVerificationExtension")) {
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
        }
        return new d(rVar2, e2Var, e0Var, k2Var, k0Var, m0Var, g2Var, !jSONObject.has("google_tunnelServerIdExtension") ? new p0(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new s(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, t0Var, jSONObject.has("txAuthSimple") ? new e1(jSONObject.getString("txAuthSimple")) : null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.google.android.gms.common.internal.o.a(this.f7690a, dVar.f7690a) && com.google.android.gms.common.internal.o.a(this.f7691b, dVar.f7691b) && com.google.android.gms.common.internal.o.a(this.f7692c, dVar.f7692c) && com.google.android.gms.common.internal.o.a(this.f7693d, dVar.f7693d) && com.google.android.gms.common.internal.o.a(this.f7694e, dVar.f7694e) && com.google.android.gms.common.internal.o.a(this.f7695f, dVar.f7695f) && com.google.android.gms.common.internal.o.a(this.f7696g, dVar.f7696g) && com.google.android.gms.common.internal.o.a(this.f7697h, dVar.f7697h) && com.google.android.gms.common.internal.o.a(this.f7698j, dVar.f7698j) && com.google.android.gms.common.internal.o.a(this.f7699k, dVar.f7699k) && com.google.android.gms.common.internal.o.a(this.f7700l, dVar.f7700l) && com.google.android.gms.common.internal.o.a(this.f7701m, dVar.f7701m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7690a, this.f7691b, this.f7692c, this.f7693d, this.f7694e, this.f7695f, this.f7696g, this.f7697h, this.f7698j, this.f7699k, this.f7700l, this.f7701m});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7690a);
        String strValueOf2 = String.valueOf(this.f7691b);
        String strValueOf3 = String.valueOf(this.f7692c);
        String strValueOf4 = String.valueOf(this.f7693d);
        String strValueOf5 = String.valueOf(this.f7694e);
        String strValueOf6 = String.valueOf(this.f7695f);
        String strValueOf7 = String.valueOf(this.f7696g);
        String strValueOf8 = String.valueOf(this.f7697h);
        String strValueOf9 = String.valueOf(this.f7698j);
        String strValueOf10 = String.valueOf(this.f7699k);
        String strValueOf11 = String.valueOf(this.f7700l);
        StringBuilder sbA = androidx.room.y0.a("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        androidx.room.z0.a(sbA, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        androidx.room.z0.a(sbA, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        androidx.room.z0.a(sbA, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        androidx.room.z0.a(sbA, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return b.o.a(sbA, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 2, this.f7690a, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f7691b, i10, false);
        androidx.lifecycle.c1.l(parcel, 4, this.f7692c, i10, false);
        androidx.lifecycle.c1.l(parcel, 5, this.f7693d, i10, false);
        androidx.lifecycle.c1.l(parcel, 6, this.f7694e, i10, false);
        androidx.lifecycle.c1.l(parcel, 7, this.f7695f, i10, false);
        androidx.lifecycle.c1.l(parcel, 8, this.f7696g, i10, false);
        androidx.lifecycle.c1.l(parcel, 9, this.f7697h, i10, false);
        androidx.lifecycle.c1.l(parcel, 10, this.f7698j, i10, false);
        androidx.lifecycle.c1.l(parcel, 11, this.f7699k, i10, false);
        androidx.lifecycle.c1.l(parcel, 12, this.f7700l, i10, false);
        androidx.lifecycle.c1.l(parcel, 13, this.f7701m, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
