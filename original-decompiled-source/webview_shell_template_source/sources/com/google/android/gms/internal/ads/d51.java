package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d51 implements zg {
    public static final Parcelable.Creator<d51> CREATOR = new i41();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f3765t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3766u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3767v;

    public /* synthetic */ d51(Parcel parcel) {
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.s = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f3765t = bArrCreateByteArray;
        this.f3766u = parcel.readInt();
        int i7 = parcel.readInt();
        this.f3767v = i7;
        l(string, bArrCreateByteArray, i7);
    }

    public static void l(String str, byte[] bArr, int i6) {
        byte b7;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    y5.n(i6 == 23 && bArr.length == 4);
                    return;
                }
                return;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    if (i6 != 75 || bArr.length != 1 || ((b7 = bArr[0]) != 0 && b7 != 1)) {
                        z = false;
                    }
                    y5.n(z);
                    return;
                }
                return;
            case 101820674:
                if (!str.equals("editable.tracks.length")) {
                    return;
                }
                break;
            case 188404399:
                if (!str.equals("editable.tracks.offset")) {
                    return;
                }
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    y5.n(i6 == 0);
                    return;
                }
                return;
            default:
                return;
        }
        y5.n(i6 == 78 && bArr.length == 8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d51.class == obj.getClass()) {
            d51 d51Var = (d51) obj;
            if (this.s.equals(d51Var.s) && Arrays.equals(this.f3765t, d51Var.f3765t) && this.f3766u == d51Var.f3766u && this.f3767v == d51Var.f3767v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3765t) + ((this.s.hashCode() + 527) * 31)) * 31) + this.f3766u) * 31) + this.f3767v;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String string;
        String str = this.s;
        int i6 = 0;
        byte[] bArr = this.f3765t;
        int i7 = this.f3767v;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = j31.f5914a;
                string = new String(bArr, StandardCharsets.UTF_8);
            } else if (i7 == 23) {
                string = String.valueOf(Float.intBitsToFloat(ed0.s(bArr)));
            } else if (i7 == 67) {
                string = String.valueOf(ed0.s(bArr));
            } else if (i7 == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i7 != 78) {
                int length = bArr.length;
                StringBuilder sb = new StringBuilder(length + length);
                while (i6 < bArr.length) {
                    sb.append(Character.forDigit((bArr[i6] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i6] & 15, 16));
                    i6++;
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new ex0(bArr).E());
            }
        } else if (str.equals("editable.tracks.map")) {
            if (!str.equals("editable.tracks.map")) {
                throw new IllegalStateException("Metadata is not an editable tracks map");
            }
            byte b7 = bArr[1];
            ArrayList arrayList = new ArrayList();
            while (i6 < b7) {
                arrayList.add(Integer.valueOf(bArr[i6 + 2]));
                i6++;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            ih1.l(sb2, arrayList.iterator(), ",");
            string = sb2.toString();
        }
        return "mdta: key=" + str + ", value=" + string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeByteArray(this.f3765t);
        parcel.writeInt(this.f3766u);
        parcel.writeInt(this.f3767v);
    }

    public d51(String str, byte[] bArr, int i6, int i7) {
        l(str, bArr, i7);
        this.s = str;
        this.f3765t = bArr;
        this.f3766u = i6;
        this.f3767v = i7;
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final /* synthetic */ void d(ae aeVar) {
    }
}
