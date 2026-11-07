package c5;

import android.os.Parcel;
import android.os.Parcelable;
import c5.b0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f4820a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f4821b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f4822c;

    /* renamed from: d, reason: collision with root package name */
    public int f4823d;

    /* renamed from: e, reason: collision with root package name */
    public String f4824e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<String> f4825f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<c> f4826g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<b0.k> f4827h;

    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            d0 d0Var = new d0();
            d0Var.f4824e = null;
            d0Var.f4825f = new ArrayList<>();
            d0Var.f4826g = new ArrayList<>();
            d0Var.f4820a = parcel.createStringArrayList();
            d0Var.f4821b = parcel.createStringArrayList();
            d0Var.f4822c = (b[]) parcel.createTypedArray(b.CREATOR);
            d0Var.f4823d = parcel.readInt();
            d0Var.f4824e = parcel.readString();
            d0Var.f4825f = parcel.createStringArrayList();
            d0Var.f4826g = parcel.createTypedArrayList(c.CREATOR);
            d0Var.f4827h = parcel.createTypedArrayList(b0.k.CREATOR);
            return d0Var;
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i10) {
            return new d0[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4820a);
        parcel.writeStringList(this.f4821b);
        parcel.writeTypedArray(this.f4822c, i10);
        parcel.writeInt(this.f4823d);
        parcel.writeString(this.f4824e);
        parcel.writeStringList(this.f4825f);
        parcel.writeTypedList(this.f4826g);
        parcel.writeTypedList(this.f4827h);
    }
}
