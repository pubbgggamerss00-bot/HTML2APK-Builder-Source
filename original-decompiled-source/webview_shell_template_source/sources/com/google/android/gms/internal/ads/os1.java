package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class os1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7850f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7851a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7852b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7855e;

    static {
        id.a("media3.datasource");
    }

    @Deprecated
    public os1(Uri uri, long j6, long j7) {
        this(uri, Collections.EMPTY_MAP, j6, j7, 0);
    }

    public final String toString() {
        String string = this.f7851a.toString();
        StringBuilder sb = new StringBuilder("DataSpec[GET ");
        sb.append(string);
        sb.append(", ");
        sb.append(this.f7853c);
        sb.append(", ");
        sb.append(this.f7854d);
        sb.append(", null, ");
        return androidx.camera.camera2.internal.p0.a(sb, this.f7855e, "]");
    }

    public os1(Uri uri, Map map, long j6, long j7, int i6) {
        boolean z6 = false;
        boolean z7 = j6 >= 0;
        y5.n(z7);
        y5.n(z7);
        if (j7 > 0) {
            z6 = true;
        } else if (j7 == -1) {
            j7 = -1;
            z6 = true;
        }
        y5.n(z6);
        uri.getClass();
        this.f7851a = uri;
        this.f7852b = Collections.unmodifiableMap(new HashMap(map));
        this.f7853c = j6;
        this.f7854d = j7;
        this.f7855e = i6;
    }
}
