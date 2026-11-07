package j0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface c extends IInterface {

    /* renamed from: r, reason: collision with root package name */
    public static final String f13442r = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends Binder implements c {
        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            b bVar;
            String str = c.f13442r;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i6 != 1) {
                return super.onTransact(i6, parcel, parcel2, i7);
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.f13441q);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                    j0.a aVar = new j0.a();
                    aVar.s = strongBinder;
                    bVar = aVar;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface;
                }
            }
            UnusedAppRestrictionsBackportService.a aVar2 = (UnusedAppRestrictionsBackportService.a) this;
            if (bVar == null) {
                return true;
            }
            UnusedAppRestrictionsBackportService.this.a();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
