package x7;

import android.view.View;
import android.view.ViewTreeObserver;
import ph.m;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<View> f32206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f32207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f32208d;

    public k(l lVar, ViewTreeObserver viewTreeObserver, m mVar) {
        this.f32206b = lVar;
        this.f32207c = viewTreeObserver;
        this.f32208d = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        l<View> lVar = this.f32206b;
        h size = lVar.getSize();
        if (size != null) {
            lVar.j(this.f32207c, this);
            if (!this.f32205a) {
                this.f32205a = true;
                this.f32208d.resumeWith(size);
            }
        }
        return true;
    }
}
