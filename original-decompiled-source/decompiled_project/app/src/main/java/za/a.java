package za;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: za.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0357a extends zzb implements a {
        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }
}
