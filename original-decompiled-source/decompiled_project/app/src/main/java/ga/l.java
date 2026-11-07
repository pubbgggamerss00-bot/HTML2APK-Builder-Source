package ga;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class l extends qa.a {
    public static final Parcelable.Creator<l> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f11894a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11895b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11896c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11897d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f11898e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11899f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11900g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11901h;

    /* renamed from: j, reason: collision with root package name */
    public final db.t f11902j;

    public l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, db.t tVar) {
        com.google.android.gms.common.internal.p.f(str);
        this.f11894a = str;
        this.f11895b = str2;
        this.f11896c = str3;
        this.f11897d = str4;
        this.f11898e = uri;
        this.f11899f = str5;
        this.f11900g = str6;
        this.f11901h = str7;
        this.f11902j = tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.o.a(this.f11894a, lVar.f11894a) && com.google.android.gms.common.internal.o.a(this.f11895b, lVar.f11895b) && com.google.android.gms.common.internal.o.a(this.f11896c, lVar.f11896c) && com.google.android.gms.common.internal.o.a(this.f11897d, lVar.f11897d) && com.google.android.gms.common.internal.o.a(this.f11898e, lVar.f11898e) && com.google.android.gms.common.internal.o.a(this.f11899f, lVar.f11899f) && com.google.android.gms.common.internal.o.a(this.f11900g, lVar.f11900g) && com.google.android.gms.common.internal.o.a(this.f11901h, lVar.f11901h) && com.google.android.gms.common.internal.o.a(this.f11902j, lVar.f11902j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11894a, this.f11895b, this.f11896c, this.f11897d, this.f11898e, this.f11899f, this.f11900g, this.f11901h, this.f11902j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f11894a, false);
        c1.m(parcel, 2, this.f11895b, false);
        c1.m(parcel, 3, this.f11896c, false);
        c1.m(parcel, 4, this.f11897d, false);
        c1.l(parcel, 5, this.f11898e, i10, false);
        c1.m(parcel, 6, this.f11899f, false);
        c1.m(parcel, 7, this.f11900g, false);
        c1.m(parcel, 8, this.f11901h, false);
        c1.l(parcel, 9, this.f11902j, i10, false);
        c1.r(iQ, parcel);
    }
}
