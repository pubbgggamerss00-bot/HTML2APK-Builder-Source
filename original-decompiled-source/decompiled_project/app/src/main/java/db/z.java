package db;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    z EF2;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z[] f7825a = {new z()};
    public static final Parcelable.Creator<z> CREATOR = new b1();

    public static class a extends Exception {
    }

    public static z a(String str) throws a {
        for (z zVar : values()) {
            zVar.getClass();
            if (str.equals("public-key")) {
                return zVar;
            }
        }
        throw new a(i8.n.d("PublicKeyCredentialType ", str, " not supported"));
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f7825a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
