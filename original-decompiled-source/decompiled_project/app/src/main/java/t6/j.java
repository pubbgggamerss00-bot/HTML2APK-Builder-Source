package t6;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f28029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28030b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f28031c;

    public j(int i10, Notification notification, int i11) {
        this.f28029a = i10;
        this.f28031c = notification;
        this.f28030b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f28029a == jVar.f28029a && this.f28030b == jVar.f28030b) {
            return this.f28031c.equals(jVar.f28031c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28031c.hashCode() + (((this.f28029a * 31) + this.f28030b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f28029a + ", mForegroundServiceType=" + this.f28030b + ", mNotification=" + this.f28031c + '}';
    }
}
