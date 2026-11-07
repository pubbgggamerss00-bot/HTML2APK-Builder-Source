package m0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17365b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.v f17366c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17367d;

    /* renamed from: e, reason: collision with root package name */
    public final z f17368e;

    /* renamed from: f, reason: collision with root package name */
    public final s1 f17369f;

    /* renamed from: g, reason: collision with root package name */
    public final p.a0 f17370g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17371h;

    /* renamed from: i, reason: collision with root package name */
    public int f17372i;

    /* renamed from: j, reason: collision with root package name */
    public int f17373j;

    /* renamed from: k, reason: collision with root package name */
    public int f17374k;

    public j1(long j10, long j11, g2.v vVar, boolean z10, z zVar, s1 s1Var) {
        this.f17364a = j10;
        this.f17365b = j11;
        this.f17366c = vVar;
        this.f17367d = z10;
        this.f17368e = zVar;
        this.f17369f = s1Var;
        int i10 = p.m.f20675a;
        this.f17370g = new p.a0(6);
        this.f17371h = new ArrayList();
        this.f17372i = -1;
        this.f17373j = -1;
        this.f17374k = -1;
    }

    public final int a(int i10, o oVar, o oVar2) {
        if (i10 == -1) {
            int iOrdinal = l1.b(oVar, oVar2).ordinal();
            if (iOrdinal == 0) {
                return this.f17374k - 1;
            }
            if (iOrdinal == 1) {
                return this.f17374k;
            }
            if (iOrdinal != 2) {
                throw new pg.l();
            }
        }
        return i10;
    }
}
