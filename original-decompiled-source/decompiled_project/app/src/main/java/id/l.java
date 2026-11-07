package id;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.s;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f14492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14493b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14494c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14495d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14496e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14497f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14498g;

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = wa.f.f31487a;
        p.h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f14493b = str;
        this.f14492a = str2;
        this.f14494c = str3;
        this.f14495d = str4;
        this.f14496e = str5;
        this.f14497f = str6;
        this.f14498g = str7;
    }

    public static l a(Context context) {
        s sVar = new s(context);
        String strA = sVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new l(strA, sVar.a("google_api_key"), sVar.a("firebase_database_url"), sVar.a("ga_trackingId"), sVar.a("gcm_defaultSenderId"), sVar.a("google_storage_bucket"), sVar.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return o.a(this.f14493b, lVar.f14493b) && o.a(this.f14492a, lVar.f14492a) && o.a(this.f14494c, lVar.f14494c) && o.a(this.f14495d, lVar.f14495d) && o.a(this.f14496e, lVar.f14496e) && o.a(this.f14497f, lVar.f14497f) && o.a(this.f14498g, lVar.f14498g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14493b, this.f14492a, this.f14494c, this.f14495d, this.f14496e, this.f14497f, this.f14498g});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f14493b, "applicationId");
        aVar.a(this.f14492a, "apiKey");
        aVar.a(this.f14494c, "databaseUrl");
        aVar.a(this.f14496e, "gcmSenderId");
        aVar.a(this.f14497f, "storageBucket");
        aVar.a(this.f14498g, "projectId");
        return aVar.toString();
    }
}
