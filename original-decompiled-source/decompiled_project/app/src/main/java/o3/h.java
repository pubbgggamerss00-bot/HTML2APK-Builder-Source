package o3;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f18928a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f18929b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f18930c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18931d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18932e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final int f18933f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f18934g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f18935h;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s[] sVarArr) {
        this.f18932e = true;
        this.f18929b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f1401a;
            if ((i10 == -1 ? ((Icon) iconCompat.f1402b).getType() : i10) == 2) {
                this.f18933f = iconCompat.b();
            }
        }
        this.f18934g = j.a(charSequence);
        this.f18935h = pendingIntent;
        this.f18928a = bundle;
        this.f18930c = sVarArr;
        this.f18931d = true;
        this.f18932e = true;
    }
}
