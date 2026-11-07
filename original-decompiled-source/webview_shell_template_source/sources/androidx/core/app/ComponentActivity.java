package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import kotlin.jvm.internal.j;
import u0.f;
import w.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements m, f.a {
    private final g<Class<? extends a>, a> extraDataMap = new g<>(0);
    private final n lifecycleRegistry = new n(this);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                case 1455016274:
                    return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        j.d("window.decorView", decorView);
        if (f.a(decorView, keyEvent)) {
            return true;
        }
        return f.b(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        j.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        j.d("window.decorView", decorView);
        if (f.a(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> cls) {
        j.e("extraDataClass", cls);
        return (T) this.extraDataMap.get(cls);
    }

    public h getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i6 = w.f1337t;
        w.a.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        j.e("outState", bundle);
        this.lifecycleRegistry.h();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(a aVar) {
        j.e("extraData", aVar);
        this.extraDataMap.put(a.class, aVar);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // u0.f.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        j.e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
