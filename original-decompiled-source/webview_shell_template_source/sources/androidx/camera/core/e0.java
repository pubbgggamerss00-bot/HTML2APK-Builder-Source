package androidx.camera.core;

import com.htmltoapk.template.PdfActivity;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements b.c, p5.l {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f506t;

    public /* synthetic */ e0(String str, Object obj) {
        this.f506t = obj;
        this.s = str;
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return SurfaceRequest.lambda$new$1((AtomicReference) this.f506t, this.s, aVar);
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        return PdfActivity.onCreate$lambda$3((PdfActivity) this.f506t, this.s, (File) obj);
    }
}
