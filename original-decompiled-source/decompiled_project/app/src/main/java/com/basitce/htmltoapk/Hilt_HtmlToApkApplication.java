package com.basitce.htmltoapk;

import android.app.Application;
import f8.i;
import jg.d;

/* loaded from: classes.dex */
public abstract class Hilt_HtmlToApkApplication extends Application implements mg.b {
    private boolean injected = false;
    private final d componentManager = new d(new a());

    public class a {
        public a() {
        }
    }

    @Override // mg.b
    public final Object generatedComponent() {
        return m68componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((i) generatedComponent()).getClass();
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final d m68componentManager() {
        return this.componentManager;
    }
}
