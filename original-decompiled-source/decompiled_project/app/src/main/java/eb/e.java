package eb;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final b f8658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8660c;

    public e(b bVar, String str, String str2) {
        p.f(bVar);
        this.f8658a = bVar;
        this.f8660c = str;
        this.f8659b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f8659b;
        String str2 = eVar.f8660c;
        String str3 = this.f8660c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.f8658a.equals(eVar.f8658a)) {
            return false;
        }
        String str4 = this.f8659b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f8660c;
        int iHashCode = this.f8658a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f8659b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        b bVar = this.f8658a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(bVar.f8648b, 11));
            c cVar = bVar.f8649c;
            if (cVar != c.UNKNOWN) {
                jSONObject.put("version", cVar.f8653a);
            }
            List list = bVar.f8650d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f8660c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f8659b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 2, this.f8658a, i10, false);
        c1.m(parcel, 3, this.f8660c, false);
        c1.m(parcel, 4, this.f8659b, false);
        c1.r(iQ, parcel);
    }
}
