package androidx.camera.core;

import android.os.Handler;
import androidx.activity.ComponentActivity;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements b.c, p5.l {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f512t;

    public /* synthetic */ f0(String str, Object obj) {
        this.f512t = obj;
        this.s = str;
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return SurfaceRequest.lambda$new$2((AtomicReference) this.f512t, this.s, aVar);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        ComponentActivity componentActivity = (ComponentActivity) this.f512t;
        File file = (File) obj;
        kotlin.jvm.internal.j.e("it", file);
        Handler handler = w2.y.f15051a;
        new Thread(new androidx.emoji2.text.h(componentActivity, this.s, file, 1)).start();
        return d5.j.f12745a;
    }
}
