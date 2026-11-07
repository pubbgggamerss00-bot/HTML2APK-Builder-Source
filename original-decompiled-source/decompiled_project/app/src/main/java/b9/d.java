package b9;

import android.os.Bundle;
import androidx.lifecycle.z0;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;

/* loaded from: classes.dex */
public abstract class d extends b.k implements mg.b {

    /* renamed from: a, reason: collision with root package name */
    public jg.e f3780a;

    /* renamed from: b, reason: collision with root package name */
    public volatile jg.a f3781b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3782c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f3783d = false;

    public d() {
        addOnContextAvailableListener(new c((PdfPreviewActivity) this));
    }

    public final jg.a componentManager() {
        if (this.f3781b == null) {
            synchronized (this.f3782c) {
                try {
                    if (this.f3781b == null) {
                        this.f3781b = new jg.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f3781b;
    }

    @Override // mg.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // b.k, androidx.lifecycle.i
    public final z0.c getDefaultViewModelProviderFactory() {
        return ig.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // b.k, o3.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof mg.b) {
            jg.e eVarB = componentManager().b();
            this.f3780a = eVarB;
            if (eVarB.f15734a == null) {
                eVarB.f15734a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jg.e eVar = this.f3780a;
        if (eVar != null) {
            eVar.f15734a = null;
        }
    }
}
