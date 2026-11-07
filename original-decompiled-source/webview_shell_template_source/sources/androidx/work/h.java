package androidx.work;

import android.app.Notification;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f1781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1782b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f1783c;

    public h(int i6, Notification notification, int i7) {
        this.f1781a = i6;
        this.f1783c = notification;
        this.f1782b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1781a == hVar.f1781a && this.f1782b == hVar.f1782b) {
            return this.f1783c.equals(hVar.f1783c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1783c.hashCode() + (((this.f1781a * 31) + this.f1782b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1781a + ", mForegroundServiceType=" + this.f1782b + ", mNotification=" + this.f1783c + '}';
    }
}
