package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.g0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final CharSequence A;
    public final int B;
    public final CharSequence C;
    public final ArrayList<String> D;
    public final ArrayList<String> E;
    public final boolean F;
    public final int[] s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<String> f1068t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f1069u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f1070v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1071w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1072x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1073y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1074z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1109a.size();
        this.s = new int[size * 6];
        if (!aVar.f1115g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1068t = new ArrayList<>(size);
        this.f1069u = new int[size];
        this.f1070v = new int[size];
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            g0.a aVar2 = aVar.f1109a.get(i7);
            int i8 = i6 + 1;
            this.s[i6] = aVar2.f1123a;
            ArrayList<String> arrayList = this.f1068t;
            k kVar = aVar2.f1124b;
            arrayList.add(kVar != null ? kVar.f1196w : null);
            int[] iArr = this.s;
            iArr[i8] = aVar2.f1125c ? 1 : 0;
            iArr[i6 + 2] = aVar2.f1126d;
            iArr[i6 + 3] = aVar2.f1127e;
            int i9 = i6 + 5;
            iArr[i6 + 4] = aVar2.f1128f;
            i6 += 6;
            iArr[i9] = aVar2.f1129g;
            this.f1069u[i7] = aVar2.h.ordinal();
            this.f1070v[i7] = aVar2.f1130i.ordinal();
        }
        this.f1071w = aVar.f1114f;
        this.f1072x = aVar.h;
        this.f1073y = aVar.f1060r;
        this.f1074z = aVar.f1116i;
        this.A = aVar.f1117j;
        this.B = aVar.f1118k;
        this.C = aVar.f1119l;
        this.D = aVar.f1120m;
        this.E = aVar.f1121n;
        this.F = aVar.f1122o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.s);
        parcel.writeStringList(this.f1068t);
        parcel.writeIntArray(this.f1069u);
        parcel.writeIntArray(this.f1070v);
        parcel.writeInt(this.f1071w);
        parcel.writeString(this.f1072x);
        parcel.writeInt(this.f1073y);
        parcel.writeInt(this.f1074z);
        TextUtils.writeToParcel(this.A, parcel, 0);
        parcel.writeInt(this.B);
        TextUtils.writeToParcel(this.C, parcel, 0);
        parcel.writeStringList(this.D);
        parcel.writeStringList(this.E);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.s = parcel.createIntArray();
        this.f1068t = parcel.createStringArrayList();
        this.f1069u = parcel.createIntArray();
        this.f1070v = parcel.createIntArray();
        this.f1071w = parcel.readInt();
        this.f1072x = parcel.readString();
        this.f1073y = parcel.readInt();
        this.f1074z = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A = (CharSequence) creator.createFromParcel(parcel);
        this.B = parcel.readInt();
        this.C = (CharSequence) creator.createFromParcel(parcel);
        this.D = parcel.createStringArrayList();
        this.E = parcel.createStringArrayList();
        this.F = parcel.readInt() != 0;
    }
}
