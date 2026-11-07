package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import b.b;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager s;

    /* renamed from: t, reason: collision with root package name */
    public int f333t = -1;

    /* renamed from: u, reason: collision with root package name */
    public final a f334u = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends b.a {
        public a() {
            attachInterface(this, b.f1857f);
        }

        public final void n() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i6 = trustedWebActivityService.f333t;
            if (i6 != -1) {
                if (i6 != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                trustedWebActivityService.b();
                throw null;
            }
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public abstract q.a b();

    public final int c() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f334u;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.s = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f333t = -1;
        return super.onUnbind(intent);
    }
}
