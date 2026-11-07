package k3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import c3.k;
import com.google.android.gms.common.internal.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<T> {
    private final String zza;
    private Object zzb;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends Exception {
    }

    public c(String str) {
        this.zza = str;
    }

    public abstract T getRemoteCreator(IBinder iBinder);

    public final T getRemoteCreatorInstance(Context context) throws a, PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (this.zzb == null) {
            l.f(context);
            AtomicBoolean atomicBoolean = k.f2186a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e6) {
                throw new a("Could not load creator class.", e6);
            } catch (IllegalAccessException e7) {
                throw new a("Could not access creator.", e7);
            } catch (InstantiationException e8) {
                throw new a("Could not instantiate creator.", e8);
            }
        }
        return (T) this.zzb;
    }
}
