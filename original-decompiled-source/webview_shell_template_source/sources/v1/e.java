package v1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e extends Binder implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [v1.d] */
    /* JADX WARN: Type inference failed for: r1v9, types: [v1.d] */
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        c cVar = null;
        c cVar2 = null;
        if (i6 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar3 = new c();
                    cVar3.s = strongBinder;
                    cVar = cVar3;
                } else {
                    cVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
            int i8 = 0;
            if (string != null) {
                synchronized (MultiInstanceInvalidationService.this.f1727u) {
                    try {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                        int i9 = multiInstanceInvalidationService.s + 1;
                        multiInstanceInvalidationService.s = i9;
                        if (multiInstanceInvalidationService.f1727u.register(cVar, Integer.valueOf(i9))) {
                            MultiInstanceInvalidationService.this.f1726t.put(Integer.valueOf(i9), string);
                            i8 = i9;
                        } else {
                            MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                            multiInstanceInvalidationService2.s--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i8);
            return true;
        }
        if (i6 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                    c cVar4 = new c();
                    cVar4.s = strongBinder2;
                    cVar2 = cVar4;
                } else {
                    cVar2 = (d) iInterfaceQueryLocalInterface2;
                }
            }
            int i10 = parcel.readInt();
            MultiInstanceInvalidationService.b bVar2 = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f1727u) {
                MultiInstanceInvalidationService.this.f1727u.unregister(cVar2);
                MultiInstanceInvalidationService.this.f1726t.remove(Integer.valueOf(i10));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i6 != 3) {
            if (i6 != 1598968902) {
                return super.onTransact(i6, parcel, parcel2, i7);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        int i11 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService.b bVar3 = (MultiInstanceInvalidationService.b) this;
        synchronized (MultiInstanceInvalidationService.this.f1727u) {
            try {
                String str = MultiInstanceInvalidationService.this.f1726t.get(Integer.valueOf(i11));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f1727u.beginBroadcast();
                    for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f1727u.getBroadcastCookie(i12);
                            int iIntValue = num.intValue();
                            String str2 = MultiInstanceInvalidationService.this.f1726t.get(num);
                            if (i11 != iIntValue && str.equals(str2)) {
                                try {
                                    MultiInstanceInvalidationService.this.f1727u.getBroadcastItem(i12).U(strArrCreateStringArray);
                                } catch (RemoteException e6) {
                                    Log.w("ROOM", "Error invoking a remote callback", e6);
                                }
                            }
                        } finally {
                            MultiInstanceInvalidationService.this.f1727u.finishBroadcast();
                        }
                    }
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
