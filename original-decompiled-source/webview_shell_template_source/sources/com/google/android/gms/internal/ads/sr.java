package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class sr extends sh implements tr {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        switch (i6) {
            case 1:
                String string = parcel.readString();
                th.b(parcel);
                String strZzj = ((vr0) this).zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                th.b(parcel);
                yq yqVarZzg = ((vr0) this).zzg(string2);
                parcel2.writeNoException();
                th.e(parcel2, yqVarZzg);
                return true;
            case 3:
                List listZzk = ((vr0) this).zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strA = ((vr0) this).f9927t.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 5:
                String string3 = parcel.readString();
                th.b(parcel);
                ((vr0) this).p0(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                ((vr0) this).zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzeb zzebVarI = ((vr0) this).f9927t.i();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarI);
                return true;
            case 8:
                ((vr0) this).zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                k3.a aVarZzh = ((vr0) this).zzh();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzh);
                return true;
            case 10:
                boolean zL = ((vr0) this).l(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                boolean zZzq = ((vr0) this).zzq();
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = ((vr0) this).zzt();
                parcel2.writeNoException();
                ClassLoader classLoader3 = th.f9281a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                ((vr0) this).U1(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 15:
                ((vr0) this).zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                wq wqVarZzf = ((vr0) this).zzf();
                parcel2.writeNoException();
                th.e(parcel2, wqVarZzf);
                return true;
            case 17:
                boolean zK = ((vr0) this).k(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
