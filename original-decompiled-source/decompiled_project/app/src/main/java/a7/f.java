package a7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t6.s;

/* loaded from: classes.dex */
public abstract class f<T> extends i<T> {

    /* renamed from: f, reason: collision with root package name */
    public final e f83f;

    public f(Context context, e7.c cVar) {
        super(context, cVar);
        this.f83f = new e(this);
    }

    @Override // a7.i
    public final void c() {
        s.d().a(g.f84a, getClass().getSimpleName().concat(": registering receiver"));
        this.f88b.registerReceiver(this.f83f, e());
    }

    @Override // a7.i
    public final void d() {
        s.d().a(g.f84a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f88b.unregisterReceiver(this.f83f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
