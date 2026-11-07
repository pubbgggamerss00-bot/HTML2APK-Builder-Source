package i0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f13313b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f13314c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13315d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
            bigPictureStyle.showBigPictureWhenCollapsed(z6);
        }
    }

    @Override // i0.o
    public final void a(p pVar) {
        Bitmap bitmapA;
        Context context = pVar.f13334a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(pVar.f13335b).setBigContentTitle(null);
        IconCompat iconCompat = this.f13313b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f13313b;
                int i6 = iconCompat2.f966a;
                if (i6 == -1) {
                    Object obj = iconCompat2.f967b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i6 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f967b;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f967b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f13315d) {
            IconCompat iconCompat3 = this.f13314c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, false);
            b.b(bigContentTitle, null);
        }
    }

    @Override // i0.o
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
