package d;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public final IntentSender s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f12653t;

    /* renamed from: u, reason: collision with root package name */
    public final int f12654u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12655v;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.j.e("inParcel", parcel);
            Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            kotlin.jvm.internal.j.b(parcelable);
            return new j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i6) {
            return new j[i6];
        }
    }

    public j(IntentSender intentSender, Intent intent, int i6, int i7) {
        this.s = intentSender;
        this.f12653t = intent;
        this.f12654u = i6;
        this.f12655v = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        kotlin.jvm.internal.j.e("dest", parcel);
        parcel.writeParcelable(this.s, i6);
        parcel.writeParcelable(this.f12653t, i6);
        parcel.writeInt(this.f12654u);
        parcel.writeInt(this.f12655v);
    }
}
