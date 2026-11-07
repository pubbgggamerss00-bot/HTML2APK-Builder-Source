package h9;

import android.content.Context;
import j6.g;
import java.io.File;
import s8.e2;
import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12822b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f12821a = i10;
        this.f12822b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        g.b bVar;
        switch (this.f12821a) {
            case 0:
                p5.x.c(e2.m.f24643c.f24627a, (p5.x) this.f12822b);
                return pg.f0.f21461a;
            case 1:
                j6.g gVar = (j6.g) this.f12822b;
                String str = gVar.f15177b;
                if (str == null || !gVar.f15179d) {
                    bVar = new g.b(gVar.f15176a, gVar.f15177b, new g.a(), gVar.f15178c, gVar.f15180e);
                } else {
                    Context context = gVar.f15176a;
                    kotlin.jvm.internal.r.e(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.r.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    bVar = new g.b(gVar.f15176a, new File(noBackupFilesDir, str).getAbsolutePath(), new g.a(), gVar.f15178c, gVar.f15180e);
                }
                bVar.setWriteAheadLoggingEnabled(gVar.f15182g);
                return bVar;
            default:
                g5.F((x0.n1) this.f12822b, true);
                return pg.f0.f21461a;
        }
    }
}
