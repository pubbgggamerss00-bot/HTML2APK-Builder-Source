package p;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a.a f14056a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f14057b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends b {
        public a() {
        }

        @Override // p.b
        public final void a(String str, Bundle bundle) {
            try {
                i.this.f14056a.f1(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final Bundle b(String str, Bundle bundle) {
            try {
                return i.this.f14056a.j0(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // p.b
        public final void c(int i6, int i7, int i8, int i9, int i10, Bundle bundle) {
            try {
                i.this.f14056a.R(i6, i7, i8, i9, i10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void d(int i6, int i7, Bundle bundle) {
            try {
                i.this.f14056a.O0(i6, i7, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void e(Bundle bundle) {
            try {
                i.this.f14056a.W1(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void f(Bundle bundle) {
            try {
                i.this.f14056a.y0(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void g(Bundle bundle, int i6) {
            try {
                i.this.f14056a.z0(bundle, i6);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void h(String str, Bundle bundle) {
            try {
                i.this.f14056a.P1(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void i(int i6, Uri uri, boolean z6, Bundle bundle) {
            try {
                i.this.f14056a.Y1(i6, uri, z6, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void j(Bundle bundle) {
            try {
                i.this.f14056a.B0(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p.b
        public final void k(Bundle bundle) {
            try {
                i.this.f14056a.l1(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public i(a.a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f14056a = aVar;
        this.f14057b = pendingIntent;
        if (aVar == null) {
            return;
        }
        new a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            PendingIntent pendingIntent = iVar.f14057b;
            PendingIntent pendingIntent2 = this.f14057b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                a.a aVar = this.f14056a;
                if (aVar == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = aVar.asBinder();
                a.a aVar2 = iVar.f14056a;
                if (aVar2 != null) {
                    return iBinderAsBinder.equals(aVar2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f14057b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        a.a aVar = this.f14056a;
        if (aVar != null) {
            return aVar.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
