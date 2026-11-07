package x7;

import android.view.View;
import android.view.ViewTreeObserver;
import pg.f0;

/* loaded from: classes.dex */
public final class j implements eh.l<Throwable, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<View> f32202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f32203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f32204c;

    public j(l<View> lVar, ViewTreeObserver viewTreeObserver, k kVar) {
        this.f32202a = lVar;
        this.f32203b = viewTreeObserver;
        this.f32204c = kVar;
    }

    @Override // eh.l
    public final f0 invoke(Throwable th2) {
        this.f32202a.j(this.f32203b, this.f32204c);
        return f0.f21461a;
    }
}
