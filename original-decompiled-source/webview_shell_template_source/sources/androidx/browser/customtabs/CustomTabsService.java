package androidx.browser.customtabs;

import a.b;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.NoSuchElementException;
import p.c;
import p.i;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public final g<IBinder, IBinder.DeathRecipient> s = new g<>();

    /* renamed from: t, reason: collision with root package name */
    public final a f331t = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends b.a {
        public a() {
            attachInterface(this, b.f1b);
        }

        public static PendingIntent n(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // a.b
        public final boolean G(a.a aVar, Uri uri) {
            new i(aVar, null);
            new Bundle();
            return CustomTabsService.this.f();
        }

        @Override // a.b
        public final boolean L1(a.a aVar, Uri uri, Bundle bundle) {
            new i(aVar, n(bundle));
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            return CustomTabsService.this.f();
        }

        @Override // a.b
        public final boolean b2() {
            return CustomTabsService.this.i();
        }

        public final boolean r(a.a aVar, PendingIntent pendingIntent) {
            final i iVar = new i(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: p.f
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.a aVar2 = this.f14049a;
                        i iVar2 = iVar;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        customTabsService.getClass();
                        try {
                            synchronized (customTabsService.s) {
                                try {
                                    a.a aVar3 = iVar2.f14056a;
                                    IBinder iBinderAsBinder = aVar3 == null ? null : aVar3.asBinder();
                                    if (iBinderAsBinder == null) {
                                        return;
                                    }
                                    iBinderAsBinder.unlinkToDeath(customTabsService.s.get(iBinderAsBinder), 0);
                                    customTabsService.s.remove(iBinderAsBinder);
                                } finally {
                                }
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.s) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.s.put(aVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // a.b
        public final boolean u0(c cVar) {
            return r(cVar, null);
        }

        @Override // a.b
        public final int y1(a.a aVar, String str, Bundle bundle) {
            new i(aVar, n(bundle));
            return CustomTabsService.this.d();
        }
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f331t;
    }
}
