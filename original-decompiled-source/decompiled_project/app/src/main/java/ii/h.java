package ii;

import hi.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f14551a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14553c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14554d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14555e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14556f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14557g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14558h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14559i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14560j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f14561k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f14562l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f14563m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f14564n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f14565o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f14566p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f14567q;

    public h(b0 canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        r.e(canonicalPath, "canonicalPath");
        r.e(comment, "comment");
        this.f14551a = canonicalPath;
        this.f14552b = z10;
        this.f14553c = comment;
        this.f14554d = j10;
        this.f14555e = j11;
        this.f14556f = j12;
        this.f14557g = i10;
        this.f14558h = j13;
        this.f14559i = i11;
        this.f14560j = i12;
        this.f14561k = l10;
        this.f14562l = l11;
        this.f14563m = l12;
        this.f14564n = num;
        this.f14565o = num2;
        this.f14566p = num3;
        this.f14567q = new ArrayList();
    }

    public /* synthetic */ h(b0 b0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(b0Var, z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j13, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
