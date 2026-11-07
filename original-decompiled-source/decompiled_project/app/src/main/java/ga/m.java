package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class m extends qa.a {
    public static final Parcelable.Creator<m> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final String f11903a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11904b;

    public m(String str, String str2) {
        com.google.android.gms.common.internal.p.g(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        com.google.android.gms.common.internal.p.e(strTrim, "Account identifier cannot be empty");
        this.f11903a = strTrim;
        com.google.android.gms.common.internal.p.d(str2);
        this.f11904b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.o.a(this.f11903a, mVar.f11903a) && com.google.android.gms.common.internal.o.a(this.f11904b, mVar.f11904b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11903a, this.f11904b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 1, this.f11903a, false);
        c1.m(parcel, 2, this.f11904b, false);
        c1.r(iQ, parcel);
    }
}
