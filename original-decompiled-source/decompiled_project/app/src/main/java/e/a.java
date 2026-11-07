package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0082a();

    /* renamed from: a, reason: collision with root package name */
    public final int f8086a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8087b;

    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0082a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            r.e(parcel, "parcel");
            return new a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Intent intent, int i10) {
        this.f8086a = i10;
        this.f8087b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f8086a;
        sb.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f8087b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        r.e(dest, "dest");
        dest.writeInt(this.f8086a);
        Intent intent = this.f8087b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }
}
