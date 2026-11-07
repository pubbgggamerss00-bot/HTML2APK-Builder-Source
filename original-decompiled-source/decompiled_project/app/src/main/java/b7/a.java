package b7;

import androidx.work.impl.model.WorkSpec;
import c7.i0;
import u6.r;
import u6.z0;
import y6.n;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3654b;

    public a(b bVar, String str) {
        this.f3654b = bVar;
        this.f3653a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WorkSpec workSpec;
        r rVar = this.f3654b.f3656a.f29341f;
        String str = this.f3653a;
        synchronized (rVar.f29326k) {
            try {
                z0 z0VarC = rVar.c(str);
                workSpec = z0VarC != null ? z0VarC.f29365a : null;
            } finally {
            }
        }
        if (workSpec == null || !workSpec.b()) {
            return;
        }
        synchronized (this.f3654b.f3658c) {
            this.f3654b.f3661f.put(i0.a(workSpec), workSpec);
            b bVar = this.f3654b;
            this.f3654b.f3662g.put(i0.a(workSpec), n.a(bVar.f3663h, workSpec, bVar.f3657b.a(), this.f3654b));
        }
    }
}
