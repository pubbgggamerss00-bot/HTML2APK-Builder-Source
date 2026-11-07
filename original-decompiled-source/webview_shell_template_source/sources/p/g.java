package p;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f14051a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends d {
    }

    public abstract void a(a aVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.b bVar;
        if (this.f14051a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i6 = b.a.s;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.b.f1b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a.b)) {
                b.a.C0002a c0002a = new b.a.C0002a();
                c0002a.s = iBinder;
                bVar = c0002a;
            } else {
                bVar = (a.b) iInterfaceQueryLocalInterface;
            }
        }
        a(new a(bVar, componentName));
    }
}
