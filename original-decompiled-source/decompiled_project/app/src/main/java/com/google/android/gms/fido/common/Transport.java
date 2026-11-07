package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.fido.zzhu;
import com.google.android.gms.internal.fido.zzhx;
import i8.n;

/* loaded from: classes2.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new com.google.android.gms.fido.common.a();

    /* renamed from: a, reason: collision with root package name */
    public final String f6234a;

    public static class a extends Exception {
    }

    Transport(String str) {
        this.f6234a = str;
    }

    public static Transport a(String str) throws a {
        if (str.equals("hybrid") && (!zzhu.zzb() || !zzhx.zzb())) {
            return HYBRID;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.f6234a)) {
                return transport;
            }
        }
        throw new a(n.d("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6234a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6234a);
    }
}
