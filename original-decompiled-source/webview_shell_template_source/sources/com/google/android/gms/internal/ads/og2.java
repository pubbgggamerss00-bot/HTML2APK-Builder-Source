package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class og2 implements Parcelable {
    public static final Parcelable.Creator<og2> CREATOR = new uf2();
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final UUID f7754t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7755u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7756v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f7757w;

    public og2(Parcel parcel) {
        this.f7754t = new UUID(parcel.readLong(), parcel.readLong());
        this.f7755u = parcel.readString();
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.f7756v = string;
        this.f7757w = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof og2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        og2 og2Var = (og2) obj;
        return Objects.equals(this.f7755u, og2Var.f7755u) && Objects.equals(this.f7756v, og2Var.f7756v) && Objects.equals(this.f7754t, og2Var.f7754t) && Arrays.equals(this.f7757w, og2Var.f7757w);
    }

    public final int hashCode() {
        int i6 = this.s;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = this.f7754t.hashCode() * 31;
        String str = this.f7755u;
        int iHashCode2 = Arrays.hashCode(this.f7757w) + androidx.camera.view.g.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f7756v);
        this.s = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        UUID uuid = this.f7754t;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f7755u);
        parcel.writeString(this.f7756v);
        parcel.writeByteArray(this.f7757w);
    }

    public og2(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f7754t = uuid;
        this.f7755u = null;
        this.f7756v = bk.e(str);
        this.f7757w = bArr;
    }
}
