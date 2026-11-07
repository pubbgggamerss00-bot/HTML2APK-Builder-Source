package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f8110a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f8111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8113d;

    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel inParcel) {
            r.e(inParcel, "inParcel");
            Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            r.b(parcelable);
            return new k((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        r.e(intentSender, "intentSender");
        this.f8110a = intentSender;
        this.f8111b = intent;
        this.f8112c = i10;
        this.f8113d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        r.e(dest, "dest");
        dest.writeParcelable(this.f8110a, i10);
        dest.writeParcelable(this.f8111b, i10);
        dest.writeInt(this.f8112c);
        dest.writeInt(this.f8113d);
    }
}
