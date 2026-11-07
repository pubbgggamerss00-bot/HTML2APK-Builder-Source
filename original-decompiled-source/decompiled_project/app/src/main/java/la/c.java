package la;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends qa.a {
    public static final Parcelable.Creator<c> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public final Bundle f16923a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16924b;

    public static class a extends qa.a {
        public static final Parcelable.Creator<a> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f16925a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16926b;

        public a(byte[] bArr, String str) {
            this.f16925a = bArr;
            this.f16926b = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f16925a, ((a) obj).f16925a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f16925a))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.f(parcel, 1, this.f16925a, false);
            c1.m(parcel, 2, this.f16926b, false);
            c1.r(iQ, parcel);
        }
    }

    public c(Bundle bundle, ArrayList arrayList) {
        this.f16923a = bundle;
        this.f16924b = arrayList;
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            map.put(aVar.f16926b, aVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.e(parcel, 1, this.f16923a, false);
        c1.p(parcel, 2, this.f16924b, false);
        c1.r(iQ, parcel);
    }
}
