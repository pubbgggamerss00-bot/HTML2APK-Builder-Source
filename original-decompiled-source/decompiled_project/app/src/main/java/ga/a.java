package ga;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final String f11852a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11853b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11854c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11855d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f11856e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f11857f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f11852a = str;
        this.f11853b = str2;
        this.f11854c = str3;
        com.google.android.gms.common.internal.p.f(arrayList);
        this.f11855d = arrayList;
        this.f11857f = pendingIntent;
        this.f11856e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.o.a(this.f11852a, aVar.f11852a) && com.google.android.gms.common.internal.o.a(this.f11853b, aVar.f11853b) && com.google.android.gms.common.internal.o.a(this.f11854c, aVar.f11854c) && com.google.android.gms.common.internal.o.a(this.f11855d, aVar.f11855d) && com.google.android.gms.common.internal.o.a(this.f11857f, aVar.f11857f) && com.google.android.gms.common.internal.o.a(this.f11856e, aVar.f11856e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11852a, this.f11853b, this.f11854c, this.f11855d, this.f11857f, this.f11856e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f11852a, false);
        c1.m(parcel, 2, this.f11853b, false);
        c1.m(parcel, 3, this.f11854c, false);
        c1.n(parcel, 4, this.f11855d);
        c1.l(parcel, 5, this.f11856e, i10, false);
        c1.l(parcel, 6, this.f11857f, i10, false);
        c1.r(iQ, parcel);
    }
}
