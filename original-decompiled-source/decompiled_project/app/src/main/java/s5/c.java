package s5;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.w0;
import java.util.Arrays;
import kotlin.jvm.internal.h0;
import p5.k0;
import p5.s;
import p5.z0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f24443a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f24444b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f24445c;

    /* renamed from: d, reason: collision with root package name */
    public l.b f24446d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f24447e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24448f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f24449g;

    /* renamed from: h, reason: collision with root package name */
    public final c6.d f24450h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24451i;

    /* renamed from: j, reason: collision with root package name */
    public final v f24452j;

    /* renamed from: k, reason: collision with root package name */
    public l.b f24453k;

    /* renamed from: l, reason: collision with root package name */
    public final s0 f24454l;

    /* renamed from: m, reason: collision with root package name */
    public final pg.s f24455m;

    public static final class a extends w0 {

        /* renamed from: b, reason: collision with root package name */
        public final l0 f24456b;

        public a(l0 handle) {
            kotlin.jvm.internal.r.e(handle, "handle");
            this.f24456b = handle;
        }
    }

    public c(s sVar) {
        this.f24443a = sVar;
        this.f24444b = sVar.f21269b;
        this.f24445c = sVar.f21270c;
        this.f24446d = sVar.f21271d;
        this.f24447e = sVar.f21272e;
        this.f24448f = sVar.f21273f;
        this.f24449g = sVar.f21274g;
        this.f24450h = new c6.d(new e6.b(sVar, new f9.z0(sVar, 2)));
        pg.s sVarB = e9.w0.b(new j9.p(2));
        this.f24452j = new v(sVar);
        this.f24453k = l.b.f2320b;
        this.f24454l = (s0) sVarB.getValue();
        this.f24455m = e9.w0.b(new kotlinx.serialization.json.j(1));
    }

    public final Bundle a() {
        Bundle bundle = this.f24445c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        bundleA.putAll(bundle);
        return bundleA;
    }

    public final void b() {
        if (!this.f24451i) {
            c6.d dVar = this.f24450h;
            dVar.f4995a.a();
            this.f24451i = true;
            if (this.f24447e != null) {
                o0.b(this.f24443a);
            }
            dVar.a(this.f24449g);
        }
        int iOrdinal = this.f24446d.ordinal();
        int iOrdinal2 = this.f24453k.ordinal();
        v vVar = this.f24452j;
        if (iOrdinal < iOrdinal2) {
            vVar.h(this.f24446d);
        } else {
            vVar.h(this.f24453k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h0.a(s.class).e());
        sb.append("(" + this.f24448f + ')');
        sb.append(" destination=");
        sb.append(this.f24444b);
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
