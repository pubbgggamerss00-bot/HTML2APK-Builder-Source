package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();
    public ArrayList<String> s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f1061t;

    /* renamed from: u, reason: collision with root package name */
    public b[] f1062u;

    /* renamed from: v, reason: collision with root package name */
    public int f1063v;

    /* renamed from: w, reason: collision with root package name */
    public String f1064w = null;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList<String> f1065x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    public ArrayList<c> f1066y = new ArrayList<>();

    /* renamed from: z, reason: collision with root package name */
    public ArrayList<y.k> f1067z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            a0 a0Var = new a0();
            a0Var.f1064w = null;
            a0Var.f1065x = new ArrayList<>();
            a0Var.f1066y = new ArrayList<>();
            a0Var.s = parcel.createStringArrayList();
            a0Var.f1061t = parcel.createStringArrayList();
            a0Var.f1062u = (b[]) parcel.createTypedArray(b.CREATOR);
            a0Var.f1063v = parcel.readInt();
            a0Var.f1064w = parcel.readString();
            a0Var.f1065x = parcel.createStringArrayList();
            a0Var.f1066y = parcel.createTypedArrayList(c.CREATOR);
            a0Var.f1067z = parcel.createTypedArrayList(y.k.CREATOR);
            return a0Var;
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i6) {
            return new a0[i6];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.s);
        parcel.writeStringList(this.f1061t);
        parcel.writeTypedArray(this.f1062u, i6);
        parcel.writeInt(this.f1063v);
        parcel.writeString(this.f1064w);
        parcel.writeStringList(this.f1065x);
        parcel.writeTypedList(this.f1066y);
        parcel.writeTypedList(this.f1067z);
    }
}
