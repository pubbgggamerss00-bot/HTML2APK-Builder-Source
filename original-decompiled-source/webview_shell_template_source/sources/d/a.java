package d;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0041a();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f12632t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0041a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.j.e("parcel", parcel);
            return new a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(Intent intent, int i6) {
        this.s = i6;
        this.f12632t = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i6 = this.s;
        sb.append(i6 != -1 ? i6 != 0 ? String.valueOf(i6) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f12632t);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        kotlin.jvm.internal.j.e("dest", parcel);
        parcel.writeInt(this.s);
        Intent intent = this.f12632t;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }
}
