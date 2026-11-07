package i0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.htmltoapk.template.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13317a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f13321e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f13322f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f13323g;
    public IconCompat h;

    /* renamed from: i, reason: collision with root package name */
    public int f13324i;

    /* renamed from: k, reason: collision with root package name */
    public o f13326k;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f13328m;

    /* renamed from: n, reason: collision with root package name */
    public String f13329n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13330o;

    /* renamed from: p, reason: collision with root package name */
    public final Notification f13331p;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f13332q;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<j> f13318b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<t> f13319c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<j> f13320d = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13325j = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13327l = false;

    public m(Context context, String str) {
        Notification notification = new Notification();
        this.f13331p = notification;
        this.f13317a = context;
        this.f13329n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f13324i = 0;
        this.f13332q = new ArrayList<>();
        this.f13330o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        String strB;
        p pVar = new p(this);
        m mVar = pVar.f13336c;
        o oVar = mVar.f13326k;
        if (oVar != null) {
            oVar.a(pVar);
        }
        int i6 = Build.VERSION.SDK_INT;
        Notification.Builder builder = pVar.f13335b;
        Notification notificationBuild = i6 >= 26 ? builder.build() : builder.build();
        if (oVar != null) {
            mVar.f13326k.getClass();
        }
        if (oVar != null && (bundle = notificationBuild.extras) != null && (strB = oVar.b()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strB);
        }
        return notificationBuild;
    }

    public final void c() {
        this.f13331p.flags |= 16;
    }

    public final void d(Bitmap bitmap) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f13317a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.f965k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f967b = bitmap;
        this.h = iconCompat;
    }

    public final void e(o oVar) {
        if (this.f13326k != oVar) {
            this.f13326k = oVar;
            if (oVar == null || oVar.f13333a == this) {
                return;
            }
            oVar.f13333a = this;
            e(oVar);
        }
    }
}
