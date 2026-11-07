package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ih2 implements Comparator<og2>, Parcelable {
    public static final Parcelable.Creator<ih2> CREATOR = new bf2();
    public final og2[] s;

    /* renamed from: t, reason: collision with root package name */
    public int f5769t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5770u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5771v;

    public ih2(Parcel parcel) {
        this.f5770u = parcel.readString();
        og2[] og2VarArr = (og2[]) parcel.createTypedArray(og2.CREATOR);
        int i6 = j31.f5914a;
        this.s = og2VarArr;
        this.f5771v = og2VarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(og2 og2Var, og2 og2Var2) {
        og2 og2Var3 = og2Var;
        og2 og2Var4 = og2Var2;
        UUID uuid = f72.f4517a;
        return uuid.equals(og2Var3.f7754t) ? !uuid.equals(og2Var4.f7754t) ? 1 : 0 : og2Var3.f7754t.compareTo(og2Var4.f7754t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ih2.class == obj.getClass()) {
            ih2 ih2Var = (ih2) obj;
            if (Objects.equals(this.f5770u, ih2Var.f5770u) && Arrays.equals(this.s, ih2Var.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f5769t;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f5770u;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.s);
        this.f5769t = iHashCode;
        return iHashCode;
    }

    public final ih2 l(String str) {
        return Objects.equals(this.f5770u, str) ? this : new ih2(str, false, this.s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f5770u);
        parcel.writeTypedArray(this.s, 0);
    }

    public ih2(String str, boolean z6, og2... og2VarArr) {
        this.f5770u = str;
        og2VarArr = z6 ? (og2[]) og2VarArr.clone() : og2VarArr;
        this.s = og2VarArr;
        this.f5771v = og2VarArr.length;
        Arrays.sort(og2VarArr, this);
    }
}
