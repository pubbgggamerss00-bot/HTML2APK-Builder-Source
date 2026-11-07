package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public class i3 implements zg {
    public static final Parcelable.Creator<i3> CREATOR = new h3();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5542t;

    public i3(Parcel parcel) {
        String string = parcel.readString();
        int i6 = j31.f5914a;
        this.s = string;
        this.f5542t = parcel.readString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.google.android.gms.internal.ads.zg
    public final void d(ae aeVar) {
        String str = this.s;
        int iHashCode = str.hashCode();
        String str2 = this.f5542t;
        switch (iHashCode) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    aeVar.f2673c = str2;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    aeVar.f2671a = str2;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    aeVar.f2675e = str2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    aeVar.f2674d = str2;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    aeVar.f2672b = str2;
                    break;
                }
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i3 i3Var = (i3) obj;
            if (this.s.equals(i3Var.s) && this.f5542t.equals(i3Var.f5542t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5542t.hashCode() + ((this.s.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.s + "=" + this.f5542t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.s);
        parcel.writeString(this.f5542t);
    }

    public i3(String str, String str2) {
        this.s = rj1.m(str);
        this.f5542t = str2;
    }
}
