package x6;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import t6.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final String f32173d = s.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f32174a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.b f32175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32176c;

    public e(Context context, l5.c cVar, boolean z10) {
        this.f32175b = cVar;
        this.f32174a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f32176c = z10;
    }
}
