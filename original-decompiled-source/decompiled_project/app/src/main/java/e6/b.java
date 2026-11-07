package e6;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c6.e;
import f9.z0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f8390b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8393e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f8394f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8395g;

    /* renamed from: c, reason: collision with root package name */
    public final c f8391c = new c();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8392d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f8396h = true;

    public b(e eVar, z0 z0Var) {
        this.f8389a = eVar;
        this.f8390b = z0Var;
    }

    public final void a() {
        e eVar = this.f8389a;
        if (eVar.getLifecycle().b() != l.b.f2320b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f8393e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f8390b.invoke();
        eVar.getLifecycle().a(new r() { // from class: e6.a
            @Override // androidx.lifecycle.r
            public final void l(t tVar, l.a aVar) {
                l.a aVar2 = l.a.ON_START;
                b bVar = this.f8388a;
                if (aVar == aVar2) {
                    bVar.f8396h = true;
                } else if (aVar == l.a.ON_STOP) {
                    bVar.f8396h = false;
                }
            }
        });
        this.f8393e = true;
    }
}
