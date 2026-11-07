package db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new o1();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f7706a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f7707b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7708c;

    /* renamed from: d, reason: collision with root package name */
    public final t1 f7709d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7710e;

    public e(g0 g0Var, r1 r1Var, f fVar, t1 t1Var, String str) {
        this.f7706a = g0Var;
        this.f7707b = r1Var;
        this.f7708c = fVar;
        this.f7709d = t1Var;
        this.f7710e = str;
    }

    public final JSONObject d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            f fVar = this.f7708c;
            if (fVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", fVar.f7714a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            g0 g0Var = this.f7706a;
            if (g0Var != null) {
                jSONObject.put("uvm", g0Var.d());
            }
            t1 t1Var = this.f7709d;
            if (t1Var != null) {
                jSONObject.put("prf", t1Var.d());
            }
            String str = this.f7710e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.android.gms.common.internal.o.a(this.f7706a, eVar.f7706a) && com.google.android.gms.common.internal.o.a(this.f7707b, eVar.f7707b) && com.google.android.gms.common.internal.o.a(this.f7708c, eVar.f7708c) && com.google.android.gms.common.internal.o.a(this.f7709d, eVar.f7709d) && com.google.android.gms.common.internal.o.a(this.f7710e, eVar.f7710e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7706a, this.f7707b, this.f7708c, this.f7709d, this.f7710e});
    }

    public final String toString() {
        return i8.n.d("AuthenticationExtensionsClientOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.l(parcel, 1, this.f7706a, i10, false);
        androidx.lifecycle.c1.l(parcel, 2, this.f7707b, i10, false);
        androidx.lifecycle.c1.l(parcel, 3, this.f7708c, i10, false);
        androidx.lifecycle.c1.l(parcel, 4, this.f7709d, i10, false);
        androidx.lifecycle.c1.m(parcel, 5, this.f7710e, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
