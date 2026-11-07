package androidx.work.impl.model;

import androidx.datastore.preferences.protobuf.a1;
import androidx.work.OverwritingInputMerger;
import androidx.work.b;
import kotlin.jvm.internal.r;
import l0.k;
import r.e2;
import r.o2;
import t6.b0;
import t6.c0;
import t6.e;
import t6.s;
import x0.s1;

/* loaded from: classes.dex */
public final class WorkSpec {

    /* renamed from: a, reason: collision with root package name */
    public final String f3167a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f3168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3169c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3170d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3171e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3172f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3173g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3174h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3175i;

    /* renamed from: j, reason: collision with root package name */
    public final e f3176j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3177k;

    /* renamed from: l, reason: collision with root package name */
    public final t6.a f3178l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3179m;

    /* renamed from: n, reason: collision with root package name */
    public long f3180n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3181o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3182p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3183q;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f3184r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3185s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3186t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3187u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3188v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3189w;

    /* renamed from: x, reason: collision with root package name */
    public String f3190x;

    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && r.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "IdAndState(id=" + ((String) null) + ", state=" + ((Object) null) + ')';
        }
    }

    static {
        r.d(s.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public WorkSpec(String id2, c0 state, String workerClassName, String inputMergerClassName, b input, b output, long j10, long j11, long j12, e constraints, int i10, t6.a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, b0 outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str) {
        r.e(id2, "id");
        r.e(state, "state");
        r.e(workerClassName, "workerClassName");
        r.e(inputMergerClassName, "inputMergerClassName");
        r.e(input, "input");
        r.e(output, "output");
        r.e(constraints, "constraints");
        r.e(backoffPolicy, "backoffPolicy");
        r.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f3167a = id2;
        this.f3168b = state;
        this.f3169c = workerClassName;
        this.f3170d = inputMergerClassName;
        this.f3171e = input;
        this.f3172f = output;
        this.f3173g = j10;
        this.f3174h = j11;
        this.f3175i = j12;
        this.f3176j = constraints;
        this.f3177k = i10;
        this.f3178l = backoffPolicy;
        this.f3179m = j13;
        this.f3180n = j14;
        this.f3181o = j15;
        this.f3182p = j16;
        this.f3183q = z10;
        this.f3184r = outOfQuotaPolicy;
        this.f3185s = i11;
        this.f3186t = i12;
        this.f3187u = j17;
        this.f3188v = i13;
        this.f3189w = i14;
        this.f3190x = str;
    }

    public final long a() {
        c0 c0Var = this.f3168b;
        c0 c0Var2 = c0.f27994a;
        int i10 = this.f3177k;
        boolean z10 = c0Var == c0Var2 && i10 > 0;
        long j10 = this.f3180n;
        boolean zC = c();
        t6.a backoffPolicy = this.f3178l;
        r.e(backoffPolicy, "backoffPolicy");
        long j11 = this.f3187u;
        int i11 = this.f3185s;
        if (j11 != Long.MAX_VALUE && zC) {
            if (i11 != 0) {
                long j12 = j10 + 900000;
                if (j11 < j12) {
                    return j12;
                }
            }
            return j11;
        }
        if (z10) {
            t6.a aVar = t6.a.f27987b;
            long j13 = this.f3179m;
            long jScalb = backoffPolicy == aVar ? j13 * i10 : (long) Math.scalb(j13, i10 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        long j14 = this.f3173g;
        if (!zC) {
            if (j10 == -1) {
                return Long.MAX_VALUE;
            }
            return j10 + j14;
        }
        long j15 = this.f3174h;
        long j16 = i11 == 0 ? j10 + j14 : j10 + j15;
        long j17 = this.f3175i;
        return (j17 == j15 || i11 != 0) ? j16 : (j15 - j17) + j16;
    }

    public final boolean b() {
        return !r.a(e.f28001j, this.f3176j);
    }

    public final boolean c() {
        return this.f3174h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return r.a(this.f3167a, workSpec.f3167a) && this.f3168b == workSpec.f3168b && r.a(this.f3169c, workSpec.f3169c) && r.a(this.f3170d, workSpec.f3170d) && r.a(this.f3171e, workSpec.f3171e) && r.a(this.f3172f, workSpec.f3172f) && this.f3173g == workSpec.f3173g && this.f3174h == workSpec.f3174h && this.f3175i == workSpec.f3175i && r.a(this.f3176j, workSpec.f3176j) && this.f3177k == workSpec.f3177k && this.f3178l == workSpec.f3178l && this.f3179m == workSpec.f3179m && this.f3180n == workSpec.f3180n && this.f3181o == workSpec.f3181o && this.f3182p == workSpec.f3182p && this.f3183q == workSpec.f3183q && this.f3184r == workSpec.f3184r && this.f3185s == workSpec.f3185s && this.f3186t == workSpec.f3186t && this.f3187u == workSpec.f3187u && this.f3188v == workSpec.f3188v && this.f3189w == workSpec.f3189w && r.a(this.f3190x, workSpec.f3190x);
    }

    public final int hashCode() {
        int iA = a1.a(this.f3189w, a1.a(this.f3188v, e2.a(a1.a(this.f3186t, a1.a(this.f3185s, (this.f3184r.hashCode() + o2.a(e2.a(e2.a(e2.a(e2.a((this.f3178l.hashCode() + a1.a(this.f3177k, (this.f3176j.hashCode() + e2.a(e2.a(e2.a((this.f3172f.hashCode() + ((this.f3171e.hashCode() + k.a(k.a((this.f3168b.hashCode() + (this.f3167a.hashCode() * 31)) * 31, 31, this.f3169c), 31, this.f3170d)) * 31)) * 31, 31, this.f3173g), 31, this.f3174h), 31, this.f3175i)) * 31, 31)) * 31, 31, this.f3179m), 31, this.f3180n), 31, this.f3181o), 31, this.f3182p), 31, this.f3183q)) * 31, 31), 31), 31, this.f3187u), 31), 31);
        String str = this.f3190x;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return s1.a(new StringBuilder("{WorkSpec: "), this.f3167a, '}');
    }

    public /* synthetic */ WorkSpec(String str, c0 c0Var, String str2, String str3, b bVar, b bVar2, long j10, long j11, long j12, e eVar, int i10, t6.a aVar, long j13, long j14, long j15, long j16, boolean z10, b0 b0Var, int i11, long j17, int i12, int i13, String str4, int i14) {
        this(str, (i14 & 2) != 0 ? c0.f27994a : c0Var, str2, (i14 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i14 & 16) != 0 ? b.f3129b : bVar, (i14 & 32) != 0 ? b.f3129b : bVar2, (i14 & 64) != 0 ? 0L : j10, (i14 & 128) != 0 ? 0L : j11, (i14 & 256) != 0 ? 0L : j12, (i14 & 512) != 0 ? e.f28001j : eVar, (i14 & 1024) != 0 ? 0 : i10, (i14 & 2048) != 0 ? t6.a.f27986a : aVar, (i14 & 4096) != 0 ? 30000L : j13, (i14 & 8192) != 0 ? -1L : j14, (i14 & 16384) == 0 ? j15 : 0L, (32768 & i14) != 0 ? -1L : j16, (65536 & i14) != 0 ? false : z10, (131072 & i14) != 0 ? b0.f27989a : b0Var, (262144 & i14) != 0 ? 0 : i11, 0, (1048576 & i14) != 0 ? Long.MAX_VALUE : j17, (2097152 & i14) != 0 ? 0 : i12, (4194304 & i14) != 0 ? -256 : i13, (i14 & 8388608) != 0 ? null : str4);
    }
}
