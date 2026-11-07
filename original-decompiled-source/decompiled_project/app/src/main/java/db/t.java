package db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t extends qa.a {
    public static final Parcelable.Creator<t> CREATOR = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final String f7772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7773b;

    /* renamed from: c, reason: collision with root package name */
    public final zzgx f7774c;

    /* renamed from: d, reason: collision with root package name */
    public final h f7775d;

    /* renamed from: e, reason: collision with root package name */
    public final g f7776e;

    /* renamed from: f, reason: collision with root package name */
    public final i f7777f;

    /* renamed from: g, reason: collision with root package name */
    public final e f7778g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7779h;

    /* renamed from: j, reason: collision with root package name */
    public String f7780j;

    public t(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        boolean z10 = false;
        zzgx zzgxVarZzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.common.internal.p.a("Must provide a response object.", (hVar != null && gVar == null && iVar == null) || (hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null));
        if (iVar != null || (str != null && zzgxVarZzl != null)) {
            z10 = true;
        }
        com.google.android.gms.common.internal.p.a("Must provide id and rawId if not an error response.", z10);
        this.f7772a = str;
        this.f7773b = str2;
        this.f7774c = zzgxVarZzl;
        this.f7775d = hVar;
        this.f7776e = gVar;
        this.f7777f = iVar;
        this.f7778g = eVar;
        this.f7779h = str3;
        this.f7780j = null;
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObjectD;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f7774c;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", p9.d.c(zzgxVar.zzm()));
            }
            String str = this.f7779h;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f7773b;
            i iVar = this.f7777f;
            if (str2 != null && iVar == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f7772a;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            g gVar = this.f7776e;
            boolean z10 = true;
            if (gVar != null) {
                jSONObjectD = gVar.d();
            } else {
                h hVar = this.f7775d;
                if (hVar != null) {
                    jSONObjectD = hVar.d();
                } else {
                    z10 = false;
                    if (iVar != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", iVar.f7730a.f7763a);
                            String str5 = iVar.f7731b;
                            if (str5 != null) {
                                jSONObject2.put("message", str5);
                            }
                            jSONObjectD = jSONObject2;
                            str4 = "error";
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                        }
                    } else {
                        jSONObjectD = null;
                    }
                }
            }
            if (jSONObjectD != null) {
                jSONObject.put(str4, jSONObjectD);
            }
            e eVar = this.f7778g;
            if (eVar != null) {
                jSONObject.put("clientExtensionResults", eVar.d());
                return jSONObject;
            }
            if (z10) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return com.google.android.gms.common.internal.o.a(this.f7772a, tVar.f7772a) && com.google.android.gms.common.internal.o.a(this.f7773b, tVar.f7773b) && com.google.android.gms.common.internal.o.a(this.f7774c, tVar.f7774c) && com.google.android.gms.common.internal.o.a(this.f7775d, tVar.f7775d) && com.google.android.gms.common.internal.o.a(this.f7776e, tVar.f7776e) && com.google.android.gms.common.internal.o.a(this.f7777f, tVar.f7777f) && com.google.android.gms.common.internal.o.a(this.f7778g, tVar.f7778g) && com.google.android.gms.common.internal.o.a(this.f7779h, tVar.f7779h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7772a, this.f7773b, this.f7774c, this.f7776e, this.f7775d, this.f7777f, this.f7778g, this.f7779h});
    }

    public final String toString() {
        zzgx zzgxVar = this.f7774c;
        String strC = p9.d.c(zzgxVar == null ? null : zzgxVar.zzm());
        String strValueOf = String.valueOf(this.f7775d);
        String strValueOf2 = String.valueOf(this.f7776e);
        String strValueOf3 = String.valueOf(this.f7777f);
        String strValueOf4 = String.valueOf(this.f7778g);
        StringBuilder sbA = androidx.room.y0.a("PublicKeyCredential{\n id='", this.f7772a, "', \n type='", this.f7773b, "', \n rawId=");
        androidx.room.z0.a(sbA, strC, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        androidx.room.z0.a(sbA, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        sbA.append(strValueOf4);
        sbA.append(", \n authenticatorAttachment='");
        sbA.append(this.f7779h);
        sbA.append("'}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (zzia.zzc()) {
            this.f7780j = d().toString();
        }
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.m(parcel, 1, this.f7772a, false);
        androidx.lifecycle.c1.m(parcel, 2, this.f7773b, false);
        zzgx zzgxVar = this.f7774c;
        androidx.lifecycle.c1.f(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        androidx.lifecycle.c1.l(parcel, 4, this.f7775d, i10, false);
        androidx.lifecycle.c1.l(parcel, 5, this.f7776e, i10, false);
        androidx.lifecycle.c1.l(parcel, 6, this.f7777f, i10, false);
        androidx.lifecycle.c1.l(parcel, 7, this.f7778g, i10, false);
        androidx.lifecycle.c1.m(parcel, 8, this.f7779h, false);
        androidx.lifecycle.c1.m(parcel, 9, this.f7780j, false);
        androidx.lifecycle.c1.r(iQ, parcel);
        this.f7780j = null;
    }
}
