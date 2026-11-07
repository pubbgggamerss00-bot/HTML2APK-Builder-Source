package ge;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final long f12039b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12040c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static p f12041d;

    /* renamed from: a, reason: collision with root package name */
    public final f1.m f12042a;

    public p(f1.m mVar) {
        this.f12042a = mVar;
    }

    public final boolean a(ie.a aVar) {
        if (TextUtils.isEmpty(aVar.f14501d)) {
            return true;
        }
        long j10 = aVar.f14503f + aVar.f14504g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f12042a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f12039b;
    }
}
