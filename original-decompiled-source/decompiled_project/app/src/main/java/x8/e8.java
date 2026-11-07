package x8;

import java.io.File;

/* loaded from: classes.dex */
public final class e8 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f32578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<File> f32579b;

    public e8(File file, x0.n1<File> n1Var) {
        this.f32578a = file;
        this.f32579b = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f32579b.setValue(this.f32578a);
        return pg.f0.f21461a;
    }
}
