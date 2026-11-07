package db;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x extends j {
    public static final Parcelable.Creator<x> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7812a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f7813b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7814c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7815d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f7816e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f7817f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f7818g;

    /* renamed from: h, reason: collision with root package name */
    public final d f7819h;

    /* renamed from: j, reason: collision with root package name */
    public final Long f7820j;

    /* renamed from: k, reason: collision with root package name */
    public final ResultReceiver f7821k;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131 A[Catch: l1 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {l1 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, d0 d0Var, String str2, d dVar, Long l10, String str3, ResultReceiver resultReceiver) throws JSONException {
        Double d11;
        Double dValueOf;
        JSONArray jSONArray;
        ArrayList arrayList2;
        d0 d0Var2;
        d dVar2;
        d dVarD;
        this.f7821k = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            com.google.android.gms.common.internal.p.f(bArr);
            this.f7812a = bArr;
            this.f7813b = d10;
            com.google.android.gms.common.internal.p.f(str);
            this.f7814c = str;
            this.f7815d = arrayList;
            this.f7816e = num;
            this.f7817f = d0Var;
            this.f7820j = l10;
            if (str2 != null) {
                try {
                    this.f7818g = f0.a(str2);
                } catch (l1 e10) {
                    throw new IllegalArgumentException(e10);
                }
            } else {
                this.f7818g = null;
            }
            this.f7819h = dVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            byte[] bArrB = p9.d.b(jSONObject.getString("challenge"));
            com.google.android.gms.common.internal.p.f(bArrB);
            if (jSONObject.has("timeout")) {
                dValueOf = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
            } else {
                if (!jSONObject.has("timeoutSeconds")) {
                    d11 = null;
                    String string = jSONObject.getString("rpId");
                    com.google.android.gms.common.internal.p.f(string);
                    jSONArray = !jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
                    if (jSONArray == null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList3.add(v.d(jSONArray.getJSONObject(i10)));
                        }
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = null;
                    }
                    Integer numValueOf = !jSONObject.has("requestId") ? Integer.valueOf(jSONObject.getInt("requestId")) : null;
                    if (jSONObject.has("tokenBinding")) {
                        d0Var2 = null;
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                        d0Var2 = new d0(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
                    }
                    f0 f0VarA = !jSONObject.has("userVerification") ? f0.a(jSONObject.getString("userVerification")) : null;
                    if (!jSONObject.has("authenticationExtensions")) {
                        dVarD = d.d(jSONObject.getJSONObject("authenticationExtensions"));
                    } else {
                        if (!jSONObject.has("extensions")) {
                            dVar2 = null;
                            x xVar = new x(bArrB, d11, string, arrayList2, numValueOf, d0Var2, f0VarA != null ? f0VarA.f7716a : null, dVar2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                            this.f7812a = xVar.f7812a;
                            this.f7813b = xVar.f7813b;
                            this.f7814c = xVar.f7814c;
                            this.f7815d = xVar.f7815d;
                            this.f7816e = xVar.f7816e;
                            this.f7817f = xVar.f7817f;
                            this.f7818g = xVar.f7818g;
                            this.f7819h = xVar.f7819h;
                            this.f7820j = xVar.f7820j;
                        }
                        dVarD = d.d(jSONObject.getJSONObject("extensions"));
                    }
                    dVar2 = dVarD;
                    x xVar2 = new x(bArrB, d11, string, arrayList2, numValueOf, d0Var2, f0VarA != null ? f0VarA.f7716a : null, dVar2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                    this.f7812a = xVar2.f7812a;
                    this.f7813b = xVar2.f7813b;
                    this.f7814c = xVar2.f7814c;
                    this.f7815d = xVar2.f7815d;
                    this.f7816e = xVar2.f7816e;
                    this.f7817f = xVar2.f7817f;
                    this.f7818g = xVar2.f7818g;
                    this.f7819h = xVar2.f7819h;
                    this.f7820j = xVar2.f7820j;
                }
                dValueOf = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            }
            d11 = dValueOf;
            String string2 = jSONObject.getString("rpId");
            com.google.android.gms.common.internal.p.f(string2);
            if (!jSONObject.has("allowList")) {
            }
            if (jSONArray == null) {
            }
            if (!jSONObject.has("requestId")) {
            }
            if (jSONObject.has("tokenBinding")) {
            }
            if (!jSONObject.has("userVerification")) {
            }
            if (!jSONObject.has("authenticationExtensions")) {
            }
            dVar2 = dVarD;
            x xVar22 = new x(bArrB, d11, string2, arrayList2, numValueOf, d0Var2, f0VarA != null ? f0VarA.f7716a : null, dVar2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
            this.f7812a = xVar22.f7812a;
            this.f7813b = xVar22.f7813b;
            this.f7814c = xVar22.f7814c;
            this.f7815d = xVar22.f7815d;
            this.f7816e = xVar22.f7816e;
            this.f7817f = xVar22.f7817f;
            this.f7818g = xVar22.f7818g;
            this.f7819h = xVar22.f7819h;
            this.f7820j = xVar22.f7820j;
        } catch (l1 e11) {
            e = e11;
            throw new IllegalArgumentException(e);
        } catch (JSONException e12) {
            e = e12;
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        List list2 = xVar.f7815d;
        return Arrays.equals(this.f7812a, xVar.f7812a) && com.google.android.gms.common.internal.o.a(this.f7813b, xVar.f7813b) && com.google.android.gms.common.internal.o.a(this.f7814c, xVar.f7814c) && (((list = this.f7815d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && com.google.android.gms.common.internal.o.a(this.f7816e, xVar.f7816e) && com.google.android.gms.common.internal.o.a(this.f7817f, xVar.f7817f) && com.google.android.gms.common.internal.o.a(this.f7818g, xVar.f7818g) && com.google.android.gms.common.internal.o.a(this.f7819h, xVar.f7819h) && com.google.android.gms.common.internal.o.a(this.f7820j, xVar.f7820j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f7812a)), this.f7813b, this.f7814c, this.f7815d, this.f7816e, this.f7817f, this.f7818g, this.f7819h, this.f7820j});
    }

    public final String toString() {
        String strC = p9.d.c(this.f7812a);
        String strValueOf = String.valueOf(this.f7815d);
        String strValueOf2 = String.valueOf(this.f7817f);
        String strValueOf3 = String.valueOf(this.f7818g);
        String strValueOf4 = String.valueOf(this.f7819h);
        StringBuilder sbA = e.e.a("PublicKeyCredentialRequestOptions{\n challenge=", strC, ", \n timeoutSeconds=");
        sbA.append(this.f7813b);
        sbA.append(", \n rpId='");
        androidx.room.z0.a(sbA, this.f7814c, "', \n allowList=", strValueOf, ", \n requestId=");
        sbA.append(this.f7816e);
        sbA.append(", \n tokenBinding=");
        sbA.append(strValueOf2);
        sbA.append(", \n userVerification=");
        androidx.room.z0.a(sbA, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbA.append(this.f7820j);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        androidx.lifecycle.c1.f(parcel, 2, this.f7812a, false);
        androidx.lifecycle.c1.g(parcel, 3, this.f7813b);
        androidx.lifecycle.c1.m(parcel, 4, this.f7814c, false);
        androidx.lifecycle.c1.p(parcel, 5, this.f7815d, false);
        androidx.lifecycle.c1.j(parcel, 6, this.f7816e);
        androidx.lifecycle.c1.l(parcel, 7, this.f7817f, i10, false);
        f0 f0Var = this.f7818g;
        androidx.lifecycle.c1.m(parcel, 8, f0Var == null ? null : f0Var.f7716a, false);
        androidx.lifecycle.c1.l(parcel, 9, this.f7819h, i10, false);
        androidx.lifecycle.c1.k(parcel, 10, this.f7820j);
        androidx.lifecycle.c1.l(parcel, 12, this.f7821k, i10, false);
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
