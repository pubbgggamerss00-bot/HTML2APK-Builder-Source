package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

@Deprecated
/* loaded from: classes2.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final d f11858a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11860c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11861d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11862e;

    /* renamed from: f, reason: collision with root package name */
    public final c f11863f;

    /* renamed from: g, reason: collision with root package name */
    public final C0104b f11864g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11865h;

    @Deprecated
    public static final class a extends qa.a {
        public static final Parcelable.Creator<a> CREATOR = new w();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11866a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11867b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11868c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f11869d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11870e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f11871f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f11872g;

        /* renamed from: ga.b$a$a, reason: collision with other inner class name */
        public static final class C0103a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f11873a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f11874b;

            public final a a() {
                return new a(this.f11873a, null, null, this.f11874b, null, null, false);
            }
        }

        public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            com.google.android.gms.common.internal.p.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
            this.f11866a = z10;
            if (z10) {
                com.google.android.gms.common.internal.p.g(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f11867b = str;
            this.f11868c = str2;
            this.f11869d = z11;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f11871f = arrayList2;
            this.f11870e = str3;
            this.f11872g = z12;
        }

        public static C0103a d() {
            C0103a c0103a = new C0103a();
            c0103a.f11873a = false;
            c0103a.f11874b = true;
            return c0103a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11866a == aVar.f11866a && com.google.android.gms.common.internal.o.a(this.f11867b, aVar.f11867b) && com.google.android.gms.common.internal.o.a(this.f11868c, aVar.f11868c) && this.f11869d == aVar.f11869d && com.google.android.gms.common.internal.o.a(this.f11870e, aVar.f11870e) && com.google.android.gms.common.internal.o.a(this.f11871f, aVar.f11871f) && this.f11872g == aVar.f11872g;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11866a), this.f11867b, this.f11868c, Boolean.valueOf(this.f11869d), this.f11870e, this.f11871f, Boolean.valueOf(this.f11872g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11866a ? 1 : 0);
            c1.m(parcel, 2, this.f11867b, false);
            c1.m(parcel, 3, this.f11868c, false);
            c1.s(parcel, 4, 4);
            parcel.writeInt(this.f11869d ? 1 : 0);
            c1.m(parcel, 5, this.f11870e, false);
            c1.n(parcel, 6, this.f11871f);
            c1.s(parcel, 7, 4);
            parcel.writeInt(this.f11872g ? 1 : 0);
            c1.r(iQ, parcel);
        }
    }

    @Deprecated
    /* renamed from: ga.b$b, reason: collision with other inner class name */
    public static final class C0104b extends qa.a {
        public static final Parcelable.Creator<C0104b> CREATOR = new x();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11875a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11876b;

        public C0104b(boolean z10, String str) {
            if (z10) {
                com.google.android.gms.common.internal.p.f(str);
            }
            this.f11875a = z10;
            this.f11876b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0104b)) {
                return false;
            }
            C0104b c0104b = (C0104b) obj;
            return this.f11875a == c0104b.f11875a && com.google.android.gms.common.internal.o.a(this.f11876b, c0104b.f11876b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11875a), this.f11876b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11875a ? 1 : 0);
            c1.m(parcel, 2, this.f11876b, false);
            c1.r(iQ, parcel);
        }
    }

    @Deprecated
    public static final class c extends qa.a {
        public static final Parcelable.Creator<c> CREATOR = new y();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11877a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f11878b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11879c;

        public c(String str, boolean z10, byte[] bArr) {
            if (z10) {
                com.google.android.gms.common.internal.p.f(bArr);
                com.google.android.gms.common.internal.p.f(str);
            }
            this.f11877a = z10;
            this.f11878b = bArr;
            this.f11879c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11877a == cVar.f11877a && Arrays.equals(this.f11878b, cVar.f11878b) && Objects.equals(this.f11879c, cVar.f11879c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f11878b) + (Objects.hash(Boolean.valueOf(this.f11877a), this.f11879c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11877a ? 1 : 0);
            c1.f(parcel, 2, this.f11878b, false);
            c1.m(parcel, 3, this.f11879c, false);
            c1.r(iQ, parcel);
        }
    }

    @Deprecated
    public static final class d extends qa.a {
        public static final Parcelable.Creator<d> CREATOR = new z();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11880a;

        public d(boolean z10) {
            this.f11880a = z10;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && this.f11880a == ((d) obj).f11880a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11880a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int iQ = c1.q(20293, parcel);
            c1.s(parcel, 1, 4);
            parcel.writeInt(this.f11880a ? 1 : 0);
            c1.r(iQ, parcel);
        }
    }

    public b(d dVar, a aVar, String str, boolean z10, int i10, c cVar, C0104b c0104b, boolean z11) {
        com.google.android.gms.common.internal.p.f(dVar);
        this.f11858a = dVar;
        com.google.android.gms.common.internal.p.f(aVar);
        this.f11859b = aVar;
        this.f11860c = str;
        this.f11861d = z10;
        this.f11862e = i10;
        this.f11863f = cVar == null ? new c(null, false, null) : cVar;
        this.f11864g = c0104b == null ? new C0104b(false, null) : c0104b;
        this.f11865h = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.o.a(this.f11858a, bVar.f11858a) && com.google.android.gms.common.internal.o.a(this.f11859b, bVar.f11859b) && com.google.android.gms.common.internal.o.a(this.f11863f, bVar.f11863f) && com.google.android.gms.common.internal.o.a(this.f11864g, bVar.f11864g) && com.google.android.gms.common.internal.o.a(this.f11860c, bVar.f11860c) && this.f11861d == bVar.f11861d && this.f11862e == bVar.f11862e && this.f11865h == bVar.f11865h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11858a, this.f11859b, this.f11863f, this.f11864g, this.f11860c, Boolean.valueOf(this.f11861d), Integer.valueOf(this.f11862e), Boolean.valueOf(this.f11865h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.l(parcel, 1, this.f11858a, i10, false);
        c1.l(parcel, 2, this.f11859b, i10, false);
        c1.m(parcel, 3, this.f11860c, false);
        c1.s(parcel, 4, 4);
        parcel.writeInt(this.f11861d ? 1 : 0);
        c1.s(parcel, 5, 4);
        parcel.writeInt(this.f11862e);
        c1.l(parcel, 6, this.f11863f, i10, false);
        c1.l(parcel, 7, this.f11864g, i10, false);
        c1.s(parcel, 8, 4);
        parcel.writeInt(this.f11865h ? 1 : 0);
        c1.r(iQ, parcel);
    }
}
