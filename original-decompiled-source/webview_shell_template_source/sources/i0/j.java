package i0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f13306a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f13307b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f13308c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13309d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13310e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final int f13311f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f13312g;
    public final PendingIntent h;

    public j(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, v[] vVarArr, v[] vVarArr2) {
        this.f13310e = true;
        this.f13307b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.f13311f = iconCompat.c();
        }
        this.f13312g = m.b(charSequence);
        this.h = pendingIntent;
        this.f13306a = bundle;
        this.f13308c = vVarArr;
        this.f13309d = true;
        this.f13310e = true;
    }
}
