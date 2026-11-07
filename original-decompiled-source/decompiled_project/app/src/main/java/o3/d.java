package o3;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.lang.reflect.Field;
import p.b1;
import y3.q0;

/* loaded from: classes.dex */
public class d extends Activity implements t, y3.j {
    private final b1<Class<? extends a>, a> extraDataMap = new b1<>(0);
    private final v lifecycleRegistry = new v(this);

    @pg.d
    public static class a {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
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
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (!str.equals("--autofill")) {
                    }
                    break;
            }
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.r.e(event, "event");
        kotlin.jvm.internal.r.d(getWindow().getDecorView(), "getDecorView(...)");
        Field field = q0.f33885a;
        return superDispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.r.e(event, "event");
        kotlin.jvm.internal.r.d(getWindow().getDecorView(), "getDecorView(...)");
        Field field = q0.f33885a;
        return super.dispatchKeyShortcutEvent(event);
    }

    @pg.d
    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.r.e(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    public androidx.lifecycle.l getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = j0.f2313b;
        j0.a.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.r.e(outState, "outState");
        this.lifecycleRegistry.h(l.b.f2321c);
        super.onSaveInstanceState(outState);
    }

    @pg.d
    public void putExtraData(a extraData) {
        kotlin.jvm.internal.r.e(extraData, "extraData");
        this.extraDataMap.put(a.class, extraData);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // y3.j
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.r.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
