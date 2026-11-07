package s4;

import java.io.File;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f24322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(File file) {
        super(0);
        this.f24322a = file;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object obj = n0.f24341e;
        File file = this.f24322a;
        synchronized (obj) {
            n0.f24340d.remove(file.getAbsolutePath());
        }
        return pg.f0.f21461a;
    }
}
