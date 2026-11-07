package f8;

import android.os.Bundle;
import androidx.lifecycle.z0;
import com.basitce.htmltoapk.MainActivity;

/* loaded from: classes.dex */
public abstract class h extends b.k implements mg.b {
    private volatile jg.a componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private jg.e savedStateHandleHolder;

    public class a implements d.b {
        public a() {
        }

        @Override // d.b
        public final void a(b.k kVar) {
            h.this.inject();
        }
    }

    public h() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof mg.b) {
            jg.e eVarB = m85componentManager().b();
            this.savedStateHandleHolder = eVarB;
            if (eVarB.f15734a == null) {
                eVarB.f15734a = getDefaultViewModelCreationExtras();
            }
        }
    }

    public jg.a createComponentManager() {
        return new jg.a(this);
    }

    @Override // mg.b
    public final Object generatedComponent() {
        return m85componentManager().generatedComponent();
    }

    @Override // b.k, androidx.lifecycle.i
    public z0.c getDefaultViewModelProviderFactory() {
        return ig.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((t) generatedComponent()).d((MainActivity) this);
    }

    @Override // b.k, o3.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jg.e eVar = this.savedStateHandleHolder;
        if (eVar != null) {
            eVar.f15734a = null;
        }
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final jg.a m85componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public h(int i10) {
        super(i10);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
