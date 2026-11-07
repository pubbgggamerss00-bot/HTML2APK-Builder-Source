package r8;

import android.os.Bundle;
import androidx.lifecycle.z0;
import b.k;
import com.basitce.htmltoapk.ui.crop.CropActivity;

/* loaded from: classes.dex */
public abstract class e extends k implements mg.b {

    /* renamed from: a, reason: collision with root package name */
    public jg.e f23249a;

    /* renamed from: b, reason: collision with root package name */
    public volatile jg.a f23250b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23251c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f23252d = false;

    public e() {
        addOnContextAvailableListener(new d((CropActivity) this));
    }

    public final jg.a componentManager() {
        if (this.f23250b == null) {
            synchronized (this.f23251c) {
                try {
                    if (this.f23250b == null) {
                        this.f23250b = new jg.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f23250b;
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
            this.f23249a = eVarB;
            if (eVarB.f15734a == null) {
                eVarB.f15734a = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        jg.e eVar = this.f23249a;
        if (eVar != null) {
            eVar.f15734a = null;
        }
    }
}
