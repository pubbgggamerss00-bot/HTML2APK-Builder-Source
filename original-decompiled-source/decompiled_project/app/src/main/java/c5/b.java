package c5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.j0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4764a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f4765b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4766c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4767d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4768e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4769f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4770g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4771h;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f4772j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4773k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f4774l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f4775m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f4776n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4777p;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(c5.a aVar) {
        int size = aVar.f4919a.size();
        this.f4764a = new int[size * 6];
        if (!aVar.f4925g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4765b = new ArrayList<>(size);
        this.f4766c = new int[size];
        this.f4767d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j0.a aVar2 = aVar.f4919a.get(i11);
            int i12 = i10 + 1;
            this.f4764a[i10] = aVar2.f4934a;
            ArrayList<String> arrayList = this.f4765b;
            h hVar = aVar2.f4935b;
            arrayList.add(hVar != null ? hVar.f4876e : null);
            int[] iArr = this.f4764a;
            iArr[i12] = aVar2.f4936c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f4937d;
            iArr[i10 + 3] = aVar2.f4938e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f4939f;
            i10 += 6;
            iArr[i13] = aVar2.f4940g;
            this.f4766c[i11] = aVar2.f4941h.ordinal();
            this.f4767d[i11] = aVar2.f4942i.ordinal();
        }
        this.f4768e = aVar.f4924f;
        this.f4769f = aVar.f4926h;
        this.f4770g = aVar.f4762r;
        this.f4771h = aVar.f4927i;
        this.f4772j = aVar.f4928j;
        this.f4773k = aVar.f4929k;
        this.f4774l = aVar.f4930l;
        this.f4775m = aVar.f4931m;
        this.f4776n = aVar.f4932n;
        this.f4777p = aVar.f4933o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f4764a);
        parcel.writeStringList(this.f4765b);
        parcel.writeIntArray(this.f4766c);
        parcel.writeIntArray(this.f4767d);
        parcel.writeInt(this.f4768e);
        parcel.writeString(this.f4769f);
        parcel.writeInt(this.f4770g);
        parcel.writeInt(this.f4771h);
        TextUtils.writeToParcel(this.f4772j, parcel, 0);
        parcel.writeInt(this.f4773k);
        TextUtils.writeToParcel(this.f4774l, parcel, 0);
        parcel.writeStringList(this.f4775m);
        parcel.writeStringList(this.f4776n);
        parcel.writeInt(this.f4777p ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f4764a = parcel.createIntArray();
        this.f4765b = parcel.createStringArrayList();
        this.f4766c = parcel.createIntArray();
        this.f4767d = parcel.createIntArray();
        this.f4768e = parcel.readInt();
        this.f4769f = parcel.readString();
        this.f4770g = parcel.readInt();
        this.f4771h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4772j = (CharSequence) creator.createFromParcel(parcel);
        this.f4773k = parcel.readInt();
        this.f4774l = (CharSequence) creator.createFromParcel(parcel);
        this.f4775m = parcel.createStringArrayList();
        this.f4776n = parcel.createStringArrayList();
        this.f4777p = parcel.readInt() != 0;
    }
}
