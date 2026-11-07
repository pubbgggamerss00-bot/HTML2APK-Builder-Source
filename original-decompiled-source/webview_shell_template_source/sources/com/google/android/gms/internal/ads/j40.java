package com.google.android.gms.internal.ads;

import android.os.Parcel;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class j40 extends sh implements k40 {
    public j40() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 1:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                Z0(aVarR);
                break;
            case 2:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                parcel.readInt();
                th.b(parcel);
                a0();
                break;
            case 3:
                k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                X(aVarR2);
                break;
            case 4:
                k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzj(aVarR3);
                break;
            case 5:
                k3.a aVarR4 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                u1(aVarR4);
                break;
            case 6:
                k3.a aVarR5 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                B1(aVarR5);
                break;
            case 7:
                k3.a aVarR6 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                l40 l40Var = (l40) th.a(parcel, l40.CREATOR);
                th.b(parcel);
                K0(aVarR6, l40Var);
                break;
            case 8:
                k3.a aVarR7 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zze(aVarR7);
                break;
            case 9:
                k3.a aVarR8 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                th.b(parcel);
                O(aVarR8, i8);
                break;
            case 10:
                a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                R1();
                break;
            case 11:
                k3.a aVarR9 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                th.b(parcel);
                zzn(aVarR9);
                break;
            case 12:
                th.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
