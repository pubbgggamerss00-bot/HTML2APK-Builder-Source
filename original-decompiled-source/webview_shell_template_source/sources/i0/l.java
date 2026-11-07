package i0;

import android.app.Notification;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f13316b;

    @Override // i0.o
    public final void a(p pVar) {
        new Notification.BigTextStyle(pVar.f13335b).setBigContentTitle(null).bigText(this.f13316b);
    }

    @Override // i0.o
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
