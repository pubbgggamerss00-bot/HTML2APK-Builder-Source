package o3;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18936b;

    @Override // o3.l
    public final void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    }

    @Override // o3.l
    public final void b(m mVar) {
        new Notification.BigTextStyle(mVar.f18954a).setBigContentTitle(null).bigText(this.f18936b);
    }
}
