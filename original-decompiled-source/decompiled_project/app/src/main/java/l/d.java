package l;

import l.c;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.d f16494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.menu.a f16496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.C0165c f16497d;

    public d(c.C0165c c0165c, c.d dVar, f fVar, androidx.appcompat.view.menu.a aVar) {
        this.f16497d = c0165c;
        this.f16494a = dVar;
        this.f16495b = fVar;
        this.f16496c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = c.this;
        c.d dVar = this.f16494a;
        if (dVar != null) {
            cVar.C = true;
            dVar.f16492b.c(false);
            cVar.C = false;
        }
        f fVar = this.f16495b;
        if (fVar.isEnabled() && fVar.hasSubMenu()) {
            this.f16496c.p(fVar, null, 4);
        }
    }
}
