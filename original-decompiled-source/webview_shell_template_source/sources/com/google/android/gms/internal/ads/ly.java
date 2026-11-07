package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ly extends sh implements my {
    public ly() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static my i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof my ? (my) iInterfaceQueryLocalInterface : new ky(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        o40 n40Var;
        switch (i6) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i8 = parcel.readInt();
                th.b(parcel);
                a(i8);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                th.b(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                th.b(parcel);
                s1(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null && !(strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd") instanceof tr)) {
                    new rr(strongBinder2);
                }
                parcel.readString();
                th.b(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                th.b(parcel);
                break;
            case 13:
                j();
                break;
            case 14:
                l40 l40Var = (l40) th.a(parcel, l40.CREATOR);
                th.b(parcel);
                b1(l40Var);
                break;
            case 15:
                c();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    n40Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    n40Var = iInterfaceQueryLocalInterface instanceof o40 ? (o40) iInterfaceQueryLocalInterface : new n40(strongBinder3);
                }
                th.b(parcel);
                d0(n40Var);
                break;
            case 17:
                int i9 = parcel.readInt();
                th.b(parcel);
                m1(i9);
                break;
            case 18:
                zzu();
                break;
            case 19:
                th.b(parcel);
                break;
            case 20:
                zzx();
                break;
            case dn.zzm /* 21 */:
                String string3 = parcel.readString();
                th.b(parcel);
                zzl(string3);
                break;
            case 22:
                int i10 = parcel.readInt();
                String string4 = parcel.readString();
                th.b(parcel);
                K(i10, string4);
                break;
            case 23:
                zze zzeVar = (zze) th.a(parcel, zze.CREATOR);
                th.b(parcel);
                T(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) th.a(parcel, zze.CREATOR);
                th.b(parcel);
                M0(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
