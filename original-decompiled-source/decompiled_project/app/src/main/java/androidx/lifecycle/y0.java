package androidx.lifecycle;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;

/* loaded from: classes.dex */
public final class y0<VM extends w0> implements pg.j<VM> {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.h f2376a;

    /* renamed from: b, reason: collision with root package name */
    public final PdfEditorActivity.c f2377b;

    /* renamed from: c, reason: collision with root package name */
    public final PdfEditorActivity.b f2378c;

    /* renamed from: d, reason: collision with root package name */
    public final PdfEditorActivity.d f2379d;

    /* renamed from: e, reason: collision with root package name */
    public VM f2380e;

    public y0(kotlin.jvm.internal.h hVar, PdfEditorActivity.c cVar, PdfEditorActivity.b bVar, PdfEditorActivity.d dVar) {
        this.f2376a = hVar;
        this.f2377b = cVar;
        this.f2378c = bVar;
        this.f2379d = dVar;
    }

    @Override // pg.j
    public final Object getValue() {
        VM vm = this.f2380e;
        if (vm != null) {
            return vm;
        }
        a1 store = PdfEditorActivity.this.getViewModelStore();
        z0.c defaultViewModelProviderFactory = PdfEditorActivity.this.getDefaultViewModelProviderFactory();
        j5.a extras = PdfEditorActivity.this.getDefaultViewModelCreationExtras();
        kotlin.jvm.internal.r.e(store, "store");
        kotlin.jvm.internal.r.e(extras, "extras");
        j5.f fVar = new j5.f(store, defaultViewModelProviderFactory, extras);
        kotlin.jvm.internal.h hVar = this.f2376a;
        String strA = hVar.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        VM vm2 = (VM) fVar.a(hVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        this.f2380e = vm2;
        return vm2;
    }
}
