package m2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13880b = k.e("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f13881a;

    public a(Context context) {
        this.f13881a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
