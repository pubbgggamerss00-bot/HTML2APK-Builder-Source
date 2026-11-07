package c5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4860b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4861c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4862d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4863e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4864f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4865g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4866h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4867j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f4868k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4869l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4870m;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f4871n;

    public class a implements Parcelable.Creator<g0> {
        @Override // android.os.Parcelable.Creator
        public final g0 createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g0[] newArray(int i10) {
            return new g0[i10];
        }
    }

    public g0(h hVar) {
        this.f4859a = hVar.getClass().getName();
        this.f4860b = hVar.f4876e;
        this.f4861c = hVar.f4884n;
        this.f4862d = hVar.f4893y;
        this.f4863e = hVar.f4894z;
        this.f4864f = hVar.A;
        this.f4865g = hVar.D;
        this.f4866h = hVar.f4883m;
        this.f4867j = hVar.C;
        this.f4868k = hVar.f4877f;
        this.f4869l = hVar.B;
        this.f4870m = hVar.O.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4859a);
        sb.append(" (");
        sb.append(this.f4860b);
        sb.append(")}:");
        if (this.f4861c) {
            sb.append(" fromLayout");
        }
        int i10 = this.f4863e;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f4864f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4865g) {
            sb.append(" retainInstance");
        }
        if (this.f4866h) {
            sb.append(" removing");
        }
        if (this.f4867j) {
            sb.append(" detached");
        }
        if (this.f4869l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4859a);
        parcel.writeString(this.f4860b);
        parcel.writeInt(this.f4861c ? 1 : 0);
        parcel.writeInt(this.f4862d);
        parcel.writeInt(this.f4863e);
        parcel.writeString(this.f4864f);
        parcel.writeInt(this.f4865g ? 1 : 0);
        parcel.writeInt(this.f4866h ? 1 : 0);
        parcel.writeInt(this.f4867j ? 1 : 0);
        parcel.writeBundle(this.f4868k);
        parcel.writeInt(this.f4869l ? 1 : 0);
        parcel.writeBundle(this.f4871n);
        parcel.writeInt(this.f4870m);
    }

    public g0(Parcel parcel) {
        this.f4859a = parcel.readString();
        this.f4860b = parcel.readString();
        this.f4861c = parcel.readInt() != 0;
        this.f4862d = parcel.readInt();
        this.f4863e = parcel.readInt();
        this.f4864f = parcel.readString();
        this.f4865g = parcel.readInt() != 0;
        this.f4866h = parcel.readInt() != 0;
        this.f4867j = parcel.readInt() != 0;
        this.f4868k = parcel.readBundle();
        this.f4869l = parcel.readInt() != 0;
        this.f4871n = parcel.readBundle();
        this.f4870m = parcel.readInt();
    }
}
