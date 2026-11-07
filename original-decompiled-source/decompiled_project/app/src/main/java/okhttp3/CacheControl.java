package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class CacheControl {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f19163n = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19167d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19168e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19169f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19170g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19171h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19172i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19173j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19174k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19175l;

    /* renamed from: m, reason: collision with root package name */
    public String f19176m;

    public static final class Builder {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Builder();
        new Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f19164a = z10;
        this.f19165b = z11;
        this.f19166c = i10;
        this.f19167d = i11;
        this.f19168e = z12;
        this.f19169f = z13;
        this.f19170g = z14;
        this.f19171h = i12;
        this.f19172i = i13;
        this.f19173j = z15;
        this.f19174k = z16;
        this.f19175l = z17;
        this.f19176m = str;
    }

    public final String toString() {
        String str = this.f19176m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19164a) {
            sb.append("no-cache, ");
        }
        if (this.f19165b) {
            sb.append("no-store, ");
        }
        int i10 = this.f19166c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f19167d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f19168e) {
            sb.append("private, ");
        }
        if (this.f19169f) {
            sb.append("public, ");
        }
        if (this.f19170g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f19171h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f19172i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.f19173j) {
            sb.append("only-if-cached, ");
        }
        if (this.f19174k) {
            sb.append("no-transform, ");
        }
        if (this.f19175l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f19176m = string;
        return string;
    }
}
