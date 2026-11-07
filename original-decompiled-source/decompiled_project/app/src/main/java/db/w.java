package db;

import android.os.Parcel;
import android.os.Parcelable;
import db.o;
import db.z;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w extends qa.a {
    public static final Parcelable.Creator<w> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final z f7810a;

    /* renamed from: b, reason: collision with root package name */
    public final o f7811b;

    public w(String str, int i10) {
        com.google.android.gms.common.internal.p.f(str);
        try {
            this.f7810a = z.a(str);
            try {
                this.f7811b = o.a(i10);
            } catch (o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f7810a.equals(wVar.f7810a) && this.f7811b.equals(wVar.f7811b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7810a, this.f7811b});
    }

    public final String toString() {
        return p5.g0.a("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f7810a), ", \n algorithm=", String.valueOf(this.f7811b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [db.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = androidx.lifecycle.c1.q(20293, parcel);
        this.f7810a.getClass();
        androidx.lifecycle.c1.m(parcel, 2, "public-key", false);
        androidx.lifecycle.c1.j(parcel, 3, Integer.valueOf(this.f7811b.f7746a.a()));
        androidx.lifecycle.c1.r(iQ, parcel);
    }
}
