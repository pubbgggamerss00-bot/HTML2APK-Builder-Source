package s5;

import android.os.Bundle;
import java.util.Arrays;
import p5.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f24457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24458b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f24459c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f24460d;

    public d(s sVar, int i10) {
        this.f24457a = sVar.f21273f;
        this.f24458b = i10;
        c cVar = sVar.f21275h;
        this.f24459c = cVar.a();
        Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        this.f24460d = bundleA;
        cVar.f24450h.b(bundleA);
    }

    public d(Bundle state) {
        kotlin.jvm.internal.r.e(state, "state");
        this.f24457a = c6.b.g(state, "nav-entry-state:id");
        this.f24458b = c6.b.b(state, "nav-entry-state:destination-id");
        this.f24459c = c6.b.f(state, "nav-entry-state:args");
        this.f24460d = c6.b.f(state, "nav-entry-state:saved-state");
    }
}
