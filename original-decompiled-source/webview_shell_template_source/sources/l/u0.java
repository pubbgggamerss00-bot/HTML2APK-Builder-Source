package l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13731a;

    /* renamed from: b, reason: collision with root package name */
    public int f13732b;

    /* renamed from: c, reason: collision with root package name */
    public int f13733c;

    /* renamed from: d, reason: collision with root package name */
    public int f13734d;

    /* renamed from: e, reason: collision with root package name */
    public int f13735e;

    /* renamed from: f, reason: collision with root package name */
    public int f13736f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13737g;
    public boolean h;

    public final void a(int i6, int i7) {
        this.f13733c = i6;
        this.f13734d = i7;
        this.h = true;
        if (this.f13737g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f13731a = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f13732b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f13731a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f13732b = i7;
        }
    }
}
