package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public final boolean A;
    public final Bundle B;
    public final boolean C;
    public final int D;
    public Bundle E;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1083t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1084u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1085v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1086w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1087x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1088y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1089z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i6) {
            return new d0[i6];
        }
    }

    public d0(k kVar) {
        this.s = kVar.getClass().getName();
        this.f1083t = kVar.f1196w;
        this.f1084u = kVar.E;
        this.f1085v = kVar.N;
        this.f1086w = kVar.O;
        this.f1087x = kVar.P;
        this.f1088y = kVar.S;
        this.f1089z = kVar.D;
        this.A = kVar.R;
        this.B = kVar.f1197x;
        this.C = kVar.Q;
        this.D = kVar.f1186d0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.s);
        sb.append(" (");
        sb.append(this.f1083t);
        sb.append(")}:");
        if (this.f1084u) {
            sb.append(" fromLayout");
        }
        int i6 = this.f1086w;
        if (i6 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i6));
        }
        String str = this.f1087x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1088y) {
            sb.append(" retainInstance");
        }
        if (this.f1089z) {
            sb.append(" removing");
        }
        if (this.A) {
            sb.append(" detached");
        }
        if (this.C) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f1083t);
        parcel.writeInt(this.f1084u ? 1 : 0);
        parcel.writeInt(this.f1085v);
        parcel.writeInt(this.f1086w);
        parcel.writeString(this.f1087x);
        parcel.writeInt(this.f1088y ? 1 : 0);
        parcel.writeInt(this.f1089z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeBundle(this.E);
        parcel.writeInt(this.D);
    }

    public d0(Parcel parcel) {
        this.s = parcel.readString();
        this.f1083t = parcel.readString();
        this.f1084u = parcel.readInt() != 0;
        this.f1085v = parcel.readInt();
        this.f1086w = parcel.readInt();
        this.f1087x = parcel.readString();
        this.f1088y = parcel.readInt() != 0;
        this.f1089z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readBundle();
        this.C = parcel.readInt() != 0;
        this.E = parcel.readBundle();
        this.D = parcel.readInt();
    }
}
