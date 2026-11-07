package c9;

import android.os.Bundle;
import androidx.lifecycle.z0;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;

/* loaded from: classes.dex */
public abstract class d extends b.k implements mg.b {

    /* renamed from: a, reason: collision with root package name */
    public jg.e f5076a;

    /* renamed from: b, reason: collision with root package name */
    public volatile jg.a f5077b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5078c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5079d = false;

    public d() {
        addOnContextAvailableListener(new c((PdfEditorActivity) this));
    }

    public final jg.a componentManager() {
        if (this.f5077b == null) {
            synchronized (this.f5078c) {
                try {
                    if (this.f5077b == null) {
                        this.f5077b = new jg.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f5077b;
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
            this.f5076a = eVarB;
            if (eVarB.f15734a == null) {
                eVarB.f15734a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        jg.e eVar = this.f5076a;
        if (eVar != null) {
            eVar.f15734a = null;
        }
    }
}
